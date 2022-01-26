package herokuapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HoversPage;
import pages.LoginPage;
import pages.SecurePage;

public class TestBase {

    HoversPage hoversPage;
    LoginPage loginPage;
    SecurePage securePage;
    private ChromeDriver driver;

    @BeforeEach
    public void initPageObjects() {
        // brew install chromedriver
        //System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver");

        driver = new ChromeDriver();
        hoversPage = new HoversPage(driver);
        loginPage = new LoginPage(driver);
        //securePage = new SecurePage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
