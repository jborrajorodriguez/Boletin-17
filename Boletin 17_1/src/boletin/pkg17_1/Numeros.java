package boletin.pkg17_1;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Juan
 */
public class Numeros {
    Random random=new Random();
    
    public void arrayNum() {
        int[] numeros = new int[6];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =ThreadLocalRandom.current().nextInt(1,50+1);//genera numeros aleatorios
            System.out.println(numeros[i]);
        }
    }
    
    

}
