package hw13;

import hw12.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HoverTest extends BaseTest {

    @Test(description = "Hover test")
    public void hoverMouse() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        WebElement firstDropdown = driver.findElements(By.cssSelector("[data-toggle='dropdown']")).get(0);
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();

        actions.moveToElement(firstDropdown).click().perform();
        WebElement secondMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(.,'Secondary Menu')]"));
        actions.moveToElement(secondMenu).click().perform();
        WebElement buttonToClick = driver.findElement(By.xpath("//a[contains(.,'Secondary Action')]"));
        actions.moveToElement(buttonToClick).click().perform();
        String textToCheck = driver.findElement(By.cssSelector(".jumbotron.secondary-clicked")).getText();

        Assert.assertTrue(textToCheck.contains("Secondary Page"));
    }

    @Test(description = "Check user name displayed with hover")
    public void getUserNames() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);

        List<WebElement> avatars = driver.findElements(By.cssSelector("[alt='User Avatar']"));
        System.out.println("Users names: ");
        List<String> names = new ArrayList<>();

        for (WebElement el : avatars) {
            actions.moveToElement(el).click().perform();
            WebElement textEl = el.findElement(
                    By.xpath("./following-sibling::div//h5")
            );
            String name = textEl.getText();

            System.out.println(name);
            names.add(name);
        }

        Assert.assertFalse(names.isEmpty());
    }
}
