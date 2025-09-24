package com.ui.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    private WebDriver driver;

    private By username = By.id("ap_email_login");
    private By password = By.id("ap_password");
    private By loginBtn = By.id("login");
    private By continueButton = By.xpath("//input[@class = 'a-button-input']");
    private By signin = By.id("nav-link-accountList-nav-line-1");
    private By signInSubmit = By.id("signInSubmit");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signIn() {
        driver.findElement(signin).click();
    }

    public void enterUsername(String user) throws InterruptedException {
        Thread.sleep(5000);

        driver.findElement(username).sendKeys(user);
        Thread.sleep(2000);
        driver.quit();
    }

    public void enterPassword(String pass) throws InterruptedException {

        driver.findElement(password).sendKeys(pass);
        Thread.sleep(5000);
    }

    public void signInSubmit() {
        driver.findElement(signInSubmit).click();
    }
}
