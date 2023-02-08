package pages;

import actions.Actions;
import actions.WaitStrategy;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class Produs extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);

    private final By butonCresteCantitatea = By.xpath("//body/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/section[6]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/button[2]");


    public Produs cresteCantitatea() {

        mouseActions.doubleClickOn(butonCresteCantitatea);
        WaitStrategy.waitFor(Duration.ofSeconds(4));
        return this;
    }

    public Produs deruleazaLaDetaliiProdus(){
        LOG.info("deruleaza in jos");

        mouseActions.scrollDown();

        WaitStrategy.waitFor(Duration.ofSeconds(2));

        mouseActions.scrollDown();

        WaitStrategy.waitFor(Duration.ofSeconds(5));

        return this;
    }
}
