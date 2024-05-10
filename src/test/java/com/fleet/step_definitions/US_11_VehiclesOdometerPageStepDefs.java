package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.VehiclesOdometerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_11_VehiclesOdometerPageStepDefs extends BasePage {

    VehiclesOdometerPage vehiclesOdometerPage = new VehiclesOdometerPage();

    @When("the user clicks to the Fleet module")
    public void the_user_clicks_to_the_fleet_module() {
        vehiclesOdometerPage.fleetModule.click();
    }

    @When("the user clicks to the Vehicle Odometer module under the Fleet module")
    public void the_user_clicks_to_the_vehicle_odometer_module_under_the_fleet_module() {
        navigateToModule("Fleet", "Vehicle Odometer");

    }

    @Then("the user should see the error message “You do not have permission to perform this action.”")
    public void the_user_should_see_the_error_message_you_do_not_have_permission_to_perform_this_action() {
        Assert.assertTrue("Error message is NOT displayed!", vehiclesOdometerPage.errorMessage.isDisplayed());

    }

    @Then("the user verifies that they see the default page as {string}.")
    public void the_user_verifies_that_they_see_the_default_page_as(String one) {
        Assert.assertEquals(one, vehiclesOdometerPage.page.getAttribute("value"));
    }

    @Then("the user verifies that they see the View Per Page as {string} by default.")
    public void the_user_verifies_that_they_see_the_view_per_page_as_by_default(String twentyfive) {
        Assert.assertEquals(twentyfive, vehiclesOdometerPage.viewPerPageButton.getText());

    }
}





