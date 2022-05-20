package com.ucsd.jira.automation.tests.web.company.jira;

import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.command.WebServiceCommand;
import com.pwc.core.framework.listeners.Retry;
import com.ucsd.jira.automation.data.Constants;
import com.ucsd.jira.automation.data.enums.LeftMenu;
import com.ucsd.jira.automation.frameworksupport.Groups;
import com.ucsd.jira.automation.frameworksupport.JiraTestCase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.pwc.logging.service.LoggerService.FEATURE;
import static com.pwc.logging.service.LoggerService.GIVEN;
import static com.pwc.logging.service.LoggerService.SCENARIO;
import static com.pwc.logging.service.LoggerService.THEN;
import static com.pwc.logging.service.LoggerService.WHEN;

import org.openqa.selenium.WebElement;
public class BasicTest extends JiraTestCase {

    public static final String SEARCH_TEXT = "As a member";

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
        webElementVisible(Constants.TEST_HEADING);

        WHEN("I navigate with the left menu");
        webAction(Constants.SEARCH_BOX, SEARCH_TEXT);
        //(Keys.ENTER));
        waitForTextToDisplay(SEARCH_TEXT);

//        THEN("The expected pages are displayed");
//        webAction(Constants.WORK_BTN);
//        //*[@id="issue-create.ui.modal.create-form.type-picker.issue-type-select"]/div/div[2]/div
//        redirect(Constants.HOME_URL);

    }

}
