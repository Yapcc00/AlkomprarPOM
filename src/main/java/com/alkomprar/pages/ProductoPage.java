package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class ProductoPage extends PageObject {

    private final By barraBusqueda = By.id("js-site-search-input");

    private final By btnBuscar = By.xpath("//*[@id=\"js-search-button\"]");

    public By getbarraBusqueda() {
        return barraBusqueda;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }
    private final By btnAgregarCarrito = By.cssSelector(".js-add-to-cart");

    private final By btnPagarCarrito = By.xpath("//*[@id=\"js-cart-modal\"]/div/div/div[3]/a");


    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public By getBtnPagarCarrito() {
        return btnPagarCarrito;
    }

}
