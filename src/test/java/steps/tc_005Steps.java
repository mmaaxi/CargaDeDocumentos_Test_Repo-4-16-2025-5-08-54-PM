package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_005Page;
import static org.junit.Assert.assertEquals;

public class tc_005Steps {

    WebDriver driver;
    tc_005Page cargaPage = PageFactory.initElements(driver, tc_005Page.class);

    @Given("el usuario está autenticado y en la página de carga de documentos")
    public void el_usuario_está_autenticado_y_en_la_página_de_carga_de_documentos() {
        cargaPage.loginAndNavigateToUploadPage();
    }

    @When("el usuario no selecciona ningún archivo y hace clic en el botón 'Cargar'")
    public void el_usuario_no_selecciona_ningún_archivo_y_hace_clic_en_el_botón_cargar() {
        cargaPage.clickUploadButton();
    }

    @Then("se muestra el mensaje de error 'No se ha seleccionado archivo'")
    public void se_muestra_el_mensaje_de_error_no_se_ha_seleccionado_archivo() {
        String expectedMessage = "No se ha seleccionado archivo";
        assertEquals(expectedMessage, cargaPage.getErrorMessage());
    }
}