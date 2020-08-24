package co.com.choucair.banitsmo.examen.questions;

import net.serenitybdd.screenplay.Question;

public class Valida {

    private Valida() {
    }

    public static Question<Boolean> abreNuevaVentana() {
        return new ValidaNuevaVentana();
    }

    public static Question<Boolean> existenciaArchivo() {
        return new ValidaArchivoEmbebido();
    }

}
