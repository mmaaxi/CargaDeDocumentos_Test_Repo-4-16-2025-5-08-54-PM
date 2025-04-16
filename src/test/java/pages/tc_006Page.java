package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    WebDriver driver;
    By opcionVistaPrevia = By.id("vistaPrevia");
    By inputArchivo = By.id("inputArchivo");
    By vistaPreviaDocumento = By.id("vistaPreviaDocumento");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarASeccionCarga() {
        driver.navigate().to("https://ejemplo.com/seccion-carga");
    }

    public boolean verificarOpcionVistaPrevia() {
        return driver.findElement(opcionVistaPrevia).isDisplayed();
    }

    public void subirArchivoPDF() {
        driver.findElement(inputArchivo).sendKeys("/ruta/al/archivo.pdf");
    }

    public boolean verificarVistaPreviaDocumento() {
        return driver.findElement(vistaPreviaDocumento).isDisplayed();
    }
}