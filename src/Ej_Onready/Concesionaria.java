package Ej_Onready;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;




public class Concesionaria {

   
    public static void main(String[] args) {
        
  
       
       Auto auto1 = new Auto("Peugeot", "206", 4, 200000);
       Moto moto1 = new Moto("Honda", "Titan", 125, 60000);
       Auto auto2 = new Auto("Peugeot", "208", 5, 250000);
       Moto moto2 = new Moto("Yamaha","YBR",160, 80500.50f);
        
       Lista listaVehiculos=new Lista();
        
       listaVehiculos.addVehiculo(auto1);
       listaVehiculos.addVehiculo(moto1);
       listaVehiculos.addVehiculo(auto2);
       listaVehiculos.addVehiculo(moto2);
       
      
      
       
        System.out.println(listaVehiculos.toString());
        System.out.println("=================================");
        System.out.println("vehiculo mas caro : "+listaVehiculos.MayorPocicion().getMarca()+" "+listaVehiculos.MayorPocicion().getModelo());
        System.out.println("vehiculo mas barato : "+listaVehiculos.MenorPocicion().getMarca()+" "+listaVehiculos.MenorPocicion().getModelo());
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’ es: "+listaVehiculos.LetraY());
        
        
        
        
        System.out.println("=================================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        listaVehiculos.ordenar();
      
    }
    
}
