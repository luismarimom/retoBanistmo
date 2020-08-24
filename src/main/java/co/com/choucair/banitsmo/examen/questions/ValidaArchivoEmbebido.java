package co.com.choucair.banitsmo.examen.questions;

import co.com.choucair.banitsmo.examen.interactions.GoTo;
import co.com.choucair.banitsmo.examen.userinterface.PdfDepositoPage;
import co.com.choucair.banitsmo.examen.util.Utilitarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidaArchivoEmbebido implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidaArchivoEmbebido.class);

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                GoTo.lastWindow(actor)
        );
        Utilitarios.esperaExplicita(7000L);
        LOGGER.info(Utilitarios.formatiarAviso("validando que el tag embed este presente"));
        return Presence.of(PdfDepositoPage.TAG_EMBED).viewedBy(actor).resolve();
    }
}
