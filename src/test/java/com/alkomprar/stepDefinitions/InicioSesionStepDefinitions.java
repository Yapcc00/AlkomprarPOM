package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.InicioSesionStep;
import com.alkomprar.steps.ValidacionStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class InicioSesionStepDefinitions {
    @Steps
    InicioSesionStep inicioSesionStep;
    @Steps
    ValidacionStep validaciones;

    @Dado("que el usuario abre la pagina alkomprar")
    public void queElUsuarioAbreLaPaginaAlkomprar() {
     inicioSesionStep.abrirNavegador();
    }

    @Cuando("inicie sesion o registre su cuenta valida")
    public void inicieSesionORegistreSuCuentaValida() {
    inicioSesionStep.IngresarAMicuenta();
    inicioSesionStep.InicioSesion();
    inicioSesionStep.IngresoCredenciales();
    }

    @Entonces("deberia tener acceso a la navegacion completa del sitio web")
    public void deberiaTenerAccesoALaNavegacionCompletaDelSitioWeb() {
       validaciones.validacionCorreo();
    }



}
