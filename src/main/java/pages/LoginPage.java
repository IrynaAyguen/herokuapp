package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private static final String LOGIN_URL = BASE_URL + "/login";

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(css = ".radius")
    WebElement loginBtn;

    @FindBy(id = "flash")
    WebElement message;

    public void goToLoginPage(){
        driver.navigate().to(LOGIN_URL);
    }

    public LoginPage insertCredentials(String userNameValue, String passwordValue){
        username.sendKeys(userNameValue);
        password.sendKeys(passwordValue);
        return this;
    }


    public SecurePage clickOnLoginButton() {
        loginBtn.click();
        return new SecurePage(driver);
    }


    public String getMessageText() {
        return message.getText();
    }
}
