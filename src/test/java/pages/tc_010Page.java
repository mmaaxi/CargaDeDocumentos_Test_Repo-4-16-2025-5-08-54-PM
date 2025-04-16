package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    private WebDriver driver;

    private By logSection = By.id("log_section");
    private By logEntry = By.cssSelector(".log-entry");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void autenticarUsuario() {
        // Implementar lógica de autenticación
    }

    public boolean realizarCarga() {
        // Implementar lógica de carga de documentos
        // Simular carga exitosa
        return true;
    }

    public void consultarLogDeActividades() {
        driver.findElement(logSection).click();
    }

    public boolean verificarEntradaEnLog() {
        WebElement entry = driver.findElement(logEntry);
        // Verificar que los detalles de la carga están correctos
        String entryText = entry.getText();
        return entryText.contains("usuario") && entryText.contains("fecha") && entryText.contains("documento");
    }
}