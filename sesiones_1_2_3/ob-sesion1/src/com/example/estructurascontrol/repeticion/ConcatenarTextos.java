package com.example.estructurascontrol.repeticion;



public class ConcatenarTextos {

    public static void main(String[] args) {

        String[] nombres = {"Pepito", "Juanit", "eveready"};
        
        String allNames = "";
         for(String nombre : nombres){
            allNames += nombre + " ";
        }
        System.out.println(allNames);
        

    }
}
