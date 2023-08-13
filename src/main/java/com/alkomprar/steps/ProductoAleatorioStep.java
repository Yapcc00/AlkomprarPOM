package com.alkomprar.steps;


import com.alkomprar.utils.ListaAleatoria;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ProductoAleatorioStep {

    @Page
    ListaAleatoria aleatoria;

    @Step("Buscar Aleatoriamente")
    public void busquedaAleatoria() {
        aleatoria.listaProductosRandom().click();
    }



}
