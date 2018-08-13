package pages;

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

    public void waitForAddNewButton(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(addNewButton));
    }

    public void clickLogout() {
        logoutButton.click();
    }

}
