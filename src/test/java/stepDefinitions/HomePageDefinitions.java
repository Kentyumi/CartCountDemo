package stepDefinitions;

import cucumberOptions.PageGeneratorManager;
import io.cucumber.java8.En;
import page.HomePage;

public class HomePageDefinitions implements En {
    public HomePageDefinitions() {
        HomePage homePage = PageGeneratorManager.getHomePage();
        Given("^: CartCount HomePage is opened$", () -> {
            homePage.isPageDisplayed();
        });
    }
}
