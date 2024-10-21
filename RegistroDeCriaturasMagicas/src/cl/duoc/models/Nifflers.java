/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Joaqu
 */
public class Nifflers extends Criaturas{
    private int tesoros;

    public Nifflers(int tesoros, String codigomagico, String nombre, String especie, int diasenhowart, int edad, double peso, boolean requieresupervision) {
        super(codigomagico, nombre, especie, diasenhowart, edad, peso, requieresupervision);
        this.tesoros = tesoros;
    }

    public Nifflers(int tesoros, String codigomagico) {
        super(codigomagico);
        this.tesoros = tesoros;
    }

    public int getTesoros() {
        return tesoros;
    }

    public void setTesoros(int tesoros) {
        this.tesoros = tesoros;
    }

    @Override
    public String toString() {
        return "Nifflers{" + "tesoros=" + tesoros + '}';
    }
    
    @Override
    public double calcularCosto(int diasenhowart){
        double costo = VALOR_DIA_ALOJAMIENTO * diasenhowart;
        
        if(tesoros < 10){
        costo *= 0.88;}
        return costo;
        }
}
