package pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "MemberLoginForm_LoginForm_Email")
    private WebElement usernameField;

    @FindBy(id = "MemberLoginForm_LoginForm_Password")
    private WebElement passwordField;

    @FindBy(id = "MemberLoginForm_LoginForm_action_doLogin")
    private WebElement loginButton;

    public void input_Username(String usn, ExtentTest logger) {
        usernameField.sendKeys(usn);
        logger.info("Username entered");
    }

    public void input_password(String pass,ExtentTest logger) {
        passwordField.sendKeys(pass);
        logger.info("Password entered");
    }

    public void click_LoginButton(ExtentTest logger) {
        loginButton.click();
        logger.info("Logout Button clicked");
    }

    public boolean status_LoginButton(ExtentTest logger){
       return loginButton.isDisplayed();

    }

}
