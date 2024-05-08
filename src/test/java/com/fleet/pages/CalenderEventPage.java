package com.fleet.pages;

import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderEventPage {

    public CalenderEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//a[@title = 'Create Calendar event']")
    public WebElement createCalenderEventBtn;

    @FindBy (xpath = "//iframe[contains(@id,'oro_calendar_event_form_description-uid-663')]")
    public WebElement iframeForDescriptionField;

    @FindBy(xpath = "//body[@id = 'tinymce']")
    public WebElement descriptionFieldInIframe;

    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeatCheckBox;

    @FindBy (xpath = "//body[@id = 'tinymce']/p")
    public WebElement verifyVisibilityOfWrittenText;

}
