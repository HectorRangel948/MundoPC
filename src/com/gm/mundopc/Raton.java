package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    public static int contadorIdRaton;
    
    //Constructores
    public Raton(){
        incrementarId();
    }
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        incrementarId();
    }
    
   //Métodos
    private void incrementarId(){
        this.idRaton = ++Raton.contadorIdRaton;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("Id=").append(idRaton);
        sb.append(", Marca=").append(super.getMarca());
        sb.append(", Tipo de entrada=").append(super.getTipoEntrada());
        sb.append('}');
        return sb.toString();
    }
}
