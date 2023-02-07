package pages;

import actions.Actions;
import actions.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class PaginaDeAutentificare extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);

    private final By campEmail = By.xpath("//input[@id='login_email']");

    private final By campParola = By.xpath("//input[@id='login_pass']");


    public PaginaDeAutentificare introduEmail(String email){
        LOG.info("Introdu Email: {}", email);
        mouseActions.clickOn(campEmail);
        keyboardActions.clearTheText(campEmail);
        keyboardActions.typeText(campEmail, email);

        WaitStrategy.waitFor(Duration.ofSeconds(2));

        return this;
    }

    public PaginaDeAutentificare introduParola(String parola){
        LOG.info("Introdu parola: {}",parola);
        mouseActions.clickOn(campParola);
        keyboardActions.clearTheText(campParola);
        keyboardActions.typeText(campParola, parola);
        keyboardActions.typeText(campParola, String.valueOf(Keys.ENTER));

        WaitStrategy.waitFor(Duration.ofSeconds(5));

        return this;
    }
}
