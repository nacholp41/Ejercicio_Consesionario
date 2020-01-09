package Ej_Onready;
import java.text.DecimalFormat;


public  class Moto extends Vehiculo{
    DecimalFormat df= new DecimalFormat("00,000.00");
    private int cilindrada;
    public Moto(String Marca,String Modelo, int cilindrada,float precio){
        super(Marca, Modelo, precio);
        this.cilindrada=cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public String toString(){
        
        return "Marca: "+marca+" // Modelo: "+getModelo()+" // Cilindrada: "+cilindrada+"c // Precio: $"+df.format(getPrecio());
    }
}