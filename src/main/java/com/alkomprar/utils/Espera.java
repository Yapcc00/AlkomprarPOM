package com.alkomprar.utils;

import com.alkomprar.pages.ProductoPage;
import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Espera extends PageObject {

    @Page
    ProductoPage productoPage;

    private WebDriver driver;

    public Espera (WebDriver driver) {
        this.driver = driver;
    }

    public void esperaClick () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(productoPage.getBtnBuscar()));
    }

    public void esperaPagar () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(productoPage.getBtnPagarCarrito()));
    }


}
