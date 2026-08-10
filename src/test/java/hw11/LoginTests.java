package hw11;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests {

    @Test(groups = "login", description = "Check user login data", dataProvider = "data", priority = 1)
    public void checkUserData(String name, String password, String role) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Alina", name);
        softAssert.assertEquals("pass123", password);
        softAssert.assertEquals("admin", role);
        softAssert.assertAll("Results");
    }

    @Test(dependsOnGroups = "login", description = "Depended test", dataProvider = "data")
    public void checkDependedTest(String name, String password, String role) {
        Assert.assertEquals(name, "Alina");
    }

    @Test(dependsOnGroups = "login", description = "Check parameters from xml file")
    @Parameters("browser")
    public void checkParam(String browser) {
        System.out.println("Parameter from xml file is: " + browser);
    }

    @DataProvider(name = "data")
    public Object[][] generateTestData() {
        return new Object[][]{
                {"Alina", "pass123", "admin"},
               // {"Ira", "pass785", "member"}
        };
    }
}
