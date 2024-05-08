package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.FleetVehiclesPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US06_EditCarInfoIconStepDefs extends BasePage {

    FleetVehiclesPage fvPage = new FleetVehiclesPage();

    @When("user hover mouse on Fleet Tab and click on Vehicles Module")
    public void user_hover_mouse_on_fleet_tab_and_click_on_vehicles_module() {
        String tabLocator = "Fleet";
        String moduleLocator = "Vehicles";

        navigateToModule(tabLocator,moduleLocator);

    }
    @When("user hover mouse over the three dots")
    public void user_hover_mouse_over_the_dots() {
        BrowserUtils.hover(fvPage.dotsIcon);


    }
    @Then("user verifies View, Edit and Delete options are displayed")
    public void user_verifies_options_are_displayed() {


        Assert.assertTrue("View Icon is not displayed", fvPage.viewIcon.isDisplayed());
        Assert.assertTrue("Edit Icon is not displayed", fvPage.editIcon.isDisplayed());
        Assert.assertTrue("Delete Icon is not displayed", fvPage.deleteIcon.isDisplayed());

    }

}
