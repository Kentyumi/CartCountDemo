package stepDefinitions;

import cucumberOptions.PageGeneratorManager;
import io.cucumber.java8.En;
import org.junit.Assert;
import page.AccountPage;
import page.HomePage;
import page.SignUpPage;

public class SignUpDefinitions implements En {
    public SignUpDefinitions() {

        HomePage homePage = PageGeneratorManager.getHomePage();
        SignUpPage signUpPage = PageGeneratorManager.getSignUpPage();
        AccountPage accountPage = PageGeneratorManager.getAccountPage();

        When("^I tap on \\[SIGNUP AS BUYER\\] button$", () -> {
            homePage.clickRegisterButton();
        });
        Then("^\\[SignUp Page\\] screen is opened$", () -> {
            //Assert.assertTrue(signUpPage.isPageDisplayed());
        });
        And("^I input valid email$", () -> {
            //signUpPage.inputValidEmail("nguyenquochung");
        });
        And("^I input valid FullName$", () -> {
           // signUpPage.inputFullName("Quoc Hung");
        });
        And("^I input valid PassWord$", () -> {
           // signUpPage.inputPassWord("Yumi@170220");
        });
        And("^I tap on \\[Confirm\\] button$", () -> {
           // signUpPage.clickConfirmButton();
        });
        Then("^Buyer 's homepage is opened successfully$", () -> {
            //Assert.assertTrue(accountPage.waitForPageDisplayed().isPageDisplayed());
        });


    }
}
