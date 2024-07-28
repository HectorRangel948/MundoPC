package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    public static int contadorIdTeclado;
    
    //Constructores
    public Teclado(){
        incrementarId();
    }
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        incrementarId();
    }
    
   //Métodos
    
     private void incrementarId(){
        this.idTeclado = ++Teclado.contadorIdTeclado;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("Id=").append(idTeclado);
        sb.append(", Marca=").append(super.getMarca());
        sb.append(", Tipo de entrada=").append(super.getTipoEntrada());
        sb.append('}');
        return sb.toString();
    }
}
