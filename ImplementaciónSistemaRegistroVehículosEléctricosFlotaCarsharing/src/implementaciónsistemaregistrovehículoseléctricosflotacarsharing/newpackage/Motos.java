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
public class Motos extends AtributosComunes implements ICostos {
    List<Motos> listaMotos = new ArrayList<>();
    private int capacidadBateria;
    private boolean modoeco;

    public Motos() {
    }

    public Motos(int capacidadBateria, boolean modoeco) {
        this.capacidadBateria = capacidadBateria;
        this.modoeco = modoeco;
    }

    public Motos(int capacidadBateria, boolean modoeco, int codigoAlfanumerico, boolean requiereMantenimiento) {
        super(codigoAlfanumerico, requiereMantenimiento);
        this.capacidadBateria = capacidadBateria;
        this.modoeco = modoeco;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isModoeco() {
        return modoeco;
    }

    public void setModoeco(boolean modoeco) {
        this.modoeco = modoeco;
    }

    @Override
    public String toString() {
        return "Motos{" + "capacidadBateria=" + capacidadBateria + ", modoeco=" + modoeco + '}';
    }
    
    public void AgregarMotos(Motos parMotos){
        listaMotos.add(parMotos);
    }
     
    public void MostraMoto(){
        for(Motos parMotos : listaMotos){
            System.out.println("Codigo Moto: " + parMotos.getCodigoAlfanumerico() + 
                               " Capacidad bateria: " + parMotos.capacidadBateria + 
                               " Tiene modoeco: " + isModoeco() + 
                               " Requiere mantenimiento: " + isRequiereMantenimiento());
        }
    }
    public void CosteAuto(int hora){
       double coste = VALOR_HORA_ALQUILER*hora;
    }
}
