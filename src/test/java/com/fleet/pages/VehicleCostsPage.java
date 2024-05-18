package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostsPage extends BasePage {

   public VehicleCostsPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(xpath="//thead//th//a[@class='grid-header-cell__link']/span[1]")
    public List<WebElement> actualColumnNames;

   @FindBy(xpath = "//table/thead/tr/th")
    public WebElement checkBox;

    @FindBy(xpath = "//tbody/tr/td/input")
    public WebElement allCheckBox;







}
