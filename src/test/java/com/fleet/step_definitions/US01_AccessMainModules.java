package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01_AccessMainModules extends MainPage{
    LoginPage loginPage = new LoginPage();
    MainPage mainPage =new MainPage();

    @Given("User logged in as {string} with username {string} and password {string}")
    public void userLoggedInAsWithPasswordAndUsername(String userType, String username, String password) {
        System.out.println("logging as " + userType);
        loginPage.login(username, password);
    }
    @When("{string} access the main modules of the app")
    public void accessTheMainModulesOfTheApp(String userType) {
        //Verify Main Page is opened
        mainPage.isWebElementDisplayed(mainPage.header);
    }
    @Then("Store or Sales manager should see the following module names:")
    public void storeOrSalesManagerShouldSeeTheFollowingModuleNames(io.cucumber.datatable.DataTable dataTable)  {
        //Verify module names are displayed
        mainPage.isWebElementDisplayed(mainPage.dashboardsTab);
        mainPage.isWebElementDisplayed(mainPage.fleetTab);
        mainPage.isWebElementDisplayed(mainPage.customersTab);
        mainPage.isWebElementDisplayed(mainPage.salesTab);
        mainPage.isWebElementDisplayed(mainPage.activitiesTab);
        mainPage.isWebElementDisplayed(mainPage.marketingTab);
        mainPage.isWebElementDisplayed(mainPage.reportsSegmentsTab);
        mainPage.isWebElementDisplayed(mainPage.systemTab);
    }

    //--------------------------------------------------------------
    @Then("Driver should see the following module names:")
    public void driver_should_see_the_following_module_names(io.cucumber.datatable.DataTable dataTable) {
        mainPage.isWebElementDisplayed(mainPage.fleetTab);
        mainPage.isWebElementDisplayed(mainPage.customersTab);
        mainPage.isWebElementDisplayed(mainPage.activitiesTab);
        mainPage.isWebElementDisplayed(mainPage.systemTab);
    }
}
