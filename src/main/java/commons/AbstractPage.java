package commons;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.Set;

public abstract class AbstractPage {
    public  WebDriver driver ;

    public abstract AbstractPage open();

    public abstract boolean isPageDisplayed();

    public AbstractPage waitForElementDisplayed(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, GlobalConstants.TIME_OUT_NORMAL_ELEMENT);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
        }
        return this;
    }

    public boolean isElementDisplayed(WebElement element, int timeOutInSecond) {
        boolean isVisible = false;
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSecond);
        try {
            if (wait.until(ExpectedConditions.visibilityOf(element)) != null) {
                isVisible = true;
            }
        } catch (Exception e) {
            System.out.println("Element is not found");
        }
        return isVisible;
    }

    public boolean isForElementPresent(WebElement element){
        return isElementDisplayed(element,GlobalConstants.TIME_OUT_NORMAL_ELEMENT);
    }

    public void getPageUrl(WebDriver driver, String pageUrl) {
        driver.get(pageUrl);
    }

    public String getPageTitle(WebDriver driver) {
        return driver.getTitle();
    }

    public int randomNumber() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public String getPageUrl(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public String getPageSource(WebDriver driver) {
        return driver.getPageSource();

    }

    public void backToPage(WebDriver driver) {
        driver.navigate().back();
    }

    public void refreshCurrentPage(WebDriver driver) {
        driver.navigate().refresh();
    }

    public void fordWardToPage(WebDriver driver) {
        driver.navigate().forward();
    }

    public void acceptAlert(WebDriver driver) {
        alert = driver.switchTo().alert();
        alert.accept();
    }

    private Alert alert;

    public void cancelAlert(WebDriver driver) {
        alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public String getAlertText(WebDriver driver) {
        alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void sendKeyToAlert(WebDriver driver, String text) {
        alert = driver.switchTo().alert();
        alert.sendKeys(text);

    }

    public void switchToWindowByID(WebDriver driver, String parentID) {
        Set<String> allWindows = driver.getWindowHandles();
        for (String runWindow : allWindows) {
            if (!runWindow.equals(parentID)) {
                driver.switchTo().window(runWindow);
                break;
            }
        }
    }

    public void switchToWindowByTitle(WebDriver driver, String title) {
        Set<String> allWindows = driver.getWindowHandles();
        for (String runWindows : allWindows) {
            driver.switchTo().window(runWindows);
            String currentWin = driver.getTitle();
            if (currentWin.equals(title)) {
                break;
            }
        }
    }

    public void closeAllWindowsWithoutParent(WebDriver driver, String parentID) {
        Set<String> allWindows = driver.getWindowHandles();
        for (String runWindows : allWindows) {
            if (!runWindows.equals(parentID)) {
                driver.switchTo().window(runWindows);
                driver.close();
            }
        }
        driver.switchTo().window(parentID);
    }
}
