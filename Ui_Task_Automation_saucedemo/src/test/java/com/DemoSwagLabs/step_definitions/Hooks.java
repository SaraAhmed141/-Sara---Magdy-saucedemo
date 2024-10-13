package com.DemoSwagLabs.step_definitions;

import com.DemoSwagLabs.utilities.BrowserUtils;
import com.DemoSwagLabs.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After()
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }
}
