package pages;

import actions.Actions;
import actions.WaitStrategy;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class CosCumparaturi  extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);

    private final By butonVizualizareComanda = By.xpath("//a[contains(text(),'Vezi Comanda')]");

    public CosCumparaturi vizualizareComanda(){
        LOG.info("Vizualizare comanda");

        mouseActions.clickOn(butonVizualizareComanda);
        WaitStrategy.waitFor(Duration.ofSeconds(5));
        return this;
    }
}
