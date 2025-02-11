import java.util.*;

public class Estadistica {
    private ArrayList<Integer> conjunto;

    public Estadistica(){
        conjunto = new ArrayList<>();
    }
    public Estadistica(ArrayList<Integer> numeros){
        conjunto = numeros;
    }

    public int Media_Aritmetica(ArrayList<Integer> datos){
        if(datos.size() == 0){
            return 0;
        }
        int sumatorio = 0;
        for(int numero : datos){
            sumatorio += numero;
        }
        return sumatorio / datos.size();
    }



}