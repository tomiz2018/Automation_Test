package com.ucsd.jira.automation.tests.web.company.jira;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.JiraTestCase;
import org.testng.annotations.Test;

import static com.pwc.logging.service.LoggerService.*;


public class CreateTicketTest extends JiraTestCase {

    public static final String INPUT_TEXT = "This is Shiyu's JIRA Ticket";
    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @Issue("STORY-1234")
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testBasic() {

        FEATURE("Basic Jira Test sneak developer");
        SCENARIO("User logs in and validates basic navigation functionality");

        GIVEN("I am a valid user");
        webElementVisible(Constants.TEST_HEADING); // Start from the homepage

        WHEN("I create a new JIRA");
        webAction(Constants.CREATE_ISSUE); // Click the Create button at the homepage
        webAction(Constants.INPUT_SUMMARY, INPUT_TEXT); // Input the subject line of the ticket
        webAction(Constants.CREATE_JIRA_BTN); // Click the create button
        redirect(Constants.HOME_URL); // Then go back the homepage

        THEN("Check if the JIRA ticket is available and delete it");
        webAction(Constants.PROJECT); // Click the Project page
        webAction(Constants.ALL_PROJECTS);// Click the All Projects tab
        webAction(Constants.TARGET_PROJECT); // Click the target project
        webAction(Constants.ISSUES); // Click the issue tab
        waitForTextToDisplay(INPUT_TEXT); // Confirm the ticket existing
        webAction(Constants.CREATED_JIRA); // Click the ticket
        webAction(Constants.HEADER_ACTION); // Click the three dots menu
        webAction(Constants.DELETE_BTN); // Click the delete button
        webAction(Constants.DELETE_CONFIRM_BTN); // Confirm the delete action by clicking the new delete button
        redirect(Constants.HOME_URL); // Go back to the homepage

    }

}
