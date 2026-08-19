package hw15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(linkText = "Geolocation")
    private WebElement geolocationLink;

    @FindBy(linkText = "Form Authentication")
    private WebElement loginLink;

    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDomLink;

    @FindBy(linkText = "Drag and Drop")
    private WebElement dragAndDropLink;

    @FindBy(linkText = "Hovers")
    private WebElement hoversLink;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public GeolocationPage openGeoPage() {
        geolocationLink.click();
        return new GeolocationPage(driver);
    }

    public LoginPage openLoginPage() {
        loginLink.click();
        return new LoginPage(driver);
    }

    public ChallengingDomPage openChallengingDomPage() {
        challengingDomLink.click();
        return new ChallengingDomPage(driver);
    }

    public DragAndDropPage openDragAndDropPage() {
        dragAndDropLink.click();
        return new DragAndDropPage(driver);
    }

    public HowerPage openHoverPage() {
        hoversLink.click();
        return new HowerPage(driver);
    }

}
