/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementaciónsistemaregistrovehículoseléctricosflotacarsharing;

import implementaciónsistemaregistrovehículoseléctricosflotacarsharing.newpackage.Administracion;
import implementaciónsistemaregistrovehículoseléctricosflotacarsharing.newpackage.Autos;
import implementaciónsistemaregistrovehículoseléctricosflotacarsharing.newpackage.Bicleta;
import implementaciónsistemaregistrovehículoseléctricosflotacarsharing.newpackage.Motos;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class ImplementaciónSistemaRegistroVehículosEléctricosFlotaCarsharing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while(opcion != 6){
            System.out.println("Ingrese una opcion !!!");
            System.out.println("1. Agregar Auto");
            System.out.println("2. Agregar Moto");
            System.out.println("3. Agregar Bicicleta");
            System.out.println("4. Listar todos los vehiculos");
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    int codigoAlfanumerico = 0;
                    while(codigoAlfanumerico <= 0){
                        System.out.println("Ingrese el codido del auto");
                        if(scanner.hasNextInt());
                            codigoAlfanumerico = scanner.nextInt();
                            if(codigoAlfanumerico <= 0){
                                System.out.println("No puede estar vacio!!!");
                            }else{
                                System.out.println("Ingrese nuevamente");
                                scanner.next();
                            }
                    int pasajeroQueLleva = 0;
                    while(pasajeroQueLleva <= 0){
                        System.out.println("Ingrese la cantidad de pasajeros");
                        if(scanner.hasNextInt());
                        pasajeroQueLleva = scanner.nextInt();
                        if(codigoAlfanumerico <= -1){
                            System.out.println("No puede ser negativo");
                        }else {
                            System.out.println("Ingrese nuevamente");
                            scanner.next();
                        }
                    }
                    boolean autoPilot = false;
                    while(true){
                        System.out.println("Tiene autopilot (si/no)");
                        String respuesta = scanner.next().toLowerCase();
                        if(respuesta.equals("si") || respuesta.equals("no")){
                            autoPilot = true;
                            break;
                        }else if(respuesta.equals("no")){
                            autoPilot = false;
                            break;
                        }else{
                            System.out.println("Por favor ingrese si o no");
                        }
                    }
                    boolean requiereMantenimiento = true;
                    while(true){
                        System.out.println("Requiere mantenimiento si/no");
                        String respuesta = scanner.next().toLowerCase();
                        if(respuesta.equals("si") || respuesta.equals("no")){
                            requiereMantenimiento = true;
                            break;
                        }else if(respuesta.equals("no")){
                            requiereMantenimiento = false;
                            break;
                        }else{
                            System.out.println("Por favor ingrese si o no");
                        }
                    }
                    Autos auto1 = new Autos( pasajeroQueLleva,  autoPilot,  codigoAlfanumerico,  requiereMantenimiento);
                    auto1.AgregarAuto(auto1);
                    auto1.MostratAuto();
                    Administracion ad = new Administracion();
                    ad.agregarVehiculos(auto1);
                    }
                    break;
                case 2:
                    int codigoAlfanumeric = 0;
                    while(codigoAlfanumeric <= 0){
                        System.out.println("Ingrese el codido de la moto");
                        if(scanner.hasNextInt());
                            codigoAlfanumerico = scanner.nextInt();
                            if(codigoAlfanumerico <= 0){
                                System.out.println("No puede estar vacio!!!");
                            }else{
                                System.out.println("Ingrese nuevamente");
                                scanner.next();
                            }
                             int capacidadBateria = 0;
                    while(capacidadBateria <= 0){
                        System.out.println("Ingrese la capacidad de la bateria");
                        if(scanner.hasNextInt());
                        capacidadBateria = scanner.nextInt();
                        if(capacidadBateria <= -1){
                            System.out.println("No puede ser negativo");
                        }else {
                            System.out.println("Ingrese nuevamente");
                            scanner.next();
                        }
                    }
                    boolean modoeco = true;
                    while(true){
                        System.out.println("Tiene modoeco (si/no)");
                        String respuesta = scanner.next().toLowerCase();
                        if(respuesta.equals("si") || respuesta.equals("no")){
                            modoeco = true;
                            break;
                        }else if(respuesta.equals("no")){
                            modoeco = false;
                            break;
                        }else{
                            System.out.println("Por favor ingrese si o no");
                        }
                    }
                    boolean requiereMantenimiento = true;
                    while(true){
                        System.out.println("Requiere mantenimiento si/no");
                        String respuesta = scanner.next().toLowerCase();
                        if(respuesta.equals("si") || respuesta.equals("no")){
                            requiereMantenimiento = true;
                            break;
                        }else if(respuesta.equals("no")){
                            requiereMantenimiento = false;
                            break;
                        }else{
                            System.out.println("Por favor ingrese si o no");
                        }
                    }
                    Motos moto1 = new Motos(capacidadBateria,modoeco,codigoAlfanumeric,requiereMantenimiento);
                    moto1.AgregarMotos(moto1);
                    moto1.MostraMoto();
                    Administracion ad = new Administracion();
                    ad.agregarVehiculos(moto1);
                    }
                    break;
                case 3:
                    int codigoAlfanumeri = 0;
                    while(codigoAlfanumeri <= 0){
                        System.out.println("Ingrese el codido de la bicicleta");
                        if(scanner.hasNextInt());
                            codigoAlfanumeri = scanner.nextInt();
                            if(codigoAlfanumeri <= 0){
                                System.out.println("No puede estar vacio!!!");
                            }else{
                                System.out.println("Ingrese nuevamente");
                                scanner.next();
                            }
                    
                    String tipoFrenos;
                    while(true){
                        System.out.println("Ingrese los tipos de frenos");
                        tipoFrenos = scanner.nextLine();
                        if(tipoFrenos.isEmpty()){
                            System.out.println("No puede estar vacio!!!");
                        }else{
                            break;
                        }
                    }
                    int capacidadBateriaKm = 0;
                    while(capacidadBateriaKm <= 0){
                        System.out.println("Ingrese la capacidad de la bateria");
                        if(scanner.hasNextInt());
                            capacidadBateriaKm = scanner.nextInt();
                            if(capacidadBateriaKm <= 0){
                                System.out.println("No puede estar vacio!!!");
                            }else{
                                System.out.println("Ingrese nuevamente");
                                scanner.next();
                            }
                    }
                    boolean requiereMantenimiento = true;
                    while(true){
                        System.out.println("Requiere mantenimiento si/no");
                        String respuesta = scanner.next().toLowerCase();
                        if(respuesta.equals("si") || respuesta.equals("no")){
                            requiereMantenimiento = true;
                            break;
                        }else if(respuesta.equals("no")){
                            requiereMantenimiento = false;
                            break;
                        }else{
                            System.out.println("Por favor ingrese si o no");
                        }
                    }
                    Bicleta bicicleta1 = new Bicleta( tipoFrenos,  capacidadBateriaKm,  codigoAlfanumeri,  requiereMantenimiento);
                    bicicleta1.AgregarBicleta(bicicleta1);
                    bicicleta1.MostraBicicleta();
                    Administracion ad = new Administracion();
                    ad.agregarVehiculos(bicicleta1);
                    
            }
                    break;
                case 4:
                    Administracion ad = new Administracion();
                    ad.ListarVehiculos();
        }
                
            
    }}
}


