package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US07_VehiclesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US07_SelectAnyVehicleDefs extends BasePage {

    US07_VehiclesPage vehiclesPage = new US07_VehiclesPage();

    @When("User navigates to the Vehicles page")
    public void user_navigates_to_the_vehicles_page() {
        String tabLocator = "Fleet";
        String moduleLocator = "Vehicles";

        navigateToModule(tabLocator, moduleLocator);
    }

    @When("User views the checkboxes on the page")
    public void user_views_the_checkboxes_on_the_page() {
        System.out.println("User views " + vehiclesPage.checkboxes.size() + " checkboxes");
    }

    @Then("All checkboxes unchecked state. No checkbox is pre-selected:")
    public void all_checkboxes_unchecked_state_no_checkbox_is_pre_selected() {

       // BrowserUtils.waitFor(3);
        for (WebElement each : vehiclesPage.checkboxes) {
            //Assert.assertTrue(!each.isSelected());
            Assert.assertTrue("Some checkboxes checked state",!each.isSelected());
        }
    }

    @When("User locates the first checkbox. User clicks the first checkbox.")
    public void userLocatesTheFirstCheckboxUserClicksTheFirstCheckbox() {
        vehiclesPage.firstCheckbox.click();
    }

    @Then("User can verify that all cars are selected.")
    public void userCanVerifyThatAllCarsAreSelected() {
        for (WebElement each : vehiclesPage.checkboxes) {
            //Assert.assertTrue(!each.isSelected());
            Assert.assertTrue("Not Select All Cars",each.isSelected());
        }
    }

    @When("User locates the any checkbox. User clicks the any checkbox.")
    public void user_locates_the_any_checkbox_user_clicks_the_any_checkbox() {
        for (WebElement each : vehiclesPage.checkboxes) {
            each.click();
            Assert.assertTrue("Not Select All Cars",each.isSelected());
        }
    }
    @Then("The user can see that car are selected.")
    public void the_user_can_see_that_car_are_selected() {

    }


}


