package page;

import commons.AbstractPage;
import commons.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {

    @FindBy(xpath = "//h2[text()='Welcome to CartCount!']")
    private WebElement welcomeText;

    WebDriver driver;

    public AccountPage(){
        this.driver = Hooks.openAndQuitBrowser();
    }
    @Override
    public AccountPage open() {
        return null;
    }

    @Override
    public boolean isPageDisplayed() {
        return isForElementPresent(welcomeText);
    }

    public AccountPage waitForPageDisplayed(){
        waitForElementDisplayed(welcomeText);
        return this;
    }
}
