package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.ProductoAleatorioStep;
import com.alkomprar.steps.ProductoStep;
import com.alkomprar.steps.ValidacionStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class ProductoStepDefinitions {

    @Steps
    ProductoStep productoStep;
    @Steps
    ValidacionStep validaciones;

    @Steps
    ProductoAleatorioStep aleatorioStep;

    @Dado("que el usuario se encuentra en el inicio de la pagina")
    public void queElUsuarioSeEncuentraEnElInicioDeLaPagina() {
        productoStep.inicio();
        productoStep.buscarProducto();
    }
    @Cuando("ralice una busqueda del producto aleatoriamente y de clic")
    public void raliceUnaBusquedaDelProductoAleatoriamenteYDeClic() {
        aleatorioStep.busquedaAleatoria();
        productoStep.agregarCarrito();
    }
    @Entonces("el producto deberia aparecer en el carrito con la cantidad de uno")
    public void elProductoDeberiaAparecerEnElCarritoConLaCantidadDeUno() {
        validaciones.validacionProducto();
    }
}
