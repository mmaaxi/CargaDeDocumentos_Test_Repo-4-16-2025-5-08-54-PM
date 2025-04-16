package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAndNavigateToUploadPage() {
        // Lógica para autenticarse y navegar a la página de carga
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}