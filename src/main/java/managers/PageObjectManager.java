package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.DemoGuru99Page;
import pages.DemoGuru99_CredentialsPage;
import pages.LoginPage;

public class PageObjectManager {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private DemoGuru99Page demoGuru99Page;
    private DemoGuru99_CredentialsPage credentialsPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getHomePage() {
        return loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public DashboardPage getDashboardPage() {
        return dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    }

    public DemoGuru99Page getDemoGuru99Page() {
        return demoGuru99Page = PageFactory.initElements(driver, DemoGuru99Page.class);
    }

    public DemoGuru99_CredentialsPage getDemoGuru99CredentialsPage() {
        return credentialsPage = PageFactory.initElements(driver, DemoGuru99_CredentialsPage.class);
    }


}
