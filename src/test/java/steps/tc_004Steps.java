package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver;
    tc_004Page page;

    @Given("El usuario está autenticado y en proceso de carga con un archivo seleccionado")
    public void usuarioAutenticadoConArchivoSeleccionado() {
        driver = // instanciar y configurar el WebDriver
        page = new tc_004Page(driver);
        page.loginAsAuthenticatedUser();
        page.uploadFile("ruta/al/archivo");
        Assert.assertTrue("El archivo debería mostrarse en el formulario", 
                          page.isFileDisplayedInForm());
    }

    @When("El usuario hace clic en el botón 'Cancelar'")
    public void usuarioCancelaCarga() {
        page.clickCancelButton();
    }

    @Then("El formulario se reinicia y se descarta el archivo seleccionado")
    public void formularioReiniciado() {
        Assert.assertTrue("El formulario debería estar reiniciado y sin archivo seleccionado",
                          page.isFormReset());
    }
}