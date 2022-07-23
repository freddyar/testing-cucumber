package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

import java.util.Map;

/**
 * @author freddyar
 */
public class StepLogin {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();

    @Given("la pagina {string} este abierta")
    public void laPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("yo quiero realizar el login")
    public void yoQuieroRealizarElLogin(Map<String, String> credentials) {

        mainPage.loginButton.click();
        loginModal.emailTextBox.writeText(credentials.get("email"));
        loginModal.passwordTextBox.writeText(credentials.get("password"));
        loginModal.loginButton.click();
    }

    @Then("yo deberia ingresar a la app web")
    public void yoDeberiaIngresarALaAppWeb() {
        Assertions.assertTrue(
                menuSection.logoutButton.isControlDisplayed(),
                "ERROR, login failed"
        );
    }
}
