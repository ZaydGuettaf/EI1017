package es.uji.badenas.aritmetica;

import java.nio.channels.FileLock;
import java.util.*;
import java.math.*;

public class Estadistica {
    private ArrayList<Integer> conjunto;

    public Estadistica(){
        conjunto = new ArrayList<>();
    }
    public Estadistica(ArrayList<Integer> numeros){
        conjunto = numeros;
    }

    public float Media_Aritmetica(ArrayList<Integer> datos){
        if(datos.size() == 0){
            return 0;
        }
        float sumatorio = 0;
        for(int numero : datos){
            sumatorio += numero;
        }
        return sumatorio / datos.size();
    }

    public float varianza(ArrayList<Integer> datos){
        if(datos.size() == 0){
                return 0;
        }
        float sumatorio = 0;
        float media = Media_Aritmetica(datos);
        for(float numero : datos){
            sumatorio += Math.pow((numero - media),2);
        }
        return sumatorio / datos.size();
    }

    public float desviacio_estandar(ArrayList<Integer> datos){
        return (float) Math.sqrt(varianza(datos));
    }

}
