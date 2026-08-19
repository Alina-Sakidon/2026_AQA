package hw13;

import hw12.BaseTest;
import hw15.HowerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest extends BaseTest {

    @Test(description = "Check user name displayed with hover")
    public void getUserNames() {

        List<String> avatarsNames = openApp().openHoverPage().getUsersNames();
        System.out.println("Users names: " + avatarsNames);

        Assert.assertFalse(avatarsNames.isEmpty());
    }
}
