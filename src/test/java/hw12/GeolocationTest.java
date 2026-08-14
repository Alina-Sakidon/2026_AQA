package hw12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class GeolocationTest extends BaseTest {

    @Test(description = "Geolocation test")
    public void getCoordinates() {
        driver.get("https://the-internet.herokuapp.com/geolocation ");

        driver.findElement(By.cssSelector("button[onclick='getLocation()']")).click();

        WebElement latitudeToCheck = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("lat-value")));
        String latitude = latitudeToCheck.getText();
        String longitude = driver.findElement(By.id("lat-value")).getText();

        System.out.printf("Your location is : Latitude: %s longitude: %s%n", latitude, longitude);
    }
}
