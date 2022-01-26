package herokuapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        //open Login Page
        loginPage.goToLoginPage();
        //insert username, password
        loginPage.insertCredentials("tomsmith", "SuperSecretPassword!");
        // click on Login button
        securePage = loginPage.clickOnLoginButton();
        // assertion
        Assertions.assertTrue(securePage.isLogoutButtonPresent());
    }

    @Test
    public void loginWithWrongUsernameNegativeTest() {
        loginPage.goToLoginPage();
        loginPage.insertCredentials("tomsmith123", "SuperSecretPassword!");
        loginPage.clickOnLoginButton();

        Assertions.assertTrue(loginPage.getMessageText().contains("Your username is invalid!"));
    }

    @Test
    public void loginWithWrongPasswordNegativeTest() {
        loginPage.goToLoginPage();
        loginPage.insertCredentials("tomsmith", "123jkjkjk");
        loginPage.clickOnLoginButton();

        Assertions.assertTrue(loginPage.getMessageText().contains("Your password is invalid!"));
    }
}
