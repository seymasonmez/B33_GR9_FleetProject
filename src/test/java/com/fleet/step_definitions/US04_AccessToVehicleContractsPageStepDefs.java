package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.DashboardPage;
import com.fleet.pages.VehicleContractsPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class US04_AccessToVehicleContractsPageStepDefs extends BasePage {
    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();

    @When("user hover mouse on Fleet Tab and click on Vehicle Contracts")
    public void userHoverMouseOnFleetTabAndClickOnVehicleContracts() {
        String FleetTab = "Fleet";
        String VehicleContracts = "Vehicle Contracts";

        navigateToModule(FleetTab,VehicleContracts);

    }

    @Then("user should be at expected Url")
    public void userShouldBeAtExpectedUrl() {
        // String expectedUrl ="Expected URL: https://qa.transmuda.com/entity/Extend_Entity_VehicleContract";
        BrowserUtils.verifyURLContains("Extend_Entity_VehicleContract");
    }

    @Then("user should see the error message")
    public void userShouldSeeTheErrorMessage() {
        BrowserUtils.verifyElementDisplayed(vehicleContractsPage.errorMessage);
    }


}
