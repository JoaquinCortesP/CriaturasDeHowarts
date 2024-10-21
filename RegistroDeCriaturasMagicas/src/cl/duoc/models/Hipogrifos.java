/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Joaqu
 */
public class Hipogrifos extends Criaturas{
    private String temperamento;
    private int vuelosaldia;

    public Hipogrifos(String temperamento, int vuelosaldia, String codigomagico, String nombre, String especie, int diasenhowart, int edad, double peso, boolean requieresupervision) {
        super(codigomagico, nombre, especie, diasenhowart, edad, peso, requieresupervision);
        this.temperamento = temperamento;
        this.vuelosaldia = vuelosaldia;
    }

    public Hipogrifos(String temperamento, int vuelosaldia, String codigomagico) {
        super(codigomagico);
        this.temperamento = temperamento;
        this.vuelosaldia = vuelosaldia;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public int getVuelosaldia() {
        return vuelosaldia;
    }

    public void setVuelosaldia(int vuelosaldia) {
        this.vuelosaldia = vuelosaldia;
    }

    @Override
    public String toString() {
        return "Hipogrifos{" + "temperamento=" + temperamento + ", vuelosaldia=" + vuelosaldia + '}';
    }
    
    @Override
    public double calcularCosto(int diasenhowart){
        double costo = VALOR_DIA_ALOJAMIENTO * diasenhowart;
        
        if(vuelosaldia < 3){
        costo *= 1.10;}
        return costo;
        }
}
