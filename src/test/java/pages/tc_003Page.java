package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    
    WebDriver driver;

    By uploadInputField = By.id("upload-file-field");
    By uploadButton = By.id("upload-button");
    By errorMessage = By.id("error-message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAndNavigateToUploadPage() {
        // Implementación de inicio de sesión y navegación a la página de carga
    }

    public void selectLargeFile() {
        WebElement uploadField = driver.findElement(uploadInputField);
        uploadField.sendKeys("path_to_large_file");
    }

    public void clickUploadButton() {
        WebElement button = driver.findElement(uploadButton);
        button.click();
    }

    public void verifyErrorMessage() {
        WebElement error = driver.findElement(errorMessage);
        assert error.isDisplayed() && error.getText().contains("El archivo excede el tamaño máximo permitido");
    }
}