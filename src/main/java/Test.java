import login.LoginPage;
import searching.SearchingPage;
import utilities.Utils;
import welcome.WelcomePage;

public class Test {
    public static void main(String[] args) {
        Utils.instantiate();
        WelcomePage.clickRegisterButton();
        LoginPage.setUsernameAndPassword();
        SearchingPage.testSearch("bluza");
        Utils.closeDriver();
    }
}


