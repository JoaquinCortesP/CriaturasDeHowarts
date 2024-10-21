/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Joaqu
 */
public class Bowtruckles extends Criaturas{
    private int reparaciones;

    public Bowtruckles(int reparaciones, String codigomagico, String nombre, String especie, int diasenhowart, int edad, double peso, boolean requieresupervision) {
        super(codigomagico, nombre, especie, diasenhowart, edad, peso, requieresupervision);
        this.reparaciones = reparaciones;
    }

    public Bowtruckles(int reparaciones, String codigomagico) {
        super(codigomagico);
        this.reparaciones = reparaciones;
    }

    public int getReparaciones() {
        return reparaciones;
    }

    public void setReparaciones(int reparaciones) {
        this.reparaciones = reparaciones;
    }

    @Override
    public String toString() {
        return "Bowtruckles{" + "reparaciones=" + reparaciones + '}';
    }
    
    @Override
    public double calcularCosto(int diasenhowart){
        double costo = VALOR_DIA_ALOJAMIENTO * diasenhowart;
        
        if(reparaciones < 3){
        costo *= 0.95;}
        return costo;
        }
}


