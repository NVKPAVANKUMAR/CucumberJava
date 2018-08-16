package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoGuru99_CredentialsPage {

    @FindBy(xpath = "//*[.='User ID :']")
    private WebElement userIdText;

    public boolean isUserIdDisplayed() {
        return userIdText.isDisplayed();
    }
}
