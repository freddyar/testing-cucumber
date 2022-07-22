package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

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

    @And("los siguientes controles deberian ser mostrados")
    public void losSiguientesControlesDeberianSerMostrados(List<String> controles) {
        for (String control : controles) {
            System.out.println(control);
        }
    }

    @And("ingreso a la aplicacion usando")
    public void ingresoALaAplicacionUsando(Map<String, String> credentials) {
        for (String clave : credentials.keySet()) {
            System.out.println(clave + ": " + credentials.get(clave));
        }
    }

    @And("me registro a la pagina")
    public void meRegistroALaPagina(Registro registro) {
        System.out.println(registro);
    }

    @DataTableType
    public Registro convert(Map<String, String> entity) {
        return new Registro()
            .setName(entity.get("name"))
            .setPhone(entity.get("phone"))
            .setAddress(entity.get("address"))
            .setCi(entity.get("ci"));
    }
}
