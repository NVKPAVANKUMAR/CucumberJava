package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "MemberLoginForm_LoginForm_Email")
    private WebElement usernameField;

    @FindBy(id = "MemberLoginForm_LoginForm_Password")
    private WebElement passwordField;

    @FindBy(id = "MemberLoginForm_LoginForm_action_doLogin")
    private WebElement loginButton;

    @FindBy(id = "MemberLoginForm_LoginForm_error")
    private WebElement errorMsg;

    public void input_Username(String usn) {
        usernameField.sendKeys(usn);
    }

    public void input_password(String pass) {
        passwordField.sendKeys(pass);

    }

    public void click_LoginButton() {
        loginButton.click();
    }

    public boolean status_LoginButton() {
        return loginButton.isDisplayed();
    }

    public String getErrorMsgText() {
        return errorMsg.getText();
    }

}
