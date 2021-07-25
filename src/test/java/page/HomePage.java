package page;

import commons.AbstractPage;
import commons.GlobalConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//span[text()='Signup as Buyer']")
    private WebElement registerButton;

    @Override
    public HomePage open() {
        getDriver().manage().timeouts().implicitlyWait(GlobalConstants.TIME_OUT_NORMAL_ELEMENT, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().get(GlobalConstants.homePageUrl);
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
