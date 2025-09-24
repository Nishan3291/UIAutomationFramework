package com.ui.automation.stepDefinitions;

import com.ui.automation.factory.DriverFactory;
import com.ui.automation.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("User is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://google.com/login");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String pass) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(pass);
    }

    @When("Clicks login button")
    public void clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should see homepage")
    public void user_should_see_homepage() {
        System.out.println("Homepage verified!");
    }
}
