package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import util.CustomLogger;

public class CartiCrestine extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);
    private final By butonAdaugaInCos = By.xpath("//body/div[6]/div[1]/div[1]/main[1]/div[8]/form[1]/ul[1]/li[1]/article[1]/div[1]/figure[1]/figcaption[1]/div[1]/a[1]");

    private final By butonCosCumparaturi = By.xpath("//body/div[6]/div[1]/div[1]/main[1]/div[8]/form[1]/ul[1]/li[1]/article[1]/div[1]/figure[1]/figcaption[1]/div[1]/a[1]");

    public CartiCrestine adaugaInCos(){
        LOG.info("Adauga in cos");

        mouseActions.clickOn(butonAdaugaInCos);
        return this;
    }

    public CosCumparaturi cosCumparaturi(){
        LOG.info("Cos cumparaturi");

        mouseActions.clickOn(butonCosCumparaturi);
        return new CosCumparaturi();
    }

}
