package orangewebsite;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class TestBase {
    public static WebDriver getWebDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }



}
