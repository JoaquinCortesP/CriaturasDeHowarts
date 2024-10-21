/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrodecriaturasmagicas;

import cl.duoc.models.Criaturas;
import cl.duoc.models.Dragones;
import cl.duoc.models.GranRegistroCriaturas;
import cl.duoc.models.Hipogrifos;
import cl.duoc.models.Nifflers;
import cl.duoc.models.Thestrals;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joaqu
 */
public class RegistroDeCriaturasMagicas {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ////////////
        ///CLASES///
        ////////////
        GranRegistroCriaturas registros = new GranRegistroCriaturas();
        
        
        ////////////
        ///CLASES///
        ////////////
        
        
        
        
     
        
        
        //////////
        ///MENU///
        /////////
       
        
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
         
        
        
        //////////
        ///MENU///
        /////////
       
        
        while(opcion != 4){
            System.out.println("------menu------");
            System.out.println("Agregar criaturas[1]");
            System.out.println("Listar criaturas[2]");
            System.out.println("Costo Total");
            System.out.println("Salir");
            
            opcion = entrada.nextInt();
            
            
            switch(opcion){
                case 1:
                    System.out.println("----Escoja el tipo de criatura-----");
                    System.out.println("Dragon ");
                    System.out.println("Hipogrifo ");
                    System.out.println("Thestral ");
                    System.out.println("Nifflers ");
                    System.out.println("Bowtruckles ");
                    
                    int especies = entrada.nextInt();
                    entrada.nextLine();
                    
                    
                    //////////validar codigo/////////
                    System.out.print("Codigo magico: ");
                    String codigo = entrada.nextLine();
                    
                    ///////////////////////////
                    
                    System.out.println("Nombre");
                    String nombre = entrada.nextLine();
                    
                    System.out.println("Peso");
                    double peso = entrada.nextDouble();
                    
                    System.out.println("Edad");
                    int edad = entrada.nextInt();
                    
                    System.out.println("¿Requiere supervision?  (true or false)");
                    boolean requieresupervision = entrada.nextBoolean();
                    
                    Criaturas criatura = null;
                    
                    switch(especies){
                        case 1:
                            System.out.println("Cuantas veces escupe fuego al dia?");
                            int vecesaldia = entrada.nextInt();
                            criatura = new Dragones(vecesaldia, codigo, nombre, nombre, edad, edad, peso, requieresupervision);
                            System.out.println("Dragon Agregado con exito");
                            registros.agregarCriatura(criatura);
                            break;
                            
                        case 2:
                            System.out.println("Cuantas veces vuela al día?");
                            int vuelosaldia = entrada.nextInt();
                            criatura = new Hipogrifos(nombre, vuelosaldia, codigo, nombre, nombre, edad, edad, peso, requieresupervision);
                            System.out.println("Hipogrifo agregado con exito");
                            registros.agregarCriatura(criatura);
                            break;
                        case 3:
                            
                            System.out.println("Solo puedes agregar un thestral si has presenciado la muerte");
                            System.out.println("Responde true o false");
                            boolean muerte = entrada.nextBoolean();
                            criatura = new Thestrals(muerte, codigo, nombre, nombre, edad, edad, peso, requieresupervision);
                            registros.agregarCriatura(criatura);
                            break;
                            
                        case 4:
                            System.out.println("Cuantos tesoros recoje al día?");
                            int tesoros = entrada.nextInt();
                            criatura = new Nifflers( tesoros, codigo, nombre, nombre, tesoros, edad, peso, requieresupervision);
                            System.out.println("Niffler agregado con exito");
                            registros.agregarCriatura(criatura);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    
                    }
                   
                    
                    
                case 2:
                    System.out.println("-------Las criaturas son:-------");
                    registros.listarCriaturas();
                    registros.cantidadCriaturas();
                    break;
                case 3:
                    registros.calcularCostoTotal();
                    
                    break;
                case 4:
                    System.out.println("Saliendo del sistema");
                    break;
            }         
        }//final del menu
        
    }
    
}
