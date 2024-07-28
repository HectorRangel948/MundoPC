package com.gm.mundopc;

public class DispositivoEntrada {
    
    //Atributos
    private String tipoEntrada;
    private String marca;
    
    //Constructores
    public DispositivoEntrada(){
    }
    
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    //Setters y getters
    public String getTipoEntrada(){
        return this.tipoEntrada;
    }
    
    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
   
}
