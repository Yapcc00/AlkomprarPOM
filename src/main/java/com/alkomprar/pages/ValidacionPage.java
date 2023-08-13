package com.alkomprar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ValidacionPage extends PageObject {

    private final By Cantidad = By.xpath("//div[@class=\"row cart-content\"]");
    private final By LBLCuenta = By.xpath("//div[@class=\"account-section-header visible module-title\"]");

    public By getCantidad() {
        return Cantidad;
    }

    public By getLBLCuenta() {
        return LBLCuenta;
    }
}
