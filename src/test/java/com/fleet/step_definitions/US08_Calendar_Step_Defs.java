package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US08_Calendar_Events_Page;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_Calendar_Step_Defs extends BasePage {
    US08_Calendar_Events_Page activitiesPage = new US08_Calendar_Events_Page();

    @Given("User navigates to the calendar page")

    public void user_hover_mouse_on_fleet_tab_and_click_on_vehicles_module()
    {
        String tabLocator = "Activities";
        String moduleLocator = "Calendar Events";
        navigateToModule(tabLocator, moduleLocator);
    }

    @Given("the user is creating a new recurring event")
    public void theUserIsCreatingANewRecurringEvent() {
        BrowserUtils.clickWithJS(activitiesPage.CreateCalendarEvent);
        //BrowserUtils.waitFor(3);
        //activitiesPage.CreateCalendarEvent.click();

    }

    @When("user view the Repeat Every input option")
    public void userViewTheRepeatEveryInputOption() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(5);
        BrowserUtils.selectCheckBox(activitiesPage.repeatCheckBox, true);
    }

    @Then("the default value displayed should be {string}")
    public void theDefaultValueDisplayedShouldBe(String string) {
        BrowserUtils.waitFor(3);
        Assert.assertEquals(string, activitiesPage.repeatEveryDays.getAttribute("value"));
    }

    @When("user clear the Repeat Every field")
    public void userClearTheRepeatEveryField() {
        activitiesPage.repeatEveryDays.clear();
    }

    @Then("user should see the error message {string}")
    public void userShouldSeeTheErrorMessage(String message) {
        BrowserUtils.waitFor(3);
        Assert.assertEquals(message, activitiesPage.message.getText());
    }
}

//@Given("they view the Repeat Every input option")
//public void theyViewTheRepeatEveryInputOption() {


//}
    /*
    Given they view the Repeat Every input option
		    #When they view the Repeat Every input option
		    Then the default value displayed should be "1"
     */


//    @Given("the user is creating a new recurring event")
// public void the_user_is_creating_a_new_recurring_event() {
// activitiesPage.Activities.click();
// BrowserUtils.waitFor(10);

//Select calendarEvents = new Select (activitiesPage.Activities);
//calendarEvents.selectByVisibleText("Calendar Events");

//activitiesPage.CalendarEvents.click()

// @Given("they view the Repeat Every input option")
//public void they_view_the_repeat_every_input_option() {
//activitiesPage.CreateCalendarEvent.click();
//BrowserUtils.waitFor(5);


//}
    /*@Then("the default value displayed should be {string}")
    public void the_default_value_displayed_should_be(String string) {

    }

    @And("the Repeat Every input option is visible")
    public void theRepeatEveryInputOptionIsVisible() {
    }

    @When("the user clears the input field")
    public void theUserClearsTheInputField() {
    }

    @Then("an error message {string} should be displayed")
    public void anErrorMessageShouldBeDisplayed(String arg0) {
    }*/
