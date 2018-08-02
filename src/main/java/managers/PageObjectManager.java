package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.LoginPage;

public class PageObjectManager {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getHomePage() {
        return loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public DashboardPage getDashboardPage() {
        return dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    }


}
