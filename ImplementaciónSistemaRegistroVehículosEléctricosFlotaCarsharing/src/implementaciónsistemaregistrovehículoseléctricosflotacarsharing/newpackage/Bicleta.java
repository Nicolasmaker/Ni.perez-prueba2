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
public class Bicleta extends AtributosComunes implements ICostos {
    List<Bicleta> listaBicleta = new ArrayList<>();
    private String tipoFrenos;
    private int capacidadBateriaKm;

    public Bicleta() {
    }

    public Bicleta(String tipoFrenos, int capacidadBateriaKm) {
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriaKm = capacidadBateriaKm;
    }

    public Bicleta(String tipoFrenos, int capacidadBateriaKm, int codigoAlfanumerico, boolean requiereMantenimiento) {
        super(codigoAlfanumerico, requiereMantenimiento);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriaKm = capacidadBateriaKm;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public int getCapacidadBateriaKm() {
        return capacidadBateriaKm;
    }

    public void setCapacidadBateriaKm(int capacidadBateriaKm) {
        this.capacidadBateriaKm = capacidadBateriaKm;
    }

    @Override
    public String toString() {
        return "Bicleta{" + "tipoFrenos=" + tipoFrenos + ", capacidadBateriaKm=" + capacidadBateriaKm + '}';
    }
    
    public void AgregarBicleta(Bicleta parBicleta){
        listaBicleta.add(parBicleta);
    }
     
    public void MostraBicicleta(){
        for(Bicleta parBicleta : listaBicleta){
            System.out.println("Codigo Moto: " + parBicleta.getCodigoAlfanumerico() + 
                               " Tipo de frenos: " + parBicleta.tipoFrenos + 
                               " Capacidad Bateria Km: " + parBicleta.getCapacidadBateriaKm() + 
                               " Requiere mantenimiento: " + isRequiereMantenimiento());
        }
    }
    public void CosteAuto(int hora){
       double coste = VALOR_HORA_ALQUILER*hora;
    }
}
