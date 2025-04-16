import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_009Steps {

    private tc_009Page page;

    @Given("Usuario autenticado y con un documento cargado exitosamente")
    public void usuarioAutenticadoYConDocumentoCargado() {
        page = new tc_009Page();
        page.cargarDocumentoExitosamente();
    }

    @When("Verificar la base de datos o registro de sistema")
    public void verificarBaseDeDatosORegistroDeSistema() {
        page.verificarRegistroSistema();
    }

    @Then("El documento aparece en la lista de carga")
    public void elDocumentoApareceEnLaListaDeCarga() {
        page.verificarDocumentoEnListaCarga();
    }

    @Then("El documento aparece registrado en el sistema")
    public void elDocumentoApareceRegistradoEnElSistema() {
        page.verificarDocumentoEnRegistroSistema();
    }
}