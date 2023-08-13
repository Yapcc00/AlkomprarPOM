package com.alkomprar.models;

import com.alkomprar.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Credenciales {
    public static ArrayList<Map<String, String>> credenciales = new ArrayList<>();

    public static ArrayList<Map<String, String>> data(){
        try {
            credenciales = Excel.leerDatosDeHojaDeExcel("src\\test\\resources\\data\\Data2.xlsx", "hojaInicioSesion");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return credenciales;
    }


}
