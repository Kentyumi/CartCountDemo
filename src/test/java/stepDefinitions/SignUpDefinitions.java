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

        Given("^I open CartCount website$", () -> {
            homePage.open().waitForPageDisplayed();
        });
        When("^I tap on \\[SIGNUP AS BUYER\\] button$", () -> {
            homePage.clickRegisterButton();
        });
        And("^I input valid email$", () -> {
            signUpPage.inputValidEmail("kentyumi");
        });
        And("^I input valid FullName$", () -> {
            signUpPage.inputFullName("nguyen quoc hung");
        });
        And("^I input valid PassWord$", () -> {
            signUpPage.inputPassWord("Yumi170220");
        });
        And("^I tap on \\[Confirm\\] button$", () -> {
            signUpPage.clickConfirmButton();
        });
        And("^I tap on \\[Confirm\\] button$", () -> {
            signUpPage.clickConfirmButton();
        });
        Then("^Buyer 's homepage is opened successfully$", () -> {
            Assert.assertTrue(accountPage.isPageDisplayed());
        });
    }
}
