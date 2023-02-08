package tests.GameDeProduse;

import org.testng.annotations.Test;
import tests.BaseTest;

public class SelectareProdusCantitativ extends BaseTest {

    @Test(description = "Selectare gama produse din imaginile de prezentare si cresterea cantitatii")
    public void detaliileProdus() {
        homePage
                .selectareCategorieProduseDinImagini()
                .selecteazaCana()
                .cresteCantitatea();

    }
}
