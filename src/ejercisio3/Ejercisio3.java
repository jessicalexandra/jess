

package ejercisio3;
import java.util.Scanner;
public class Ejercisio3 {

    public static void main(String[] args) {
       Scanner lea=new Scanner (System.in);
       String NomE;
       Float CantM, MatP;
       System.out.print(" Nombre Del Estudiante: ");
       NomE=lea.nextLine();
       System.out.print(" Cantidad de Materias Que Cursa: ");
       CantM=lea.nextFloat();
       System.out.print(" Cantida de Materias Perdidas: ");
       MatP=lea.nextFloat();
       CantM=MatP*100/1;
       System.out.println(NomE+" Tiene un % de materias ganadas de "+CantM +"&");
       
    }
    
}
