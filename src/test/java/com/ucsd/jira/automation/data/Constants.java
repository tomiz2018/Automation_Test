package com.ucsd.jira.automation.data;

public final class Constants {

    // Application Defaults
    public static final byte[] SECURITY_KEY = {0x74, 0x68, 0x69, 0x73, 0x49, 0x73, 0x41, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79};
    public static final int MAX_WEB_SERVICE_RESPONSE_TIME = 3000;

    // COMMON URLs
    public static final String HOME_URL = "/MyJiraHome.jspa";

    // HEADING Elements
    public static final String LOGO_HEADING = "//h1[@id='logo']";
    public static final String TEST_HEADING = "//*[@id=\"createGlobalItem\"]/span";
    public static final String NEW_TEST_HEADING = "//*[@id=\"dashboard-content\"]/div[1]/div/div[1]/h1";

    // ANCHOR Elements
    public static final String FIRST_PROJECTS_ANCHOR = "//img[contains(@src, 'projectavatar')]/following-sibling::a";

    // INPUT Elements
    public static final String USERNAME_INPUT = "//input[@id='username']";
    public static final String PASSWORD_INPUT = "//input[@id='password']";
    public static final String BASIC_SEARCH_INPUT = "//input[@type='text' and @placeholder='Search']";

    // BUTTON Elements
    public static final String ADVANCED_SEARCH_TEXTAREA = "advanced-search";

    // HEADING Elements
    public static final String VARIABLE_BY_TEXT_HEADING = "//h1[text()='%s']";

    // SPAN Elements
    public static final String VARIABLE_BY_LABEL_SPAN = "//span[contains(@aria-label, '%s')]";
    public static final String VARIABLE_BY_TEXT_SPAN = "//span[text()='%s']";
    public static final String CONTINUE_SPAN = "Continue";
    public static final String LOGIN_SPAN = "Log in";
    public static final String CLOSE_MENU_EXPAND_SPAN = "//span[@aria-label='Close']";
    public static final String VIEW_ALL_MATCHING_ISSUES_SPAN = "//span[text()='View all matching issues']";

    // STATIC Text
    public static final String NO_RECORDS_FOUND_TEXT = "No records found, try new search criteria.";

    //DIV Elements
    public static final String VARIABLE_BY_TEXT_DIV = "//div[text()='%s']";
    public static final String ISSUES_SEARCH_PREVIEW_DIV = "//div[@aria-label='Issues']";
    public static final String BOARDS_SEARCH_PREVIEW_DIV = "//div[@aria-label='Boards']";
    public static final String PROJECTS_SEARCH_PREVIEW_DIV = "//div[@aria-label='Projects']";

    public static final String ISSUES_AND_FILTERS_DIV = "//*[@id=\"ak-jira-navigation\"]/header/nav/div[2]/div[3]/button/span[1]";

    public static final String DASHBOARD_DIV = "//*[@id=\"ak-jira-navigation\"]/header/nav/div[2]/div[4]/button/span[1]";
    public static final String DASHBOARD_DIV1 = "//*[@id=\"ak-main-content\"]/div/div/div[1]/div[1]/div[2]/div/a/span";


    public static final String PROJECTS_DIV = "//*[@id=\"jira-frontend\"]/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/a/div[2]/div";

    // Create
    public static final String CREATE_BTN = "//*[@id=\"createGlobalItem\"]/span";

    // Your Work Btn //*[@id="ak-jira-navigation"]/header/nav/div[2]/div[1]/button/span[1]
    public static final String WORK_BTN = "//*[@id=\"ak-jira-navigation\"]/header/nav/div[2]/div[1]/button/span[1]";

    // CreateTicketTest constants
    public static final String CREATE_ISSUE = "//*[@id=\"createGlobalItem\"]/span";
    public static final String INPUT_SUMMARY = "//*[@id=\"summary-field\"]";
    public static final String CREATE_JIRA_BTN = "//*[@id=\"jira\"]/div[17]/div[3]/div/div[3]/div[2]/div/div/footer/button/span";
    public static final String PROJECT = "//*[@id=\"ak-jira-navigation\"]/header/nav/div[2]/div[2]/div/button/span[1]";
    public static final String RECENT_PROJECT = "//*[@id=\"jira\"]/div[17]/div[3]/div/span/div/div/div[1]/span/a[1]/span[2]/span[1]";
    public static final String ISSUES = "//*[@id=\"ak-side-navigation\"]/div/div[1]/div/nav/div[2]/div/div/div/div/div[1]/div[1]/div[2]/a[1]/span[2]/span";
    public static final String CREATED_JIRA = "//*[@id=\"ak-main-content\"]/div/div[3]/div[1]/div[2]/a[1]/div[2]";
    public static final String HEADER_ACTION = "//*[@id=\"jira-issue-header-actions\"]/div/div/div[1]/div/div/button/span/span";
    public static final String DELETE_BTN = "//*[@id=\"jira\"]/div[17]/div[4]/div/div/div[2]/div/div/div[4]/span/span/span";
    public static final String DELETE_CONFIRM_BTN = "//*[@id=\"jira\"]/div[17]/div[4]/div/div[3]/div[2]/div/div/footer/div/div/button/span";

    public static final String ALL_PROJECTS = "//*[@id=\"jira\"]/div[17]/div[3]/div/span/div/div/div[2]/span/a/span/span";

    public static final String TARGET_PROJECT = "//*[@id=\"ak-main-content\"]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/a/div/span";
    // Test Search Box
    public static final String SEARCH_BOX = "//*[@id=\"ak-jira-navigation\"]/header/div/div/div/div/div/div/div/div[1]/div/input";

    public static final String SEARCH_BTN = "//*[@id=\"ak-jira-navigation\"]/header/div/div/div/div/div/div/div/div[1]/div/span[2]/span";
    public static final String DROPDOWN = "//*[@id=\"issue-create.ui.modal.create-form.type-picker.issue-type-select\"]/div/div[2]/div";
    //*[@id="issue-create.ui.modal.create-form.type-picker.issue-type-select"]/div
    private Constants() {
    }

}
