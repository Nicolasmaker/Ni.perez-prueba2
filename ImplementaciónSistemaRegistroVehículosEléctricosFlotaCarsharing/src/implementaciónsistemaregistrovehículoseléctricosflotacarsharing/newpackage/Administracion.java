/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciónsistemaregistrovehículoseléctricosflotacarsharing.newpackage;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Cetecom
 */
public class Administracion implements ICostos {
    List<AtributosComunes> listaVehiculos = new ArrayList<>();

    public Administracion() {
    }
    
    
    
    public void agregarVehiculos(AtributosComunes parAtributosComunes){
        listaVehiculos.add(parAtributosComunes);
    }
    
    public void ListarVehiculos(){
        for(AtributosComunes i : listaVehiculos){
            if(i instanceof Autos){
                Autos auto = (Autos) i;
                System.out.println(" Codigo Alfanumerico: " + i.getCodigoAlfanumerico() +
                                   " Pasajero que lleva: " + ((Autos) i).getPasajerosQueLleva() + 
                                   " Requiere mantenimiento: " + i.isRequiereMantenimiento() +
                                   " Tiene autoPilot; " + ((Autos) i).isAutoPilot());
            }
            if(i instanceof Motos){
                Motos moto = (Motos) i;
                    System.out.println(" Codigo Alfanumerico: " + i.getCodigoAlfanumerico() +
                                       " Capacidad bateria: " + ((Motos) i).getCapacidadBateria() + 
                                       " Requiere mantenimiento: " + i.isRequiereMantenimiento() +
                                       " Tiene modo eco; " + ((Motos) i).isModoeco());
            if( i instanceof Bicleta){
                Bicleta bicicleta = (Bicleta) i;
                    System.out.println("Codigo Alfanumerico: " + i.getCodigoAlfanumerico() +
                                       " Tipos de freno: " + ((Bicleta) i).getTipoFrenos() + 
                                       " Requiere mantenimiento: " + i.isRequiereMantenimiento() +
                                       " Capacidad de bateria en km " + ((Bicleta) i).getCapacidadBateriaKm());
                    
                }
            }
        }
    }
}
