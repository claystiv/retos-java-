package retos;

import java.util.*;

public class reto3 
{
    public static void main(String[] args)
    {
             int aleatorio=0;
             int seleccionUsuario=0;
         

        System.out.println("Juego piedra-papel-tijera");

        try (Scanner lector = new Scanner(System.in))
         {
            aleatorio = (int) (Math.random()%2);
            
        System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
         seleccionUsuario = lector.nextInt();
 
        System.out.print("La maquina ya selecciona su decicion");
        
        switch ( seleccionUsuario )
        {
            case 1:
                System.out.println("Piedra");
                switch ( aleatorio )
                {
                   case 1: System.out.println("Empate!"); break;
                   case 2: System.out.println("Usted gana!"); break;
                   case 3: System.out.println("La computadora gana!"); break;
                }
                break;
            case 2:
                System.out.println("Papel");
                switch ( aleatorio )
                {
                   case 1: System.out.println("La computadora gana!"); break;
                   case 2: System.out.println("Empate!"); break;
                   case 3: System.out.println("Usted gana!"); break;
                }
                break;
            case 3:
                System.out.println("Tijera");
                switch ( aleatorio )
                {
                   case 1: System.out.println("Usted gana!"); break;
                   case 2: System.out.println("La computadora gana!"); break;
                   case 3: System.out.println("Empate!"); break;
                }
                break;
            } 
        }
}
}

