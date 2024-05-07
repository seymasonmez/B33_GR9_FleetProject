package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.CalenderEventPage;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_StepDefs extends BasePage {

    CalenderEventPage calenderEventPage = new CalenderEventPage();

    @Given("Given the user logged in as {string}")
    public void given_the_user_logged_in_as(String userType) {
        calenderEventPage.loginByUserType(userType);
    }
    @Given("I am on the Calendar Events page")
    public void i_am_on_the_calendar_events_page() {
        navigateToModule("Activities","Calendar Events");

    }
    @When("I click on the Create Calender Event")
    public void i_click_on_the_create_calender_event() {
        calenderEventPage.createCalenderEventBtn.click();
    }
    @When("I type {string} into the Description field")
    public void i_type_into_the_description_field(String userTyping) {
        Driver.getDriver().switchTo().frame(calenderEventPage.iframeForDescriptionField);
        calenderEventPage.descriptionFieldInIframe.sendKeys(userTyping);
    }
    @When("I click repeat checkbox")
    public void i_click_repeat_checkbox() {
        BrowserUtils.selectCheckBox(calenderEventPage.repeatCheckBox,true);
    }
    @Then("the text {string} should be visible in the Description field")
    public void the_text_should_be_visible_in_the_description_field(String expectedOutput) {

        Assert.assertEquals(expectedOutput,calenderEventPage.verifyVisibilityOfWrittenText.getText());
        Driver.getDriver().switchTo().parentFrame();

    }
}
