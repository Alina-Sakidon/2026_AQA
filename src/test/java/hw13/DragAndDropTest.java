package hw13;

import hw12.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class DragAndDropTest extends BaseTest {

    @Test
    public void drugAndDrop(){
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(source, target).perform();

        String messageToCheck = driver.findElement(By.id("droppable")).getText();

        Assert.assertEquals(messageToCheck, "Dropped!");
    }
}
