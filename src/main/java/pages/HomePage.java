package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import util.CustomLogger;

public class HomePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);

    private final By searchButton = By.xpath("//header/div[2]/div[1]/nav[2]/ul[1]/li[1]/a[1]");

    private final By searchBar = By.xpath("//input[@id='search_query']");

    private final By categorieProduse = By.xpath("//header/div[2]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]");


    public HomePage cautareProdus(String produs){
        LOG.info("Cauta produs: {}", produs);
        mouseActions.clickOn(searchButton);
        keyboardActions.clearTheText(searchBar);
        keyboardActions.typeText(searchBar, produs);
        keyboardActions.typeText(searchBar, String.valueOf(Keys.ENTER));

        return this;
    }

    public CartiCrestine selectareCategorieProduse(){
        LOG.info("selectare categorie produse");

        mouseActions.clickOn(categorieProduse);

        return new CartiCrestine();
    }

}
