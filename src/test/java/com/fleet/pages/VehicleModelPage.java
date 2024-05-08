package com.fleet.pages;

import com.fleet.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleModelPage {
    public VehicleModelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-ModelName')]//span[@class='grid-header-cell__label']")
    private WebElement modelNameColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-Make')]//span[@class='grid-header-cell__label']")
    private WebElement makeColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-Canberequested')]//span[@class='grid-header-cell__label']")
    private WebElement canBeRequestedColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-CatalogValue')]//span[@class='grid-header-cell__label']")
    private WebElement cvviColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-CO2Fee')]//span[@class='grid-header-cell__label']")
    private WebElement co2FeeColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-Cost')]//span[@class='grid-header-cell__label']")
    private WebElement costDepreciatedColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-TotalCost')]//span[@class='grid-header-cell__label']")
    private WebElement totalCostDepreciatedColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-CO2Emissions')]//span[@class='grid-header-cell__label']")
    private WebElement co2EmissionsColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-FuelType')]//span[@class='grid-header-cell__label']")
    private WebElement fuelTypeColumn;

    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-Vendors')]//span[@class='grid-header-cell__label']")
    private WebElement vendorsColumn;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement noPermissionMessage;

    @FindBy(className = "error-page-content")
    private WebElement errorPageContent;

    @FindBy(className = "error-page-description")
    private WebElement errorPageDescription;

  
    public boolean isErrorPageDisplayed() {
        return errorPageContent.isDisplayed();
    }
    public String getErrorMessage() {
        return errorPageDescription.getText();
    }






    public boolean areAllColumnsDisplayed() {
        return modelNameColumn.isDisplayed() &&
                makeColumn.isDisplayed() &&
                canBeRequestedColumn.isDisplayed() &&
                cvviColumn.isDisplayed() &&
                co2FeeColumn.isDisplayed() &&
                costDepreciatedColumn.isDisplayed() &&
                totalCostDepreciatedColumn.isDisplayed() &&
                co2EmissionsColumn.isDisplayed() &&
                fuelTypeColumn.isDisplayed() &&
                vendorsColumn.isDisplayed();
    }

    public boolean isColumnDisplayed(String columnName) {
        try {

            WebElement columnElement = Driver.getDriver().findElement(By.xpath("//th[contains(., '" + columnName + "')]"));
            boolean displayed = columnElement.isDisplayed();

            System.out.println(columnName + " displayed: " + displayed);
            return displayed;
        } catch (NoSuchElementException e) {

            System.out.println(columnName + " not found.");
            return false;
        }
    }

}

