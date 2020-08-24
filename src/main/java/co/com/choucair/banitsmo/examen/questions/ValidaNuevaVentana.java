package co.com.choucair.banitsmo.examen.questions;

import co.com.choucair.banitsmo.examen.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class ValidaNuevaVentana implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidaNuevaVentana.class);

    @Override
    public Boolean answeredBy(Actor actor) {
        LOGGER.info(Utilitarios.formatiarAviso("validando que se abrio una ventana nueva"));
        Set<String> windowHandles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
        return windowHandles.size() > 1;
    }
}
