package boletin.pkg17_2;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Alumnos {
    
    public int[] notasAlumnos(){
        int[] notas = new int[30];
        for(int i=0;i<notas.length;i++){
            notas[i]=ThreadLocalRandom.current().nextInt(1,10+1);
            
        }
        return notas;
    }
    public void compararNotas(int[]notas){
        int aprobados=0;
        int suspensos=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                
                aprobados=aprobados+1;
                        
            }else{
                
                suspensos=suspensos+1;
            }
            
        }JOptionPane.showMessageDialog(null,"Alumnos aprobados : "+aprobados+"\nsuspensos :"+suspensos);
        
    }
    
    public void notaMedia(int[]notas){
        float media=0;
        int total=0;
        for(int i=0;i<notas.length;i++){
            total=total+notas[i];
           
        }
        media=total/notas.length;
        JOptionPane.showMessageDialog(null,"Nota media de la clase : "+media);
    }
    public void notaAlta(int[]notas){
        int memoria=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>memoria){
                memoria=notas[i];
            }
        }JOptionPane.showMessageDialog(null,"Nota más alta : "+memoria);
    }
}
