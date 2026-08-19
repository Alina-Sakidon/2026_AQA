package hw15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HowerPage extends BasePage {

    @FindBy(css = "[data-toggle='dropdown']")
    private List<WebElement> listDropdowns;

    @FindBy(xpath = "//a[@class='dropdown-toggle' and contains(.,'Secondary Menu')")
    private WebElement secondMenu;

    @FindBy(xpath = "//a[contains(.,'Secondary Action')]")
    private WebElement buttonToClick;

    @FindBy(xpath = ".jumbotron.secondary-clicked")
    private WebElement textToCheck;

    @FindBy(css = "[alt='User Avatar']")
    private List<WebElement> avatars;

    public HowerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }

    public HowerPage openFirstDropdown(){
        WebElement firstDropdown = listDropdowns.get(0);
        actions.moveToElement(firstDropdown).click().perform();
        return new HowerPage(driver);
    }

    public HowerPage openSecondaryMenu(){
        actions.moveToElement(secondMenu).click().perform();
        return new HowerPage(driver);
    }

    public HowerPage hoverToClick(){
        actions.moveToElement(buttonToClick).click().perform();
        return new HowerPage(driver);
    }

    public String getHoverText(){
        return textToCheck.getText();
    }

    public List<String> getUsersNames(){
        System.out.println("Users names: ");
        List<String> names = new ArrayList<>();

        for (WebElement el : avatars) {
            actions.moveToElement(el).click().perform();
            WebElement textEl = el.findElement(
                    By.xpath("./following-sibling::div//h5")
            );
            String name = textEl.getText();
            names.add(name);
        }
        return names;
    }
}
