package hw15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChallengingDomPage extends BasePage {
    @FindBy(css = ".button")
    private List<WebElement> buttons;

    private By byColumnLocator(int columnNumber) {
        return By.cssSelector("tr td:nth-child(" + columnNumber + ")");
    }

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean clickAndCheckButtonsAreChanged() {
        int amountOfButtonsToClick = 3;
        for (int i = 0; i < amountOfButtonsToClick; i++) {

            String oldName = buttons.get(i).getText();
            buttons.get(i).click();

            String newName = buttons.get(i).getText();
            if (oldName.equals(newName)) {
                return false;
            }
        }
        return true;
    }

    public void printColumn(int columnNumber){
        driver.findElements(byColumnLocator(columnNumber))
                .stream().map(WebElement::getText).forEach(System.out::println);
    }

}
