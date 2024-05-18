package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.VehicleCostsPage;
import com.fleet.pages.VehicleModelPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v122.browser.Browser;

import java.util.List;

public class US_13_StepDefsVehicleCosts extends BasePage {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();


//    @When("when the users click fleet he should see vehicle costs")
//    public void when_the_users_click_fleet_he_should_see_vehicle_costs() {
//
//
//
//    }


    @And("the user navigates to {string} to {string}")
    public void theUserNavigatesToTo(String mainTab, String module) {

        vehicleCostsPage.navigateToModule(mainTab, module);
        BrowserUtils.waitForPageToLoad(15);
        BrowserUtils.sleep(6);

    }
    @Then("user should see three columns under vehicle costs")
    public void user_should_see_columns_under_vehicle_costs(List<String> expectedColumns ) {

        List<String> actualColumnNames = BrowserUtils.getElementsText(vehicleCostsPage.actualColumnNames);

        actualColumnNames.removeIf(p -> p.isEmpty());
        System.out.println("actualColumnNames = " + actualColumnNames);
        Assert.assertEquals(expectedColumns, actualColumnNames);
    }

    @When("the user clicks on vehicle costs module under fleet")
    public void theUserClicksOnVehicleCostsModuleUnderFleet() {

        navigateToModule("Fleet","Vehicle");
    }


    @Then("user click the first checkBox")
    public void userClickTheFirstCheckBox() {

        vehicleCostsPage.checkBox.click();
        BrowserUtils.sleep(3);
    }

    @And("all checkBox should be selected")
    public void allCheckBoxShouldBeSelected() {

        Assert.assertTrue(vehicleCostsPage.allCheckBox.isSelected());


    }
}
