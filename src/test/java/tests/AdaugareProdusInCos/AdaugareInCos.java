package tests.AdaugareProdusInCos;

import config.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class AdaugareInCos extends BaseTest {

    @Test(description = "Adaugare produs in cos")
    public void adaugareInCos() {
        homePage
                .selectareCategorieProduse()
                .adaugaInCos()
                .cosCumparaturi();
    }
}
