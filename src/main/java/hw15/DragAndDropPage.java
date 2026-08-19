package hw15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;


public class DragAndDropPage extends BasePage {
    @FindBy(id = "column-a")
    private WebElement source;

    @FindBy(id = "column-b")
    private WebElement target;

    @FindBy(css = "#column-a header")
    private WebElement headerToCheck;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public DragAndDropPage drugAndDropSource() {
        actions.dragAndDrop(source, target).perform();
        return this;
    }

    public String getChangedHeader() {
        return headerToCheck.getText();
    }
}
