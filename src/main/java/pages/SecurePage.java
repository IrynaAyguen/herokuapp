package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurePage extends PageBase{

    public SecurePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".radius")
    WebElement logoutBtn;

    public boolean isLogoutButtonPresent() {
        return logoutBtn.isDisplayed();
    }
}
