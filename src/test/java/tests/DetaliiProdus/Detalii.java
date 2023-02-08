package tests.DetaliiProdus;

import org.testng.annotations.Test;
import tests.BaseTest;

public class Detalii extends BaseTest {

    @Test(description = "Detaliile unui produs")
    public void detaliileProdusului() {
        homePage
                .selectareCategorieProduse()
                .alegeCarte()
                .deruleazaLaDetaliiProdus();
    }
}
