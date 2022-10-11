/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apicolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author ingri
 */
public class ApiColecciones {
    static ArrayList<String> semana = new ArrayList<>();
    static HashSet <String> setMeses = new HashSet<>();
    static HashMap<String, String> Alumnos = new HashMap<String, String>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        System.out.println("Los dias de la semana son: "+semana);
        //recorremos el array list con un for 
        for (Object semanas: semana ) {
       
            System.out.println("semanas = "+semana);
        }
        //opcion 2
        for (int i = 0; i < semana.size(); i++) {
       
            System.out.println(semana.get(i));
        }
        //HashSet
        setMeses.add("ENERO");
        setMeses.add("FEBRERO");
        setMeses.add("MARZO");
        setMeses.add("ABRIL");
        setMeses.add("MAYO");
        setMeses.add(null);
        
        Iterator <String> irt=setMeses.iterator();
        while(irt.hasNext()){
            System.out.println(irt.next());
        }
        
        //hashMap
        Alumnos.put("1a", "Ana");
        Alumnos.put("2a", "Bea");
        Alumnos.put("3a", "Fer");
        Alumnos.put("4a", "Jon");
        Alumnos.put("5a", "Nacho");
        System.out.println(Alumnos);
        
        //invocamos el metodo imprimir 
        System.out.println("Imprimiendo mi lista");
        imprimir(semana);
        System.out.println("HashSet_____________________");
        imprimir(setMeses);
        System.out.println("HashMap_____________________");
        String elem = (String) Alumnos.get("1a");
        System.out.println("elem = "+ elem);
        //mostramos todas las claves de nuestro Map
        imprimir(Alumnos.keySet());
        //mostramos los valores de nuestro Map
        imprimir(Alumnos.values());
        //para imprimir todo 
        for (String clave : Alumnos.keySet()) {
            String valor= Alumnos.get(clave);
            System.out.println("clave: "+ clave+", valor: "+valor);
        }
    }
    
    public static void imprimir (Collection coleccion){
       coleccion.forEach(elem ->{
           System.out.println("elem = " +elem);
       });
    }
}
