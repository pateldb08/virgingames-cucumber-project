package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineSlotsPage extends Utility {

    private static final Logger log = LogManager.getLogger(OnlineSlotsPage.class.getName());

    public OnlineSlotsPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[text() = 'Play Online Slots at Virgin Games']")
    WebElement onlineSlotsText;

    public String getOnlineSlotsText(){
        log.info("Getting online slots text : " + onlineSlotsText.toString());
        return getTextFromElement(onlineSlotsText);

    }

}
