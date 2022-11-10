package retos;

import java.util.*;

public class reto4
 {
    public static void main(String[] args)
    {
    try (Scanner lector = new Scanner(System.in))
    {
        int aleatorio = 0;
        int res =0;

      aleatorio = (int) (Math.random()%2);
        char co =1;
   do {
           System. out.println("jugador Escoja 1 si desea cara o 2 si desea sello");
           res=lector.nextInt();
           System. out.println("La moneda se esta lanzando");
       
           if (aleatorio==1 && res==1) 
           {
                   System.out.println("Salio cara y el jugador a ganado");

           } else if (aleatorio==2 && res==2){
                   System.out.println ("Salio sello y el jugador a ganado");

           }else if (aleatorio==1 && res==2) {
                   System.out.println("Salio Cara y perdiste");

           }else if (aleatorio==2 && res==1) {
                   System. out.println ("Salio sello y perdiste");
           }
                   lector.nextLine ();
                    System. out.println ("ingrese 9 si desea continuar o Cualquier tecla para salir ");
                    co=lector.nextLine ().charAt (0);           
    }
    while (co =='9');
  }
}
}