package com.alkomprar.utils;

import com.alkomprar.pages.ProductoPage;
import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HabilitarBoton extends PageObject {

    @Page
    ProductoPage productoPage;
    private WebDriver driver;

    public HabilitarBoton (WebDriver driver) {
        this.driver = driver;
    }
    public void habilitarBotonBuscar() {
        WebElement botonBuscar = driver.findElement(productoPage.getBtnBuscar());

        if (botonBuscar.getAttribute("disabled") != null) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('disabled');", botonBuscar);
        }
    }
}
