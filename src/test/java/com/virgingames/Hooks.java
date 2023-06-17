package com.virgingames;

import com.cucumber.listener.Reporter;
import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.junit.After;

import java.io.IOException;


public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }
    @After
    public void tearDown(Scenario scenario){   //Below code is to attach the screenshot to the report
        if(scenario.isFailed()){
            //Replacing " " with "-" in scenario printing
            String screenShotPath = Utility.getScreenshot(driver,scenario.getName().replace("" , "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();

    }

}

