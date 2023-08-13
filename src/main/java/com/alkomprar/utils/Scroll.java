package com.alkomprar.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll extends PageObject {

    private WebDriver driver;

    public Scroll(WebDriver driver){
            this.driver = driver;
        }

    public void scrollPagina(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + pixels + ");");
    }
}
