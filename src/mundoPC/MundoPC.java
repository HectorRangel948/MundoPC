package mundoPC;
import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        
        
        Computadora computadora1 = new Computadora("Mi Primera PC");
        computadora1.setMonitor("Lenovo", 15.00);
        computadora1.setRaton("USB", "Hisense");
        computadora1.setTeclado("Bluetooth", "Razer");
        
        Computadora computadora2 = new Computadora("Mi Segunda PC");
        computadora2.setMonitor("HP", 25.00);
        computadora2.setRaton("USB", "Razer");
        computadora2.setTeclado("Bluetooth", "HP");
        
        Computadora computadora3 = new Computadora("Mi tercera PC");
        computadora3.setMonitor("razer", 15.00);
        computadora3.setRaton("Bluetooth", "nvidia");
        computadora3.setTeclado("Bluetooth", "nvidia");
        
        Orden orden1 = new Orden(computadora1);
        orden1.setComputadoras(computadora2);
        orden1.setComputadoras(computadora3);
        orden1.getComputadoras();
       
    }
}
