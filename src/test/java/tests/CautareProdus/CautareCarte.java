package tests.CautareProdus;

import config.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CautareCarte extends BaseTest {

    @Test(description = "Cautare carte")
    public void cautareProdus(){
        String produs = "Biblia";
        homePage
                .cautareProdus(produs);
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains(produs));
    }
}

