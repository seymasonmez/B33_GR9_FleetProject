package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.DashboardPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class US02_OroincDocumentationPageStepDefs extends BasePage {

    DashboardPage dashboardPage = new DashboardPage();
    @When("the user locate and click the question mark icon")
    public void the_user_locate_and_click_the_question_mark_icon() {

        dashboardPage.QuestionMarkIcon.click();

    }
    @When("the user should be redirected to the Oroinc Documentation page")
    public void the_user_should_be_redirected_to_the_oroinc_documentation_page() {

        // Switch to the new window
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String handle : windowHandles) {
                Driver.getDriver().switchTo().window(handle);
            }
    }
    @Then("the user verify actual title as Oroinc Documentation page")
    public void the_user_verify_actual_title_as_oroinc_documentation_page() {

        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedOroincURL = "https://doc.oroinc.com/";

        Assert.assertEquals(expectedOroincURL, actualURL);
    }

}
