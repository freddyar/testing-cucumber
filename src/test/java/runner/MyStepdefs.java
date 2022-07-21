package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author freddyar
 */
public class MyStepdefs {

    /*  regular expression / cucumber expression
     *  {}      --- convertir varias palabras en argumentos
     *  {string}---- convertir una palabra en comillas dobles "valor" como argumento
     *  {int}   --- convertir un valor int como argumento
     *  {float} --- convertir valores flotantes como argumento
     *  {word}  --- convertir una palabra en argumento
     * */

    @Given("tengo acceso a {}")
    public void tengoAccesoATodoLy(String appUrl) {
    }

    @When("realizo click en el botón login")
    public void realizoClickEnElBotónLogin() {
    }

    @And("ingreso mi correo electrónico: {string}")
    public void ingresoMiCorreoElectrónicoMaestriaMaestriaCom(String email) {
    }

    @And("ingreso mi password: {int}")
    public void ingresoMiPassword(int arg0) {
    }

    @Then("debería ingresar a la aplicación")
    public void deberíaIngresarALaAplicación() {
    }
}
