package pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoGuru99Page {

    @FindBy(name = "emailid")
    private WebElement emailIdField;

    @FindBy(name = "btnLogin")
    private WebElement submitButton;

    @FindBy(id = "message9")
    private WebElement errorMsg;

    public void enterEmailId(String mailId, ExtentTest logger) {
        emailIdField.sendKeys(mailId);
        logger.info("Emailid entered");
    }

    public void clickOnLoginButton(ExtentTest logger) {
        submitButton.click();
        logger.info("Login Button clicked");
    }

    public boolean isErrorMsgDisplayed() {
        return errorMsg.isDisplayed();
    }

}

