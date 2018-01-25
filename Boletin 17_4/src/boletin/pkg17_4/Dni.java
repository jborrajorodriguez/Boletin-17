package boletin.pkg17_4;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Dni {
    /**
     * Metodo calcularLetra
     * 
     * En este metodo se mostrará la letra correspondiente a un numero de DNI
     * @param numero de tipo int
     */
    public void calcularLetra(int numero) {
        int resto=numero%23;
        String[] letra={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        JOptionPane.showMessageDialog(null,"La letra para el numero "+numero+" será "+letra[resto]);
    }

}
