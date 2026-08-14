package hw12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UiCheck extends BaseTest {
    @Test
    public void checkUi() {
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        int amountOfButtonsToClick = 3;
        for (int i = 0; i < amountOfButtonsToClick; i++) {
            List<WebElement> buttons = driver.findElements(By.cssSelector(".button"));
            String oldName = buttons.get(i).getText();
            buttons.get(i).click();
            WebElement updatedButton =
                    driver.findElements(By.cssSelector(".button")).get(i);
            String newName = updatedButton.getText();
            Assert.assertNotEquals(oldName, newName);
        }
        driver.findElements(By.cssSelector("tr td:nth-child(4)"))
                .stream().map(WebElement::getText).forEach(System.out::println);
    }
}
