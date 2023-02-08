package pages;

import actions.Actions;
import actions.WaitStrategy;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class Cani extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);

    private final By butonCana = By.xpath("//body/div[6]/div[1]/div[1]/main[1]/div[7]/form[1]/ul[1]/li[1]/article[1]/div[1]/figure[1]/a[1]/div[1]/span[1]/img[1]");


    public Produs selecteazaCana(){
        LOG.info("selecteaza cana");

        mouseActions.scrollDown();
        mouseActions.clickOn(butonCana);
        WaitStrategy.waitFor(Duration.ofSeconds(3));

        return new Produs();
    }
}
