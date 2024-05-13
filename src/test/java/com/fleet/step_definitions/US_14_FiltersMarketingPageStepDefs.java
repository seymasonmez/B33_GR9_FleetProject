package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US14CampaignsPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_14_FiltersMarketingPageStepDefs extends BasePage {

    US14CampaignsPage campaignsPage = new US14CampaignsPage();

    @When("the user clicks on Campaign module under Marketing tab")
    public void the_user_clicks_on_campaign_module_under_marketing_tab() {
       navigateToModule("Marketing", "Campaigns");
    }

    @When("the user clicks to the filter icon")
    public void the_user_clicks_to_the_filter_icon() {
        campaignsPage.filterIcon.click();
    }

    @Then("the user should see all {int} filter options checked by default")
    public void the_user_should_see_all_filter_options_checked_by_default(Integer int1, io.cucumber.datatable.DataTable dataTable) {
        campaignsPage.isWebElementDisplayed(campaignsPage.nameFilter);
        campaignsPage.isWebElementDisplayed(campaignsPage.codeFilter);
        campaignsPage.isWebElementDisplayed(campaignsPage.budgetFilter);
        campaignsPage.isWebElementDisplayed(campaignsPage.startDateFilter);
        campaignsPage.isWebElementDisplayed(campaignsPage.endDateFilter);
        System.out.println(campaignsPage.allFilters.size());
        Assert.assertTrue(5==campaignsPage.allFilters.size());
    }

    @Then("the user should be able to uncheck any amount of boxes")
    public void the_user_should_be_able_to_uncheck_any_amount_of_boxes() {
       campaignsPage.codeFilter.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(!campaignsPage.codeFilter.isSelected());
    }


}
