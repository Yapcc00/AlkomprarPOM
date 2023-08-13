package com.alkomprar.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListaAleatoria extends PageObject {

    private final By busquedaAleatoria = By.xpath("//h3[@class=\"product__item__top__title\"]");

    public WebElement listaProductosRandom() {
        return findAll(busquedaAleatoria).get((int) (Math.random() * findAll(busquedaAleatoria).size()));
    }
}


