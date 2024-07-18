import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

    @Test
    public void loginTest() {
        // create driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        sleep(1);

        System.out.println("Test started!");

        // open test page
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
        sleep(1);

        // enter username
        driver.manage().window().maximize();
        System.out.println("Page is opened!");
        sleep(1);

        driver.close();
        System.out.println("Test finished!");
        sleep(1);
    }

    private void sleep(int seconds) {
        // sleep
        try {
            Thread.sleep(1000L * seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
