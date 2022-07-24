package runner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LeftSection;

/**
 * @author freddyar
 */
public class StepsProjects {

    LeftSection leftSection = new LeftSection();

    @When("yo creo un proyecto con el nombre {string}")
    public void yoCreoUnProyectoConElNombre(String projectName) {
        leftSection.addNewProjectButton.click();
        leftSection.newProjectTextBox.writeText(projectName);
        leftSection.addButton.click();
    }

    @Then("el proyecto {string} deberia ser mostrado")
    public void elProyectoDeberiaSerMostrado(String projectName) {
        Assertions.assertTrue(leftSection.isNameProjectDisplayed(projectName), "ERROR! el proyecto no es mostrado");
    }

    @When("yo atualizo el proyeto {string} con el nombre {string}")
    public void yoAtualizoElProyetoConElNombre(String oldProjectName, String newProjectName) {
        leftSection.clickNameProject(oldProjectName);
        leftSection.menuButton.click();
        leftSection.editOption.click();
        leftSection.editProjectTextBox.writeText(newProjectName);
        leftSection.saveButton.click();
    }
}
