package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("el usuario está autenticado y ha realizado una carga exitosa")
    public void el_usuario_autenticado_y_ha_realizado_una_carga_exitosa() {
        page.autenticarUsuario();
        boolean cargaExitosa = page.realizarCarga();
        Assert.assertTrue("Carga no fue exitosa", cargaExitosa);
    }

    @When("el usuario consulta el log de actividades")
    public void el_usuario_consulta_el_log_de_actividades() {
        page.consultarLogDeActividades();
    }

    @Then("se muestra una entrada con los detalles de la carga")
    public void se_muestra_una_entrada_con_los_detalles_de_la_carga() {
        boolean logCorrecto = page.verificarEntradaEnLog();
        Assert.assertTrue("El log no tiene los detalles correctos", logCorrecto);
    }
}