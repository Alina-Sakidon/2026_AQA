package hw15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeolocationPage extends BasePage {

    @FindBy(css = "button[onclick='getLocation()']")
    private WebElement geoBtn;

    @FindBy(id = "lat-value")
    private WebElement latValue;

    @FindBy(id = "long-value")
    private WebElement longitude;

    public GeolocationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public GeolocationPage clickGeoBtn() {
        geoBtn.click();
        return new GeolocationPage(driver);
    }

    public String getLatitude() {
        return wait.until(ExpectedConditions.visibilityOf(latValue)).getText();
    }

    public String getLongitude() {
        return wait.until(ExpectedConditions.visibilityOf(longitude)).getText();
    }


}
