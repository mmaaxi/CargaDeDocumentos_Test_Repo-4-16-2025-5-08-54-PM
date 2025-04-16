package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_007Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class tc_007Steps {
  
    WebDriver driver;
    tc_007Page cargaPage;
    WebDriverWait wait;

    @Given("^El usuario está autenticado y en la página de carga de documentos$")
    public void el_usuario_esta_autenticado_y_en_la_pagina_de_carga_de_documentos() {
        // Inicializar el driver y navegar a la página de carga
        cargaPage = new tc_007Page(driver);
        cargaPage.autenticarUsuario();
        assertEquals("Página de carga", cargaPage.obtenerTituloPagina());
    }

    @When("^Se simula inestabilidad en la conexión durante la carga$")
    public void se_simula_inestabilidad_en_la_conexion_durante_la_carga() {
        // Simular la inestabilidad de la conexión
        cargaPage.simularConexionInestable();
    }

    @When("^Hace clic en 'Cargar'$")
    public void hace_clic_en_cargar() {
        // Ejecutar la acción de cargar
        cargaPage.clickEnCargar();
    }

    @Then("^Se muestra el mensaje de error 'Error de conexión, intente nuevamente'$")
    public void se_muestra_el_mensaje_de_error() {
        // Verificar el mensaje de error
        assertEquals("Error de conexión, intente nuevamente", cargaPage.obtenerMensajeDeError());
    }
}