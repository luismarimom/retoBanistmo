package co.com.choucair.banitsmo.examen.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PdfDepositoPage {

    public static final Target TAG_EMBED = Target.the("etiqueta que contiene el archivo pdf")
            .locatedBy("//embed");

}
