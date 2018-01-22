package boletin.pkg17_2;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin17_3 {

    public static void main(String[] args) {
        Alumnos lista=new Alumnos();
        int []notas=lista.notasAlumnos();
//        lista.compararNotas(notas);
//        lista.notaMedia(notas);
//        lista.notaAlta(notas);
        String[]nombres=lista.nombresAlumnos();
//        lista.alumDet(JOptionPane.showInputDialog("Introduce un nombre de alumno"),nombres,notas);
        lista.alumnosAprobados(nombres,notas);
        lista.listaOrdenada(nombres,notas);
    }

}
