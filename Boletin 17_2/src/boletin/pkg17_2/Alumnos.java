package boletin.pkg17_2;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Alumnos {

    /**
     * Metodo notasAlumnos Crea un array de tipo int de una longitud de 30 y lo
     * recorre. Los valores son colocados de forma aleatoria. .
     *
     * @return array de tipo int
     */
    public int[] notasAlumnos() {
        int[] notas=new int[30];
        for (int i=0; i<notas.length; i++) {
            notas[i]=ThreadLocalRandom.current().nextInt(1,10+1);

        }
        return notas;
    }

    /**
     * Metodo compararNotas Este metodo compara notas para determinar cuantos
     * hay aprobados y cuantos hay suspensos.
     *
     * @param notas es un array de tipo int.
     */
    public void compararNotas(int[] notas) {
        int aprobados=0;
        int suspensos=0;
        for (int i=0; i<notas.length; i++) {
            if (notas[i]>=5) {

                aprobados=aprobados+1;

            }
            else {

                suspensos=suspensos+1;
            }

        }
        JOptionPane.showMessageDialog(null,"Alumnos aprobados : "+aprobados+"\nsuspensos :"+suspensos);

    }

    /**
     * Metodo notaMedia Este metodo calcula la media de las notas de todo el
     * array.
     *
     * @param notas es un array de tipo int.
     */
    public void notaMedia(int[] notas) {
        float media=0;
        int total=0;
        for (int i=0; i<notas.length; i++) {
            total=total+notas[i];

        }
        media=total/notas.length;
        JOptionPane.showMessageDialog(null,"Nota media de la clase : "+media);
    }

    /**
     * Metodo notaAlta Este metodo muestra la nota mas alta de todas las que
     * contiene el Array.
     *
     * @param notas es un array de tipo int.
     */
    public void notaAlta(int[] notas) {
        int memoria=0;
        for (int i=0; i<notas.length; i++) {
            if (notas[i]>memoria) {
                memoria=notas[i];
            }
        }
        JOptionPane.showMessageDialog(null,"Nota más alta : "+memoria);
    }
}
