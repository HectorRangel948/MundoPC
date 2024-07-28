package com.gm.mundopc;

public class Orden {
    //Atributos
    private int idOrden;
    public static int contadorIdOrden;
    public int idComputadora;
    public static int contadorIdComputadora;
    private static final int MAX_COMPUTADORAS = 10;
    public Computadora computadoras[]=new Computadora[Orden.MAX_COMPUTADORAS];

    
    //Constructores
    public Orden(){
        this.idOrden = ++Orden.contadorIdOrden;
    }
    
    public Orden(Computadora computadora){
        this();
        if(this.idOrden<Orden.MAX_COMPUTADORAS){
            setComputadoras(computadora);
        }
        else{
            System.out.println("Se ha alcanzado el máximo de computadoras por orden ["+ Orden.MAX_COMPUTADORAS+"]");}
    }
    
    //Getters y setters
    public int getIdOrden(){
        return this.idOrden;
    }
       
    public void setComputadoras(Computadora nuevaComputadora){
        this.idComputadora=Orden.contadorIdComputadora++;
        this.computadoras[this.idComputadora]= nuevaComputadora;
    }
    
    public void getComputadoras(){
         for (int i = 0; i < this.computadoras.length; i++) {
            System.out.println("Computadora " + computadoras[i]);
        }
    }
}
