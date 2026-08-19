package hw15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    private WebElement submitBtn;

    @FindBy(css = ".subheader em")
    private List<WebElement> credentials;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getUserLoginToSend() {
        return credentials.get(0).getText();
    }

    public String getUserPasswordToSend() {
        return credentials.get(1).getText();
    }

    public LoginPage setUserLogin(String value) {
        setValue(userNameInput, value);
        return this;
    }

    public LoginPage setUserPassword(String value) {
        setValue(passwordInput, value);
        return this;
    }

    public SecurePage clickLoginBtn() {
        submitBtn.click();
        return new SecurePage(driver);
    }
}
