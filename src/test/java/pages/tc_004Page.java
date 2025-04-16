package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {

    WebDriver driver;
    By fileInput = By.id("file-upload");
    By cancelButton = By.id("cancel-button");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAsAuthenticatedUser() {
        // lógica de autenticación del usuario
    }

    public void uploadFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public boolean isFileDisplayedInForm() {
        // lógica para verificar si el archivo está cargado en el formulario
        return true; // ajustar según la implementación
    }

    public void clickCancelButton() {
        driver.findElement(cancelButton).click();
    }

    public boolean isFormReset() {
        // lógica para verificar que el formulario está reiniciado
        return true; // ajustar según la implementación
    }
}