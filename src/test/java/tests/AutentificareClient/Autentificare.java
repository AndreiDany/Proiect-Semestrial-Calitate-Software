package tests.AutentificareClient;

import config.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Autentificare extends BaseTest {

    @Test(description = "Autentificare")
    public void autentificareClient(){
        homePage
                .autentificare()
                .introduEmail("daniel.andrei@emanuel.ro")
                .introduParola("12345678");

    }
}