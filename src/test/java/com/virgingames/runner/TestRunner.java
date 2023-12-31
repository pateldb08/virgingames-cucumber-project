package com.virgingames.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",  //feature file package path from content root
        glue = "com/virgingames", // cucumber path from test-->java-->package source root path
        tags = "@regression",  // tags on test cases in feature file
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                "json:target/RunCuke/cucumber.json"}

        //  monochrome = false  -- show result in different colour in console
        // dryRun = true
)
public class TestRunner {
    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");                                     // for report
        String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);                                            // to load report
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 11" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "4.9.0");
        Reporter.setSystemInfo("Maven", "3.8.0");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");


    }
}