package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_003Page;

public class tc_003Steps {
    
    WebDriver driver;
    tc_003Page page = PageFactory.initElements(driver, tc_003Page.class);

    @Given("El usuario está autenticado y en la página de carga de documentos")
    public void usuarioAutenticadoEnPaginaDeCarga() {
        page.loginAndNavigateToUploadPage();
    }

    @When("El usuario selecciona un archivo que excede el tamaño máximo permitido")
    public void usuarioSeleccionaArchivoGrande() {
        page.selectLargeFile();
    }

    @When("El usuario hace clic en el botón 'Cargar'")
    public void usuarioHaceClicEnCargar() {
        page.clickUploadButton();
    }

    @Then("Se muestra un mensaje de error indicando que el archivo excede el tamaño máximo permitido")
    public void mensajeErrorTamañoMaximo() {
        page.verifyErrorMessage();
    }
}