package hw12;

import hw15.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {
    public String usrNameText, userPasswordText;
    public LoginPage loginPage;

    @BeforeMethod
    public void arrange() {
        loginPage = openApp().openLoginPage();
        usrNameText = loginPage.getUserLoginToSend();
        userPasswordText = loginPage.getUserPasswordToSend();
    }


    @Test(description = "Valid login tests")
    public void validLoginTests() {
        String message = loginPage.setUserLogin(usrNameText)
                .setUserPassword(userPasswordText)
                .clickLoginBtn()
                .getMessage();

        Assert.assertTrue(message.contains("You logged into a secure area!"));
    }

    @Test(description = "Invalid login tests", dataProvider = "loginData")
    public void invalidLoginTests(String userN, String pass, String expectedMessage) {
        String message = loginPage.setUserLogin(userN)
                .setUserPassword(pass)
                .clickLoginBtn()
                .getMessage();

        Assert.assertTrue(message.contains(expectedMessage));
    }

    @DataProvider(name = "loginData")
    public Object[][] data() {
        return new Object[][]{
                {"tomsmith", "invalidPassword123", "Your password is invalid!"},
                {"InvalidUsers", "SuperSecretPassword!", "Your username is invalid!"}
        };
    }
}
