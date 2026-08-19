package hw15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecurePage extends BasePage {
    @FindBy(id = "flash")
    private WebElement messageArea;


    public SecurePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getMessage() {
        return wait.until(ExpectedConditions.visibilityOf(messageArea)).getText();
    }
}
