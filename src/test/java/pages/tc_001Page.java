package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {

    WebDriver driver;

    @FindBy(id = "uploadSection")
    private WebElement seccionCarga;

    @FindBy(id = "fileInput")
    private WebElement campoCargaArchivo;

    @FindBy(id = "uploadButton")
    private WebElement botonCargar;

    @FindBy(id = "successMessage")
    private WebElement mensajeExito;

    @FindBy(xpath = "//table[@id='fileList']/tbody/tr")
    private WebElement listaDocumentos;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean estaEnPaginaCargaDocumentos() {
        return seccionCarga.isDisplayed();
    }

    public void subirArchivo(String rutaArchivo) {
        campoCargaArchivo.sendKeys(rutaArchivo);
    }

    public boolean campoCargaArchivoAceptaEntrada() {
        return !campoCargaArchivo.getAttribute("value").isEmpty();
    }

    public void hacerClicEnCargar() {
        botonCargar.click();
    }

    public boolean mensajeCargaExitosaMostrado() {
        return mensajeExito.isDisplayed();
    }

    public boolean documentoAñadidoALaLista() {
        return listaDocumentos.isDisplayed();
    }
}