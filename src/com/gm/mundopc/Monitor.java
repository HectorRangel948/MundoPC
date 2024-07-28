package com.gm.mundopc;

public class Monitor{
    //Atributos
    private int idMonitor;
    public static int contadorIdMonitor;
    private String marca;
    private double tamanio;
    
    //Constructores
    public Monitor(){
        this.idMonitor = ++Monitor.contadorIdMonitor;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    //Getters y setters
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getTamanio(){
        return this.tamanio;
    }
    
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("ID Monitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamaño=").append(tamanio);
        sb.append('}');
        return sb.toString();
    }
}
