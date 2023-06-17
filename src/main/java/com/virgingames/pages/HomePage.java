package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "(//label[@class='dialog_button'])[2]")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Online Slots')]")
    WebElement onlineSlots;


public void clickOnAcceptCookies(){
    clickOnElement(acceptCookies);
    log.info("Clicking on cookies : " + acceptCookies.toString());
}

    public void clickOnOnlineSlots(){

        clickOnElement(onlineSlots);
        log.info("Clicking on Online Slots catagory : " + onlineSlots.toString());
    }


}

