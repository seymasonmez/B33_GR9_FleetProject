package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_09_CreateCalendarEventPage extends BasePage {
    public US_09_CreateCalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@title = 'Create Calendar event']")
    public WebElement createCalenderEventBtn;
   @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    //@FindBy(xpath = "(//div[@class='control-group control-group-checkbox'])[2]/div[2]/input")
    public WebElement repeatCheckBox;
    @FindBy(xpath = "(//input[contains(@id,recurrence-repeat-view)])[22]")
    public WebElement repeatEveryNumberBox;
    @FindBy(xpath = "//span[contains(@id,'temp-validation-name')]")
    public WebElement repeatEveryNumberErrorMessage;
}
