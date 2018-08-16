package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoGuru99Page {

    @FindBy(name = "emailid")
    private WebElement emailIdField;

    @FindBy(name = "btnLogin")
    private WebElement submitButton;

    @FindBy(id = "message9")
    private WebElement errorMsg;

    public void enterEmailId(String mailId) {
        emailIdField.sendKeys(mailId);

    }

    public void clickOnLoginButton() {
        submitButton.click();
    }

    public boolean isErrorMsgDisplayed() {
        return errorMsg.isDisplayed();
    }

}

