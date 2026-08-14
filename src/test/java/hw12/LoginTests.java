package hw12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTests extends BaseTest {
    WebElement userNameInput, passwordInput, submitBtn;
    List<WebElement> textToSend;
    String usrNameText, userPasswordText;


    @BeforeMethod
    public void arrange() {
        driver.get("https://the-internet.herokuapp.com/login");
        userNameInput = driver.findElement(By.id("username"));
        passwordInput = driver.findElement(By.id("password"));
        submitBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        textToSend = driver.findElements(By.cssSelector(".subheader em"));
    }


    @Test(description = "Valid login tests")
    public void validLoginTests() {
        usrNameText = textToSend.get(0).getText();
        userPasswordText = textToSend.get(1).getText();
        userNameInput.clear();
        userNameInput.sendKeys(usrNameText);

        passwordInput.clear();
        passwordInput.sendKeys(userPasswordText);

        submitBtn.click();

        String message = getLoginMessageText();
        Assert.assertTrue(message.contains("You logged into a secure area!"));
    }

    @Test(description = "Invalid login tests", dataProvider = "loginData")
    public void invalidLoginTests(String userN, String pass, String expectedMessage) {
        userNameInput.clear();
        userNameInput.sendKeys(userN);

        passwordInput.clear();
        passwordInput.sendKeys(pass);

        submitBtn.click();

        String message = getLoginMessageText();
        Assert.assertTrue(message.contains(expectedMessage));
    }

    private String getLoginMessageText() {
        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("flash"))
        );
        return message.getText();
    }

    @DataProvider(name = "loginData")
    public Object[][] data() {
        return new Object[][]{
                {"tomsmith", "invalidPassword123", "Your password is invalid!"},
                {"InvalidUsers", "SuperSecretPassword!", "Your username is invalid!"}
        };
    }
}
