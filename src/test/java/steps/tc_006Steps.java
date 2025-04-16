package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page page;

    @Given("el usuario ha iniciado sesión y navega a la sección de carga")
    public void usuarioAutenticadoYNavegaASeccionCarga() {
        page = new tc_006Page(driver);
        page.navegarASeccionCarga();
    }

    @Given("la interfaz muestra la opción de vista previa")
    public void interfazMuestraOpcionVistaPrevia() {
        boolean esVisible = page.verificarOpcionVistaPrevia();
        Assert.assertTrue("La opción de vista previa no está visible", esVisible);
    }

    @When("el usuario selecciona un archivo PDF válido")
    public void usuarioSeleccionaArchivoPDFValido() {
        page.subirArchivoPDF();
    }

    @Then("el sistema muestra una vista previa del documento cargado")
    public void sistemaMuestraVistaPreviaDocumentoCargado() {
        boolean vistaPreviaVisible = page.verificarVistaPreviaDocumento();
        Assert.assertTrue("El documento cargado no se muestra en vista previa", vistaPreviaVisible);
    }
}