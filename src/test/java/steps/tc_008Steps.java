package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import static org.junit.Assert.*;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("el usuario está autenticado y en la página de carga de documentos")
    public void el_usuario_esta_autenticado_y_en_la_pagina_de_carga_de_documentos() {
        page.autenticarUsuario();
        assertTrue(page.estaEnPaginaDeCarga());
    }

    @When("selecciona varios archivos PDF válidos")
    public void selecciona_varios_archivos_PDF_validos() {
        page.seleccionarArchivosPDF();
        assertTrue(page.archivosSeleccionadosSonValidos());
    }

    @When("hace clic en el botón 'Cargar'")
    public void hace_clic_en_el_boton_Cargar() {
        page.hacerClicEnCargar();
    }

    @Then("todos los documentos se cargan correctamente y aparecen en la lista")
    public void todos_los_documentos_se_cargan_correctamente_y_aparecen_en_la_lista() {
        assertTrue(page.documentosCargadosCorrectamente());
    }
}