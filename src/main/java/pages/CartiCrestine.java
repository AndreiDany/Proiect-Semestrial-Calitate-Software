package pages;

import actions.Actions;
import actions.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class CartiCrestine extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);
    private final By butonAdaugaInCos = By.xpath("//body/div[6]/div[1]/div[1]/main[1]/div[8]/form[1]/ul[1]/li[1]/article[1]/div[1]/figure[1]/figcaption[1]/div[1]/a[1]");

    private final By butonCosCumparaturi = By.xpath("//header/div[2]/div[1]/nav[2]/ul[1]/li[3]/a[1]");

    private final By butonCarte = By.xpath("//body/div[6]/div[1]/div[1]/main[1]/div[8]/form[1]/ul[1]/li[2]/article[1]/div[1]/figure[1]/a[1]/div[1]/span[1]/img[1]");


    public CartiCrestine adaugaInCos(){
        LOG.info("Adauga in cos");

        mouseActions.scrollDown();
        mouseActions.clickOn(butonAdaugaInCos);
        WaitStrategy.waitFor(Duration.ofSeconds(3));
        return this;
    }

    public CartiCrestine cosCumparaturi(){
        LOG.info("Cos cumparaturi");

        mouseActions.clickOn(butonCosCumparaturi);
        WaitStrategy.waitFor(Duration.ofSeconds(7));

        return this;
    }
    public Produs alegeCarte(){
        LOG.info("Alege cartea");

        mouseActions.clickOn(butonCarte);
        WaitStrategy.waitFor(Duration.ofSeconds(2));

        return new Produs();
    }

}
