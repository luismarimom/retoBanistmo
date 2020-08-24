package co.com.choucair.banitsmo.examen.tasks;

import co.com.choucair.banitsmo.examen.userinterface.HomePage;
import co.com.choucair.banitsmo.examen.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Ingresa implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(Ingresa.class);
    public static Performable aLaPaginaBanistmo() {
        return Tasks.instrumented(Ingresa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info(Utilitarios.formatiarAviso("abriendo la web del banco"));
        actor.attemptsTo(Open.browserOn(new HomePage()));
    }
}
