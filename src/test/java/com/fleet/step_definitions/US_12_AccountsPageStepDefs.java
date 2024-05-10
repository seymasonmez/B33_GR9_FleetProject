package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US12_AccountsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_12_AccountsPageStepDefs  extends BasePage {
    US12_AccountsPage accountPage = new US12_AccountsPage();


    @When("user click to the account module under customers module")
    public void user_click_to_the_account_module_under_customers_module() {
        String tabLocator = "Customers";
        String moduleLocator = "Accounts";

        navigateToModule(tabLocator, moduleLocator);

    }
    @When("user click to filter icon")
    public void user_click_to_filter_icon() {
        accountPage.filterButton.click();
    }
    @Then("user verifies that they can see {int} filter items on the Accounts page")
    public void user_verifies_that_they_can_see_filter_items_on_the_accounts_page(Integer int1, io.cucumber.datatable.DataTable dataTable) {


    }
}
