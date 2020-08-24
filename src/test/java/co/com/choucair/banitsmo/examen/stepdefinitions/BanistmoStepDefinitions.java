package co.com.choucair.banitsmo.examen.stepdefinitions;

import co.com.choucair.banitsmo.examen.questions.Valida;
import co.com.choucair.banitsmo.examen.tasks.Abrir;
import co.com.choucair.banitsmo.examen.tasks.Busca;
import co.com.choucair.banitsmo.examen.tasks.Ingresa;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BanistmoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario ingresa a la pagina de Banistmo$")
    public void elUsuarioIngresaALaPaginaDeBanistmo() {
        OnStage.theActor("luis").wasAbleTo(
                Ingresa.aLaPaginaBanistmo()
        );
    }

    @When("^se dirige al tarifario del banco$")
    public void seDirigeAObjetosExtraviados() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Busca.tarifario()
        );
    }

    @When("^se da clic a la imagen de pdf para ver las tarifas cuenta deposito$")
    public void seDaClicALaImagenDePdfParaVerLasTarifas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Abrir.tarifaCuentaDeposito()
        );
    }

    @Then("^valida que el archivo de tarifas se abra en una nueva ventana$")
    public void validaQueElArchivoDePoliticasSeAbraEnUnaNuevaVentana() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("se abre el pdf en una nueva ventana", Valida.abreNuevaVentana())
        );
    }

    @Then("^valida que se abre el archivo embebido$")
    public void validaQueSeAbreElArchivoConTitulo() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("se visualiza el archivo", Valida.existenciaArchivo())
        );
    }
}
