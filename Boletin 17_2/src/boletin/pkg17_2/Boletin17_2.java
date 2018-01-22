package boletin.pkg17_2;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin17_2 {

    public static void main(String[] args) {
        Alumnos lista=new Alumnos();
        int []notas=lista.notasAlumnos();
        lista.compararNotas(notas);
        lista.notaMedia(notas);
        lista.notaAlta(notas);
    }

}
