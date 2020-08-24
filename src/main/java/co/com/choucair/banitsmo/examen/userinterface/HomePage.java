package co.com.choucair.banitsmo.examen.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class HomePage extends PageObject {
    public static final Target LINK_TARIFARIO = Target.the("opcion para ir al tarifario de los servicios del banco")
            .locatedBy("//a[contains(text(), 'Tarifario')]");
}
