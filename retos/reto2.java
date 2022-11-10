package reto2;
 
import java.util.Scanner;
 
public class reto2
 {
    public static void main(String[] args)
   {
    Scanner lector = new Scanner(System.in);
    double peso, meses;
 
    System.out.println("ingrese el peso del bebe en kilos : ");
    peso = lector.nextDouble();
    System.out.println("ingrese la edad del bebe en meses  : ");
    meses = lector.nextDouble();
    dosis = (peso+10/meses*10)*8;
    System.out.println("La dosis que se debe aplicar al bebe es : "+dosis);
   }
}
