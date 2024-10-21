/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joaqu
 */
public class GranRegistroCriaturas implements InterfazCostoMagico{
    private List<Criaturas> registro = new ArrayList<>();
    
    public GranRegistroCriaturas() {
        registro = new ArrayList<>(); // Asegura una lista nueva y vacía.
    }

    public List<Criaturas> getRegistro() {
        return registro;
    }
    
    public void agregarCriatura(Criaturas criatura){
      registro.add(criatura);
        System.out.println("Criatura agregada con exito");
    }
    
    public boolean codigoMagicoUnico(String codigo) {
        
        for (Criaturas i : registro) {
            if(i.getCodigoMagico().equalsIgnoreCase(codigo)){
                return false;
            }
        }
        return true;
    }
    
    public void listarCriaturas(){
        for(Criaturas criatura: registro){
            System.out.println("Nombre: "+ criatura.getNombre() + " Especie: "+ criatura.getEspecie());
            System.out.println("Edad: "+ criatura.getEdad());
            System.out.println("Dias en howarts: "+ criatura.getDiasenhowart());
            System.out.println("Requiere supervision?: " + criatura.isRequieresupervision());
            
        }
    }
    
    public void cantidadCriaturas(){
        System.out.println("El total de criaturas es de: "+ registro.size());
    }
    
    public double calcularCostoTotal() {
    double costoTotal = 0;

    for (Criaturas criatura : registro) {
        int costoBase = criatura.getDiasenhowart()* VALOR_DIA_ALOJAMIENTO;
        costoTotal += criatura.calcularCosto(costoBase);
    }

    return costoTotal;
}
           
    
    
//llavefinal    

    @Override
    public double calcularCosto(int diasenhowart) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
