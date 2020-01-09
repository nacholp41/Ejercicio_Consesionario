package Ej_Onready;

import java.util.Collections;


public abstract class Vehiculo implements Comparable<Vehiculo>{
    protected String marca;
    private String modelo;
    private float precio;
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPrecio() {
        
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
     @Override
    public int compareTo(Vehiculo t) {
        if (precio> t.precio) {
             return -1;
        }
        if (precio < t.precio) {
            return 1;
             
         }
        return 0;
        
    }
    
    
    public abstract String toString();  
    
}
