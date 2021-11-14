package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utils;

public class WelcomePage {
    private static final WebElement REGISTER = Utils.driver.findElement(By.cssSelector("#header_right > div.header_user_info.pull-right > ul > li:nth-child(2) > a"));

    public static void clickRegisterButton() {
        REGISTER.click();
    }
}
