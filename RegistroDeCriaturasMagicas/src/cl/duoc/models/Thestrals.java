/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Joaqu
 */
public class Thestrals extends Criaturas{
    private boolean muerte;

    public Thestrals(boolean muerte) {
        this.muerte = muerte;
    }

    public Thestrals(boolean muerte, String codigomagico, String nombre, String especie, int diasenhowart, int edad, double peso, boolean requieresupervision) {
        super(codigomagico, nombre, especie, diasenhowart, edad, peso, requieresupervision);
        this.muerte = muerte;
    }

    public Thestrals(boolean muerte, String codigomagico) {
        super(codigomagico);
        this.muerte = muerte;
    }

    @Override
    public String toString() {
        return "Thestrals" + muerte;
    }
    
    
    
    
    
   

    

    @Override
     public double calcularCosto(int diasenhowart){
        double costo = VALOR_DIA_ALOJAMIENTO * diasenhowart;
        costo *= 1.08;
        return costo;
        }
     
   

    
    
    
}
