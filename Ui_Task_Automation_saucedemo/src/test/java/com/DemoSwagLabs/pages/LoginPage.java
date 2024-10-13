package com.DemoSwagLabs.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // Locators
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public WebElement l_loginusername;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement l_loginpassword;
    @FindBy(xpath = "//*[@id=\"login-button\"]")
    public WebElement l_loginBtn;
    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[2]/div")
    public WebElement swagLabsHeader;
    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")
    public WebElement Message;

    // Method to verify the header
    public void verifySwagLabsHeader(String expectedHeader) {
        String actualHeader = swagLabsHeader.getText();
        Assert.assertEquals("Header does not match the expected value!", expectedHeader, actualHeader);
    }

    // Method to verify error message
    public void verifyErrorMessage(String expectedMessage) {
        String actualMessage = Message.getText();
        Assert.assertEquals("Message does not match the expected value!", expectedMessage, actualMessage);
    }

    // Login method
    public void login(String username, String password) {
        if (username != null && !username.isEmpty()) {
            l_loginusername.sendKeys(username);
        } else {
            System.out.println("Username is null or empty. Skipping sending keys.");
        }
        if (password != null && !password.isEmpty()) {
            l_loginpassword.sendKeys(password);
        } else {
            System.out.println("Password is null or empty. Skipping sending keys.");
        }
        l_loginBtn.click();
    }
}
