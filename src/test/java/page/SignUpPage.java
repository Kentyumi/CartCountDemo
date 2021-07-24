package page;

import commons.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "fullName")
    private WebElement fullName;

    @FindBy(name = "password")
    private WebElement passWord;

    @FindBy(className = "btn")
    private WebElement confirmButton;

    public SignUpPage inputValidEmail(String mail){
        int random = randomNumber();
        email.sendKeys(mail + random + "@gmail.com");
        return this;
    }

    public SignUpPage inputFullName(String name){
        fullName.sendKeys(name);
        return this;
    }

    public SignUpPage inputPassWord(String pw){
        passWord.sendKeys(pw);
        return this;
    }

    public SignUpPage clickConfirmButton(){
        confirmButton.click();
        return this;
    }

    @Override
    public SignUpPage open() {
        return this;
    }

    @Override
    public boolean isPageDisplayed() {
        return true;
    }
}
