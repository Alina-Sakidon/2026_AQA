
import hw10.Application;
import org.testng.annotations.Test;

public class TestApp {
    @Test
    public void runTest(){
        Application application=new Application();
        application.setAppInfo();
        System.out.println("After main i said cool");
    }
}
