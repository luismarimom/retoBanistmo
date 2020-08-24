package co.com.choucair.banitsmo.examen.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class TarifarioPage {
    public static final Target PDF_TARIFA = Target.the("icono para abrir archivo de tarifa de cuenta de deposito")
            .locatedBy("//span[contains(text(), 'Tarifas de Cuentas de Depósitos')]//following::img[1]");
}
