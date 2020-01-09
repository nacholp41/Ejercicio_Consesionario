package Ej_Onready;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Lista{
    DecimalFormat df=new DecimalFormat("00,000.00");
    String nombre;
    double precio;
    private ArrayList<Vehiculo>lista;

    public Lista(ArrayList<Vehiculo> lista) {
        this.lista = lista;
    }
    
    
    
    public Lista() {
        lista = new ArrayList<>();
    }
    
   public void addVehiculo(Vehiculo v1){
   lista.add(v1);
   
   }
   
   public void ordenar(){
   Collections.sort(lista);
   
       for (Vehiculo e : lista) {
           nombre=e.getMarca()+" "+e.getModelo();
        
           System.out.println(nombre);   
           
       }
       
 
    }
   
   
   public Vehiculo MayorPocicion() {
         float mayor=0;
         int indiceMayor=0;
         for (int i = 0; i < lista.size(); i++) {
           if (lista.get(i).getPrecio()>mayor){
               mayor=lista.get(i).getPrecio();
               indiceMayor=i;
           }
            
        }
       return lista.get(indiceMayor);
         
    }
   
    public String LetraY() {
        for (Vehiculo listas : lista) {
	        if(listas.getModelo() != null && listas.getModelo().contains("Y")) {
	        	nombre = listas.getMarca()+" "+listas.getModelo();
	        	precio =listas.getPrecio();
                }
        }
        return nombre+" "+"$"+df.format(precio);
    }

    public Vehiculo MenorPocicion() {
         float menor=0;
         int indiceMenor=0;
         for (int x = 0; x > lista.size(); x++) {
           if (lista.get(x).getPrecio()<menor){
               menor=lista.get(x).getPrecio();
               indiceMenor=x;
           }
            
        }
       return lista.get(indiceMenor);
         
    }
    
   
   

    @Override
    public String toString() {
        String cad ="";
        for (int i = 0; i < lista.size(); i++) {
           cad=cad+lista.get(i).toString()+"\n";
        }
        return cad;
    }
    
    
}
     
