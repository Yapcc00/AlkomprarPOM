package com.alkomprar.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {


    private final By txtBusqueda = By.xpath("//*[@id='downshift-0-input']");

    By btnLogin = By.xpath("//button[contains(@class, 'js-btn-register-myaccount')]");

    public By getBtnLogin() {
        return btnLogin;
    }

    private final By nombre = By.name("firstName");

    private final By ingreso = By.xpath("//a[contains(.,'Mi cuenta')]");

    private final By apellido = By.name("lastName");

    private final By celular = By.id("register.mobileNumber");

    private final By miPerfil =By.cssSelector(".link");

    public By getMiPerfil() {
        return miPerfil;
    }

    private final By correoElectronico = By.id("js-login-email");

    private final By check = By.xpath("//label[@for='registerChkTermsConditions']");

    private final By btnContinue = By.id("js-login-continue");

    public By getTxtBusqueda() {
        return txtBusqueda;
    }

    public By getNombre() {
        return nombre;
    }

    public By getIngreso() {
        return ingreso;
    }

    public By getApellido() {
        return apellido;
    }

    public By getCelular() {
        return celular;
    }

    public By getCorreoElectronico() {
        return correoElectronico;
    }

    public By getCheck() {
        return check;
    }

    public By getBtnContinue() {
        return btnContinue;
    }






}
