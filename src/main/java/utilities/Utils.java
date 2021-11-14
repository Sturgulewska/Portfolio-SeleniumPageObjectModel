package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Utils {
    public static WebDriver driver;

    public static WebDriver instantiate() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://bbbazaar.pl/");
        return driver;
    }

    public static void closeDriver() {
        driver.close();
    }
}
