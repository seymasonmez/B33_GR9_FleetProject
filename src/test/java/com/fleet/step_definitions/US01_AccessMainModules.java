package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01_AccessMainModules extends BasePage {
    LoginPage loginPage = new LoginPage();
    @Given("User logged in as {string} with username {string} and password {string}")
    public void userLoggedInAsWithPasswordAndUsername(String userType, String username, String password) {
        System.out.println("logging as " + userType);
        loginPage.login(username, password);
    }
    @When("{string} access the main modules of the app")
    public void accessTheMainModulesOfTheApp(String userType) {
        //Verify Main Page is opened
        isWebElementDisplayed(header);
    }
    @Then("Store or Sales manager should see the following module names:")
    public void storeOrSalesManagerShouldSeeTheFollowingModuleNames(io.cucumber.datatable.DataTable dataTable)  {
        //Verify module names are displayed
        isWebElementDisplayed(dashboardsTab);
        isWebElementDisplayed(fleetTab);
        isWebElementDisplayed(customersTab);
        isWebElementDisplayed(salesTab);
        isWebElementDisplayed(activitiesTab);
        isWebElementDisplayed(marketingTab);
        isWebElementDisplayed(reportsSegmentsTab);
        isWebElementDisplayed(systemTab);
    }

    //--------------------------------------------------------------
    @Then("Driver should see the following module names:")
    public void driver_should_see_the_following_module_names(io.cucumber.datatable.DataTable dataTable) {
        isWebElementDisplayed(fleetTab);
        isWebElementDisplayed(customersTab);
        isWebElementDisplayed(activitiesTab);
        isWebElementDisplayed(systemTab);
    }
}
