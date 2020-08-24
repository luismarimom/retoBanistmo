package co.com.choucair.banitsmo.examen.tasks;

import co.com.choucair.banitsmo.examen.userinterface.TarifarioPage;
import co.com.choucair.banitsmo.examen.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Abrir implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(Abrir.class);

    public static Performable tarifaCuentaDeposito() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info(Utilitarios.formatiarAviso("abriendo pdf tarifas de cuentas de deposito"));
        actor.attemptsTo(
                Click.on(TarifarioPage.PDF_TARIFA)
        );
    }
}
