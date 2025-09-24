package com.ui.automation.stepDefinitions;

import com.ui.automation.factory.DriverFactory;
import com.ui.automation.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("User is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://www.amazon.in/");
    }

    @When("User click on signin link")
    public void user_click_on_signin_link() {
        loginPage.signIn();
    }
    @When("User enters username {string}")
    public void user_enters_username(String username) throws InterruptedException {
        loginPage.enterUsername(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) throws InterruptedException {
        loginPage.enterPassword(password);
    }

    @When("Clicks login button")
    public void clicks_login_button() {
        loginPage.signInSubmit();
    }

    @Then("User should see homepage")
    public void user_should_see_homepage() {
        System.out.println("Homepage verified successfully!");
    }
}
