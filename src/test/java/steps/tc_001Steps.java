package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    @Given("Usuario autenticado y en la página de carga de documentos")
    public void usuarioAutenticadoYEnPaginaCargaDocumentos() {
        // Código que inicializa el driver y navega a la página autenticada
        page = PageFactory.initElements(driver, tc_001Page.class);
        assertTrue(page.estaEnPaginaCargaDocumentos());
    }

    @When("Selecciona un archivo PDF válido")
    public void seleccionaArchivoPDFValido() {
        // Código para seleccionar archivo
        page.subirArchivo("ruta/del/archivo.pdf");
        assertTrue(page.campoCargaArchivoAceptaEntrada());
    }

    @When("Hace clic en el botón 'Cargar'")
    public void haceClicEnBotonCargar() {
        // Código para hacer clic en el botón 'Cargar'
        page.hacerClicEnCargar();
    }

    @Then("El sistema muestra mensaje de éxito y el documento se añade a la lista")
    public void sistemaMuestraMensajeExitoYDocumentoSeAñade() {
        // Verificación de mensaje de éxito y documento en lista
        assertTrue(page.mensajeCargaExitosaMostrado());
        assertTrue(page.documentoAñadidoALaLista());
    }
}