package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.pages.HowToUsePinbarPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class US03_PinbarStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    HowToUsePinbarPage howToUsePinbarPage = new HowToUsePinbarPage();


    @When("User locate and click it Learn how to use this space link")
    public void userLocateAndClickItLearnHowToUseThisSpaceLink() {

        BrowserUtils.clickWithJS(dashboardPage.LearnHowToUseButton);

        Set<String> allTabs = Driver.getDriver().getWindowHandles();

        for (String eachTab : allTabs) {
            Driver.getDriver().switchTo().window(eachTab);
        }

    }


    @Then("User sees expected text on the new opened page")
    public void user_sees_expected_text_on_the_new_opened_page(String expectedText) {

        BrowserUtils.waitForVisibility(howToUsePinbarPage.howToUseHeader,5);

        Assert.assertEquals(expectedText, howToUsePinbarPage.howToUseHeader.getText());

    }

    @Then("User sees second expected text on the new opened page")
    public void userSeesSecondExpectedTextOnTheNewOpenedPage(String expectedText) {

        Assert.assertEquals(expectedText, howToUsePinbarPage.textDescriptionOnThePage.getText());

    }


    @Then("Verify that users sees an image on the page with expected path.")
    public void verify_that_users_sees_an_image_on_the_page_with_expected_path(String expectedLink) {

        Assert.assertTrue(howToUsePinbarPage.pictureOnThePage.getAttribute("src").contains(expectedLink));

    }


}
