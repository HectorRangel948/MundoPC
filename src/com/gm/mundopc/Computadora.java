package com.gm.mundopc;

public class Computadora {
    //Atributos
    private int idComputadora;
    public static int contadorIdComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    
    //Constructores
    public Computadora(){
        this.idComputadora = ++Computadora.contadorIdComputadora;
    }
    
    public Computadora(String nombre){
        this();
        this.nombre=nombre;
    }
    
    //Gettters y setters
    public int getIdComputadora(){
        return this.idComputadora;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public Monitor getMonitor(){
        return this.monitor;
    }
    
    public void setMonitor(String marca, double tamanio){
        this.monitor = new Monitor(marca, tamanio);
    }
    
    public Teclado getTeclado(){
        return this.teclado;
    }
    
    public void setTeclado(String tipoEntrada, String marca){
        this.teclado = new Teclado(tipoEntrada, marca);
    }
    
    public Raton getRaton(){
        return this.raton;
    }
    
    public void setRaton(String tipoEntrada, String marca){
        this.raton = new Raton(tipoEntrada, marca);
    }
    
    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", nombre=").append(nombre);
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append('}');
        return sb.toString();
    }
    
}
