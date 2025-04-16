package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
  
    WebDriver driver;

    By botonCargar = By.id("cargarButton");
    By mensajeError = By.id("errorMensaje");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void autenticarUsuario() {
        // Lógica de autenticación
    }

    public String obtenerTituloPagina() {
        // Retornar el título de la página actual
        return driver.getTitle();
    }

    public void simularConexionInestable() {
        // Simular conexión inestable durante la carga
    }

    public void clickEnCargar() {
        driver.findElement(botonCargar).click();
    }

    public String obtenerMensajeDeError() {
        return driver.findElement(mensajeError).getText();
    }
}