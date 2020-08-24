package co.com.choucair.banitsmo.examen.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class GoTo {

    private GoTo() {
    }

    public static Performable lastWindow(Actor actor) {
        WebDriver webDriver = BrowseTheWeb.as(actor).getDriver();
        String lastWindow = "";
        Set<String> windowHandles = webDriver.getWindowHandles();

        for (String window : windowHandles) {
            lastWindow = window;
        }
        return Switch.toWindow(lastWindow);
    }
}
