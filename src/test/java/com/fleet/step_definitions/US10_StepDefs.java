package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US_09_US_10_CreateCalendarEventPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_StepDefs extends BasePage {

    US_09_US_10_CreateCalendarEventPage createCalendarEventPage = new US_09_US_10_CreateCalendarEventPage();


    @Given("I am on the Calendar Events page")
    public void i_am_on_the_calendar_events_page() {
        navigateToModule("Activities","Calendar Events");

    }
    @When("I click on the Create Calender Event")
    public void i_click_on_the_create_calender_event() {
        BrowserUtils.waitFor(3);
        createCalendarEventPage.createCalendarEventBtn.click();
    }
    @When("I type {string} into the Description field")
    public void i_type_into_the_description_field(String userTyping) {
        Driver.getDriver().switchTo().frame(createCalendarEventPage.iframeForDescriptionField);
        createCalendarEventPage.descriptionFieldInIframe.sendKeys(userTyping);
    }
    @When("I click repeat checkbox")
    public void i_click_repeat_checkbox() {
        BrowserUtils.selectCheckBox(createCalendarEventPage.repeatCheckBox,true);
    }
    @Then("the text {string} should be visible in the Description field")
    public void the_text_should_be_visible_in_the_description_field(String expectedOutput) {

        Assert.assertEquals(expectedOutput,createCalendarEventPage.verifyVisibilityOfWrittenText.getText());
        Driver.getDriver().switchTo().parentFrame();

    }
}
