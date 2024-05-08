package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.VehicleModelPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class US05_VehiclesModelpageStep {


    @Given("User is logged in as {string}")
    public void user_is_logged_in_as(String userType) {
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("driver")) {
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        } else if (userType.equalsIgnoreCase("store manager")) {
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }

        new LoginPage().login(username, password);
    }

    @When("User navigates to the Vehicles Model page")
    public void user_navigates_to_the_vehicles_model_page() {

        String fleetTabLocator = "//span[contains(@class, 'title title-level-1') and normalize-space() = 'Fleet']";
        String vehiclesModelLocator = "//span[contains(@class, 'title title-level-2') and normalize-space() = 'Vehicles Model']";
        try {

            BrowserUtils.waitForClickablility(By.xpath(fleetTabLocator), 5);
            WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabLocator));
            new Actions(Driver.getDriver()).moveToElement(fleetTabElement).pause(200).doubleClick(fleetTabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(fleetTabLocator), 5);
        }
        try {

            BrowserUtils.waitForPresenceOfElement(By.xpath(vehiclesModelLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(vehiclesModelLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(vehiclesModelLocator)));
            Driver.getDriver().findElement(By.xpath(vehiclesModelLocator)).click();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Then("User should see the following columns:")
    public void user_should_see_the_following_columns(List<String> columns) {
        /*VehicleModelPage vehicleModelPage = new VehicleModelPage();
        Assert.assertTrue("Not all columns are displayed", vehicleModelPage.areAllColumnsDisplayed());*/


        VehicleModelPage vehicleModelPage = new VehicleModelPage();
        for (String column : columns) {
            Assert.assertTrue("Column " + column + " is not displayed.", vehicleModelPage.isColumnDisplayed(column));
        }

    }


    @When("I attempt to access the Vehicles Model page")
    public void iAttemptToAccessTheVehiclesModelPage() {

        String fleetTabLocator = "//span[contains(@class, 'title title-level-1') and normalize-space() = 'Fleet']";
        String vehiclesModelLocator = "//span[contains(@class, 'title title-level-2') and normalize-space() = 'Vehicles Model']";
        try {

            BrowserUtils.waitForClickablility(By.xpath(fleetTabLocator), 5);
            WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabLocator));
            new Actions(Driver.getDriver()).moveToElement(fleetTabElement).pause(200).doubleClick(fleetTabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(fleetTabLocator), 5);
        }
        try {

            BrowserUtils.waitForPresenceOfElement(By.xpath(vehiclesModelLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(vehiclesModelLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(vehiclesModelLocator)));
            Driver.getDriver().findElement(By.xpath(vehiclesModelLocator)).click();
        } catch (Exception e) {

            e.printStackTrace();
        }



    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String arg0) {
        VehicleModelPage vehicleModelPage = new VehicleModelPage();

        try {
            Assert.assertEquals(arg0, vehicleModelPage.noPermissionMessage.getText());
        } catch (AssertionError e) {

            for (int i = 0; i < 5; i++) {
                Driver.getDriver().navigate().refresh();
                try {
                    Assert.assertEquals(arg0, vehicleModelPage.noPermissionMessage.getText());

                    throw new AssertionError("Error:  403 Forbidden..");
                } catch (AssertionError ex) {

                }
            }
        }


        Assert.fail("Error: Message not displayed after page refreshes.");





    }

    @And("I should not be able to access the Vehicles Model page")
    public void iShouldNotBeAbleToAccessTheVehiclesModelPage() {
        System.out.println("You do not have permission to perform this action.");
    }
}
