package com.alkomprar.steps;

import com.alkomprar.models.Productos;
import com.alkomprar.pages.ProductoPage;
import com.alkomprar.utils.Espera;
import com.alkomprar.utils.HabilitarBoton;
import com.alkomprar.utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ProductoStep {
   @Page
   ProductoPage productoPage;
   @Page
   HabilitarBoton habilitar;
   @Page
   Scroll scroll;
   @Page
   Espera espera;

   @Step("Inicio")
   public void inicio(){
      productoPage.openUrl("https://www.alkomprar.com/");
   }

   @Step("Buscar Producto")
   public void buscarProducto(){

      String txtProductosRandom = Productos.data().get(1).get("Tecnologia");
      productoPage.getDriver().findElement(productoPage.getbarraBusqueda()).sendKeys(txtProductosRandom);

      espera.esperaClick();
      habilitar.habilitarBotonBuscar();
      productoPage.getDriver().findElement(productoPage.getBtnBuscar()).click();
   }

   @Step("Agregar al carrito")
   public void agregarCarrito(){
      scroll.scrollPagina(350);
      productoPage.getDriver().findElement(productoPage.getBtnAgregarCarrito()).click();
      espera.esperaPagar();
      productoPage.getDriver().findElement(productoPage.getBtnPagarCarrito()).click();

   }
}
