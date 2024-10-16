package com.DemoSwagLabs.pages;

import com.DemoSwagLabs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    protected WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(10));

    // Method to navigate to a menu by partial link text
    void navigateToMenu(String menuName) {
        By l_menu = By.partialLinkText(menuName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(l_menu)).click();
    }
}
