/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Joaqu
 */
public class Dragones extends Criaturas{
    private int vecesaldia;

    public Dragones(int vecesaldia, String codigomagico, String nombre, String especie, int diasenhowart, int edad, double peso, boolean requieresupervision) {
        super(codigomagico, nombre, especie, diasenhowart, edad, peso, requieresupervision);
        this.vecesaldia = vecesaldia;
    }

    public Dragones(int vecesaldia, String codigomagico) {
        super(codigomagico);
        this.vecesaldia = vecesaldia;
    }

    public int getVecesaldia() {
        return vecesaldia;
    }

    public void setVecesaldia(int vecesaldia) {
        this.vecesaldia = vecesaldia;
    }

    @Override
    public String toString() {
        return "Dragones{" + "vecesaldia=" + vecesaldia + '}';
    }

    @Override
    public double calcularCosto(int diasenhowart){
        double costo = VALOR_DIA_ALOJAMIENTO * diasenhowart;
        
        if(vecesaldia < 5){
        costo *= 1.15;}
        return costo;
        }
    
                
    }
    
    
    
    
    

