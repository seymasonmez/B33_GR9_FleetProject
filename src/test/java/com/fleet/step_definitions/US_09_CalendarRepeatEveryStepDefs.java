package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US_09_CreateCalendarEventPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_09_CalendarRepeatEveryStepDefs extends BasePage {
    US_09_CreateCalendarEventPage createCalendarEventPage = new US_09_CreateCalendarEventPage();
    @Given("user clicks on Calendar Events under Activities tab")
    public void user_clicks_on_calendar_events_under_activities_tab() {

        navigateToModule("Activities","Calendar Events");
    }
    @Given("user clicks on Create Calendar Event tab")
    public void user_clicks_on_create_calendar_event_tab() {
        BrowserUtils.waitFor(3);

        createCalendarEventPage.createCalenderEventBtn.click();
    }
    @Given("checks the Repeat checkbox")
    public void checks_the_repeat_checkbox() {

        BrowserUtils.selectCheckBox(createCalendarEventPage.repeatCheckBox, true);
    }
    @When("user enters less than {int} in the calendar Repeat Every input box")
    public void user_enters_less_than_in_the_calendar_repeat_every_input_box(Integer int1) {


        createCalendarEventPage.repeatEveryNumberBox.sendKeys(Keys.BACK_SPACE+Integer.toString(-1)+ Keys.ENTER);
    }
    @Then("users should see “The value have not to be less than {int}.”")
    public void users_should_see_the_value_have_not_to_be_less_than(Integer int1) {

        createCalendarEventPage.repeatEveryNumberErrorMessage.isDisplayed();
        System.out.println(createCalendarEventPage.repeatEveryNumberErrorMessage.getText());
        Assert.assertEquals("The value have not to be less than 1.", createCalendarEventPage.repeatEveryNumberErrorMessage.getText());

    }
    @When("user enters more than {int} in the calendar Repeat Every input box")
    public void user_enters_more_than_in_the_calendar_repeat_every_input_box(Integer int1) {
      //  CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();
        createCalendarEventPage.repeatEveryNumberBox.sendKeys(Keys.BACK_SPACE+Integer.toString(100)+ Keys.ENTER);
    }
    @Then("users should see “The value have not to be more than {int}.”")
    public void users_should_see_the_value_have_not_to_be_more_than(Integer int1) {
       // CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();
        createCalendarEventPage.repeatEveryNumberErrorMessage.isDisplayed();
        //createCalendarEventPage.repeatEveryNumberErrorMessage.getText();
        System.out.println(createCalendarEventPage.repeatEveryNumberErrorMessage.getText());
        Assert.assertEquals("The value have not to be more than 99.", createCalendarEventPage.repeatEveryNumberErrorMessage.getText());
    }

}
