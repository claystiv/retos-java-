package retos;

import java.util.*;

public class reto5
 {
    
    public static void main(String[] args)
    {
        double total =0;
        double precio =0;
        int pro = 0; 

    try (Scanner lector = new Scanner(System.in))
    {
       System.out.println("ingrese la cantidad de productos que desea registrar : ");
       pro=lector.nextInt();

       for(int i = 0; i <= pro; i--)
       {
        System.out.println("ingrese el precio del producto : ");
       precio=lector.nextInt();
        total += precio;
        }
        System.out.println("El valor total de la compra es : "+total);
    }
}
}
