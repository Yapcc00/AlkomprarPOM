package com.alkomprar.steps;

import com.alkomprar.models.Credenciales;
import com.alkomprar.pages.InicioSesionPage;
import com.alkomprar.utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;



public class InicioSesionStep {


    @Page
    InicioSesionPage inicioSesion;
    @Page
    Scroll scroll;

    @Step("Abrir Navegador")
    public void abrirNavegador(){
        inicioSesion.openUrl("https://www.alkomprar.com/");
    }

    @Step("Ingresar a Mi cuenta")
    public void IngresarAMicuenta(){
    inicioSesion.getDriver().findElement(inicioSesion.getIngreso()).click();
    }
    @Step("Inicio Sesion")
    public void InicioSesion(){

        String correo = Credenciales.data().get(1 ).get("Correo");
        inicioSesion.getDriver().findElement(inicioSesion.getCorreoElectronico()).sendKeys(correo);
        inicioSesion.getDriver().findElement(inicioSesion.getBtnContinue()).click();
    }

    @Step("Ingreso de credenciales")
    public void IngresoCredenciales(){
        String nombre = Credenciales.data().get(0).get("Nombre");
        String apellido = Credenciales.data().get(0).get("Apellido");
        String telefono = Credenciales.data().get(0).get("Telefono");

        inicioSesion.getDriver().findElement(inicioSesion.getNombre()).sendKeys(nombre);
        inicioSesion.getDriver().findElement(inicioSesion.getApellido()).sendKeys(apellido);
        inicioSesion.getDriver().findElement(inicioSesion.getCelular()).sendKeys(telefono);
        inicioSesion.getDriver().findElement(inicioSesion.getCheck()).click();
        scroll.scrollPagina(310);
        inicioSesion.getDriver().findElement(inicioSesion.getBtnLogin()).click();
        inicioSesion.getDriver().findElement(inicioSesion.getMiPerfil()).click();
    }







}
