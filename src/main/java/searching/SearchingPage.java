package searching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utils;

public class SearchingPage {
    private static By SEARCH_FIELD = By.cssSelector("#search_query_top");
    private static By SEARCH_BUTTON = By.xpath("//*[@id=\"searchbox\"]/div/span/button");

    public static void testSearch(String searchStr) {
        WebElement searchField = Utils.driver.findElement(SEARCH_FIELD);
        searchField.sendKeys(searchStr);
        Utils.driver.findElement(SEARCH_BUTTON).click();
    }
}

