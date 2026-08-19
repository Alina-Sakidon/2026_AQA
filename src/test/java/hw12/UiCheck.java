package hw12;

import hw15.ChallengingDomPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UiCheck extends BaseTest {
    @Test
    public void checkUi() {
        ChallengingDomPage challengingDomPage = openApp().openChallengingDomPage();

        boolean isChanged = challengingDomPage.clickAndCheckButtonsAreChanged();

        Assert.assertTrue(isChanged);

        challengingDomPage.printColumn(4);
    }
}
