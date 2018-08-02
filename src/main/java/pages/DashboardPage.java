package pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    @FindBy(xpath = "//*[.='Add new']")
    private WebElement addNewButton;

    @FindBy(xpath = "//*[@id=\"cms-menu\"]/div[1]/div[2]/a[2]")
    private WebElement logoutButton;

    public void waitForAddNewButton(WebDriver driver,ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(addNewButton));

    }

    public void clickLogout(ExtentTest logger) {
        logoutButton.click();
        logger.info("logout icon clicked");
    }

}
