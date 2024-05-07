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


    public void loginByUserType(String userType){
        String username =null;
        String password =null;
        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        new LoginPage().login(username,password);
    }





}
