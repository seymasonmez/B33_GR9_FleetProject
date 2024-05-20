package com.fleet.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class US_01_AccessMainModulesStepsDefsAA {

    private WebDriver driver;

    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String userType) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa3.vytrack.com/");

        WebElement usernameField = driver.findElement(By.id("prependedInput"));
        WebElement passwordField = driver.findElement(By.id("prependedInput2"));
        WebElement loginButton = driver.findElement(By.id("_submit"));

        if ("store manager".equalsIgnoreCase(userType)) {
            usernameField.sendKeys("storemanager51");
            passwordField.sendKeys("UserUser123");
        } else if ("driver".equalsIgnoreCase(userType)) {
            usernameField.sendKeys("user1");
            passwordField.sendKeys("UserUser123");
        }

        loginButton.click();
    }

    @When("Sales or Store manager on a dashboard page")
    public void sales_or_store_manager_on_a_dashboard_page() {
        WebElement dashboardElement = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]"));
        assertEquals("Dashboard", dashboardElement.getText());
    }

    @When("Driver is on a dashboard page")
    public void driver_is_on_a_dashboard_page() {
        WebElement dashboardElement = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]"));
        assertEquals("Dashboard", dashboardElement.getText());
    }

    @Then("Sales or Store Manager should see {int} modules")
    public void sales_or_store_manager_should_see_modules(Integer expectedModuleCount) {
        List<WebElement> modules = driver.findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li"));
        assertEquals((int) expectedModuleCount, modules.size());

        for (WebElement module : modules) {
            System.out.println(module.getText());
        }

        driver.quit();
    }

    @Then("Driver should see {int} modules")
    public void driver_should_see_modules(Integer expectedModuleCount) {
        List<WebElement> modules = driver.findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li"));
        assertEquals((int) expectedModuleCount, modules.size());

        for (WebElement module : modules) {
            System.out.println(module.getText());
        }

        driver.quit();
    }
}




