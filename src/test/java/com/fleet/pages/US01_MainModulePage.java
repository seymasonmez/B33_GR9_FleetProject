package com.fleet.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US01_MainModulePage {
    WebDriver driver;
    public US01_MainModulePage() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

        @FindBy(partialLinkText = "Dashboards")
    public WebElement dashboards;
    @FindBy(partialLinkText = "Activities")
    public WebElement activities;
    @FindBy(partialLinkText = "Marketing")
    public WebElement marketing;
    @FindBy(partialLinkText = "System")
    public WebElement system;
    @FindBy(partialLinkText = "Fleet")
    public WebElement fleet;
    @FindBy(partialLinkText = "Customers")
    public WebElement customers;
    @FindBy (partialLinkText = "Sales")
    public WebElement sales;
    @FindBy (partialLinkText = "Reports & Segments")
    public WebElement reportsandsegments;








    }



