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
     *  {} --- convertir varias palabras en argumentos
     *  {string}---- convertir una palabra en comillas dobles "valor" como argumento
     *  {int}--- convertir un valor int como argumento
     *  {float}--- convertir valores flotantes como argumento
     *  {word} --- convertir una palabra en argumento
     * */

    @Given("tengo acceso a {}")
    public void tengoAccesoATodoLy(String app) {
    }

    @When("realizo click en el boton login")
    public void realizoClickEnElBotonLogin() {
    }

    @And("ingreso mi correo electronico: {string}")
    public void ingresoMiCorreoElectronico(String arg0) {
    }

    @And("ingreso mi password: {int}")
    public void ingresoMiPasswordPassword(int pass) {
    }

    @Then("deberia ingresar a la aplicacion")
    public void deberiaIngresarALaAplicacion() {
    }
}
