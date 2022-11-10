package retos;

import java.util.*;

public class reto1 
{
    public static void main(String[] args)
   {
    Scanner lector = new Scanner(System.in);
    double F, C;
    System.out.println("ingrese su grados Fahrenheit : ");
    F = lector.nextDouble();
    C = (F - 32)/1.8;
    System.out.println(C +"son sus grados centígrados" + F + "que eran sus Fahrenheit");
   }

}