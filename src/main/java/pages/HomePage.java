package pages;

import actions.Actions;
import actions.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class HomePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);

    private final By butonCookie = By.xpath("//a[contains(text(),'Autentifică-te')]");

    private final By searchButton = By.xpath("//header/div[2]/div[1]/nav[2]/ul[1]/li[1]/a[1]");

    private final By searchBar = By.xpath("//input[@id='search_query']");

    private final By categorieProduse = By.xpath("//header/div[2]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]");

    private final By buttonDeAutentificare = By.xpath("//a[contains(text(),'Autentifică-te')]");

    private final By butonCani = By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[2]");


    public HomePage acceptareCookie() {

        mouseActions.clickOn(butonCookie);

           return this;
    }

    public HomePage cautareProdus(String produs){
        LOG.info("Cauta produs: {}", produs);
        mouseActions.clickOn(searchButton);
        keyboardActions.clearTheText(searchBar);
        keyboardActions.typeText(searchBar, produs);
        keyboardActions.typeText(searchBar, String.valueOf(Keys.ENTER));

        WaitStrategy.waitFor(Duration.ofSeconds(3));

        return this;
    }

    public CartiCrestine selectareCategorieProduse(){
        LOG.info("selectare categorie produse");

        mouseActions.clickOn(categorieProduse);

        return new CartiCrestine();
    }

    public PaginaDeAutentificare autentificare(){
        LOG.info("selectare buton autentificare");

        mouseActions.clickOn(buttonDeAutentificare);

        WaitStrategy.waitFor(Duration.ofSeconds(3));

        return new PaginaDeAutentificare();
    }

    public Cani selectareCategorieProduseDinImagini(){
        LOG.info("selectare categorie produse din imagini");

        mouseActions.scrollDown();
        WaitStrategy.waitFor(Duration.ofSeconds(2));
        mouseActions.clickOn(butonCani);

        return new Cani();
    }

}
