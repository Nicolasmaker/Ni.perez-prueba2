/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciónsistemaregistrovehículoseléctricosflotacarsharing.newpackage;

import static implementaciónsistemaregistrovehículoseléctricosflotacarsharing.newpackage.ICostos.VALOR_HORA_ALQUILER;

/**
 *
 * @author Cetecom
 */
public abstract class AtributosComunes {
    private int codigoAlfanumerico;
    private boolean requiereMantenimiento;

    public AtributosComunes() {
    }

    public AtributosComunes(int codigoAlfanumerico, boolean requiereMantenimiento) {
        this.codigoAlfanumerico = codigoAlfanumerico;
        this.requiereMantenimiento = requiereMantenimiento;
    }

    public int getCodigoAlfanumerico() {
        return codigoAlfanumerico;
    }

    public void setCodigoAlfanumerico(int codigoAlfanumerico) {
        this.codigoAlfanumerico = codigoAlfanumerico;
    }

    public boolean isRequiereMantenimiento() {
        return requiereMantenimiento;
    }

    public void setRequiereMantenimiento(boolean requiereMantenimiento) {
        this.requiereMantenimiento = requiereMantenimiento;
    }

    @Override
    public String toString() {
        return "AtributosComunes{" + "codigoAlfanumerico=" + codigoAlfanumerico + ", requiereMantenimiento=" + requiereMantenimiento + '}';
    }
    public void CosteAuto(int hora){
       double coste = VALOR_HORA_ALQUILER*hora;
    }
    
}
