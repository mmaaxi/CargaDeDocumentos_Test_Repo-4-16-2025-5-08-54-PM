package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class tc_008Page {
    WebDriver driver;
    WebDriverWait wait;

    By uploadInput = By.id("upload-input");
    By uploadButton = By.id("upload-button");
    By documentList = By.id("document-list");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void autenticarUsuario() {
        // Código para autenticar al usuario y navegar a la página de carga de documentos
    }

    public boolean estaEnPaginaDeCarga() {
        // Verificar que se está en la página de carga de documentos
        // Retornar verdadero si la verificación es exitosa
        return driver.findElement(uploadInput).isDisplayed();
    }

    public void seleccionarArchivosPDF() {
        // Seleccionar varios archivos PDF en el elemento input
        WebElement input = driver.findElement(uploadInput);
        input.sendKeys("/path/to/firstFile.pdf\n/path/to/secondFile.pdf");
    }

    public boolean archivosSeleccionadosSonValidos() {
        // Validar que los archivos seleccionados son PDF válidos
        return true; // Aquí debería verificarse la validez
    }

    public void hacerClicEnCargar() {
        // Hacer clic en el botón de cargar
        driver.findElement(uploadButton).click();
    }

    public boolean documentosCargadosCorrectamente() {
        // Verificar que los documentos aparecen en la lista después de la carga
        List<WebElement> documents = driver.findElements(documentList);
        return documents.size() > 0; // Asumiendo que se agregan elementos a la lista
    }
}