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
public class Autos extends AtributosComunes implements ICostos{
    List<Autos> listaAutos = new ArrayList<>();
    
    private int pasajerosQueLleva;
    private boolean autoPilot;

    public Autos() {
    }

    public Autos(int pasajerosQueLleva, boolean autoPilot) {
        this.pasajerosQueLleva = pasajerosQueLleva;
        this.autoPilot = autoPilot;
    }

    public Autos(int pasajerosQueLleva, boolean autoPilot, int codigoAlfanumerico, boolean requiereMantenimiento) {
        super(codigoAlfanumerico, requiereMantenimiento);
        this.pasajerosQueLleva = pasajerosQueLleva;
        this.autoPilot = autoPilot;
    }

    public int getPasajerosQueLleva() {
        return pasajerosQueLleva;
    }

    public void setPasajerosQueLleva(int pasajerosQueLleva) {
        this.pasajerosQueLleva = pasajerosQueLleva;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    @Override
    public String toString() {
        return "Autos{" + "pasajerosQueLleva=" + pasajerosQueLleva + ", autoPilot=" + autoPilot + '}';
    }
    
    public void AgregarAuto(Autos parAutos){
        listaAutos.add(parAutos);
    }
     
    public void MostratAuto(){
        for(Autos parAutos : listaAutos){
            System.out.println("Codigo Auto; " + parAutos.getCodigoAlfanumerico() + 
                               " Pasajero que lleva: " + parAutos.pasajerosQueLleva + 
                               " Tiene autopilot: " + isAutoPilot() + 
                               " Requiere mantenimiento: " + isRequiereMantenimiento());
        }
    }
    
    public void CosteAuto(int hora){
       double coste = VALOR_HORA_ALQUILER*hora;
    }
    
}
