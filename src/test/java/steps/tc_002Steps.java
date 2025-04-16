package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("Usuario autenticado y en la página de carga de documentos")
    public void usuarioAutenticadoYEnLaPaginaDeCargaDeDocumentos() {
        page.openUploadPage();
        Assert.assertTrue(page.isUploadPageDisplayed());
    }

    @When("Seleccionar un archivo con formato no permitido")
    public void seleccionarUnArchivoConFormatoNoPermitido() {
        page.selectFile("path/to/file.exe");
    }

    @When("Hacer clic en el botón 'Cargar'")
    public void hacerClicEnElBotonCargar() {
        page.clickUploadButton();
    }

    @Then("Se muestra mensaje 'Formato de archivo no permitido'")
    public void seMuestraMensajeFormatoDeArchivoNoPermitido() {
        Assert.assertEquals("Formato de archivo no permitido", page.getErrorMessage());
    }
}