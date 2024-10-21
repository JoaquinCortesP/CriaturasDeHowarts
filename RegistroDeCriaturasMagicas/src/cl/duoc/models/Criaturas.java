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
public abstract class Criaturas implements InterfazCostoMagico{
   
    private String nombre, especie, codigoMagico;
    private int diasenhowart, edad;
    private double peso;
    private boolean requieresupervision;  

    public Criaturas() {
    }
   
    

    public Criaturas(String codigomagico, String nombre, String especie, int diasenhowart, int edad, double peso, boolean requieresupervision) {
        this.codigoMagico = codigomagico;
        this.nombre = nombre;
        this.especie = especie;
        this.diasenhowart = diasenhowart;
        this.edad = edad;
        this.peso = peso;
        this.requieresupervision = requieresupervision;
    }
    
    public Criaturas(String codigomagico) {
        this.codigoMagico = codigomagico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoMagico() {
        return codigoMagico;
    }

    public void setCodigoMagico(String codigoMagico) {
        this.codigoMagico = codigoMagico;
    }
    
    

    public String getEspecie() {
        return especie;
    }
    
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getDiasenhowart() {
        return diasenhowart;
    }

    public void setDiasenhowart(int diasenhowart) {
        this.diasenhowart = diasenhowart;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isRequieresupervision() {
        return requieresupervision;
    }

    public void setRequieresupervision(boolean requieresupervision) {
        this.requieresupervision = requieresupervision;
    }

    @Override
    public abstract String toString();
    
   
    
    
    
    
}/////FINAL
