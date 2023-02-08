package tests.DetaliiProdus;

import org.testng.annotations.Test;
import tests.BaseTest;

public class Detalii extends BaseTest {

    @Test(description = "Detaliile unui produs")
    public void detaliileProdus() {
        homePage
                .selectareCategorieProduse()
                .alegeCarte()
                .deruleazaLaDetaliiProdus();
    }
}
