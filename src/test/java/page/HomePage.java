package page;

import commons.AbstractPage;
import commons.GlobalConstants;
import commons.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//span[text()='Signup as Buyer']")
    private WebElement registerButton;

    public WebDriver driver;

    public HomePage(){
        this.driver = Hooks.openAndQuitBrowser();
    }

    @Override
    public HomePage open() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(GlobalConstants.homePageUrl);
        return this;
    }

    @Override
    public boolean isPageDisplayed() {
        return false;
    }

    public HomePage waitForPageDisplayed(){
        return this;
    }

    public HomePage clickRegisterButton() {
        registerButton.click();
        return this;
    }

    @Override
    public int randomNumber() {
        return super.randomNumber();
    }
}
