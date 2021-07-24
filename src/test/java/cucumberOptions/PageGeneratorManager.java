package cucumberOptions;

import page.AccountPage;
import page.HomePage;
import page.LoginPage;
import page.SignUpPage;

public class PageGeneratorManager {

    public static HomePage getHomePage() {
        return new HomePage();
    }

    public static SignUpPage getSignUpPage() {
        return new SignUpPage();
    }

    public static LoginPage getLoginPage() {
        return new LoginPage();
    }

    public static AccountPage getAccountPage(){return new AccountPage();}
}
