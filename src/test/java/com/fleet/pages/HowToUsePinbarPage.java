package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowToUsePinbarPage {

    public HowToUsePinbarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h3[.=\"How To Use Pinbar\"]")
    public WebElement howToUseHeader;

    @FindBy (xpath = "(//div[@class = \"clearfix\"]/p)[1]")
    public WebElement textDescriptionOnThePage;

    @FindBy (xpath = "//div[@class = \"clearfix\"]//img")
    public WebElement pictureOnThePage;


}
