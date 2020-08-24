package co.com.choucair.banitsmo.examen.tasks;

import co.com.choucair.banitsmo.examen.userinterface.HomePage;
import co.com.choucair.banitsmo.examen.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Busca implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(Busca.class);

    public static Performable tarifario() {
        return Tasks.instrumented(Busca.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info(Utilitarios.formatiarAviso("ingresando a tarifario"));
        actor.attemptsTo(
                Click.on(HomePage.LINK_TARIFARIO)
        );
    }
}
