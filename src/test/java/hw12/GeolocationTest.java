package hw12;

import hw15.GeolocationPage;
import org.testng.annotations.Test;


public class GeolocationTest extends BaseTest {

    @Test(description = "Geolocation test")
    public void getCoordinates() {

        GeolocationPage geoPage = openApp()
                .openGeoPage()
                .clickGeoBtn();
        String latVal = geoPage.getLatitude();
        String longVal = geoPage.getLongitude();

        System.out.printf("Your location is : Latitude: %s longitude: %s%n", latVal, longVal);
    }
}
