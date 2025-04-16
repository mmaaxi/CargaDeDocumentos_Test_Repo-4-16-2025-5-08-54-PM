package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    private By uploadPageLocator = By.id("uploadPage");
    private By fileInput = By.id("fileInput");
    private By uploadButton = By.id("uploadButton");
    private By errorMessageLocator = By.id("errorMessage");

    public void openUploadPage() {
        driver.get("https://example.com/upload");
    }

    public boolean isUploadPageDisplayed() {
        return driver.findElement(uploadPageLocator).isDisplayed();
    }

    public void selectFile(String filePath) {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys(filePath);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageLocator).getText();
    }
}