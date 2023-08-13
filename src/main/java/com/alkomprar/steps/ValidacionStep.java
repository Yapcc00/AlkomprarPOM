package com.alkomprar.steps;

import com.alkomprar.pages.ValidacionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidacionStep {
    @Page
    ValidacionPage validacionPage;

    @Step("Validacion de correo")

    public void validacionCorreo() {
        Assert.assertTrue(
                validacionPage.getDriver().findElement(
                        validacionPage.getLBLCuenta()).isDisplayed());
    }

    @Step("Validacion de producto")

    public void validacionProducto() {
        Assert.assertTrue(
                validacionPage.getDriver().findElement(
                        validacionPage.getCantidad()).isDisplayed());
    }

}
