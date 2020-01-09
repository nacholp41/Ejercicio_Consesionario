package Ej_Onready;
import java.text.DecimalFormat;



public  class Auto extends Vehiculo {
    DecimalFormat df=new DecimalFormat("00,000.00");
    
    private int puertas;
    
    public Auto (String Marca,String Modelo, int puertas, float precio){
        super(Marca, Modelo, precio);
        this.puertas=puertas;
    } 
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public String toString(){
        return "Marca: "+marca+" // Modelo: "+getModelo()+" // Puertas: "+puertas+" // Precio: $"+df.format(getPrecio());
    }    
}
