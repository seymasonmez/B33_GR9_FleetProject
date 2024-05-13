package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US07_VehiclesPage {
    public US07_VehiclesPage() {PageFactory.initElements(Driver.getDriver(), this);}

@FindBy()
public WebElement VehicleCheckbox;



    @FindBy(xpath = "//table/tbody/tr/td[1]/input")
    public List<WebElement> checkboxes;


    @FindBy(xpath = "//table/thead/tr/th[1]/div/button/input")
    public WebElement firstCheckbox;
    
    



    
  

  

    

   



}


