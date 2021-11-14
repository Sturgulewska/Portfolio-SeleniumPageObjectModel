package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utils;


import java.io.*;

public class LoginPage {

    private static final By INPUT_USERNAME = By.id("email");
    private static final By INPUT_PASSWORD = By.id("passwd");
    private static final By LOGIN_SUBMIT = By.xpath("//*[@id=\"SubmitLogin\"]/span");

    public static void setUsernameAndPassword(){
        WebDriverWait wait = new WebDriverWait(Utils.driver, 360);
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(INPUT_USERNAME));
        usernameField.sendKeys("anna.sturgulewska@yahoo.pl");

        File file = new File("password.txt");
        String password = null;
        try(FileReader fr= new FileReader(file)){
            BufferedReader br= new BufferedReader(fr);
            String pass;
            pass=br.readLine();
            password=pass;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
        WebElement passwordField = Utils.driver.findElement(INPUT_PASSWORD);
        passwordField.sendKeys(password);
        WebElement submitCredentials = Utils.driver.findElement(LOGIN_SUBMIT);
        submitCredentials.click();

    }
}


