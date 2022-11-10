package retos;

import java.util.*;

public class reto9
{
    public static void main(String[] args)
    {
        String[][]productos = new String[4][4];
        int [][]precio = new int [4][4];
    try (Scanner lector = new Scanner(System.in))
    {
for(int x=0;x<4;x++)
{
    for(int y=0;y<4;y++)
    {
        System.out.println("ingrese el nombre del producto : ");
        productos[x][y]=lector.next();
        System.out.println("ingrese el precio del producto : ");
        precio[x][y]=lector.nextInt();   
    }
}
System.out.println("************************************************************************************************");
for(int x=0;x<4;x++)
{
    for(int y=0;y<4;y++)
    {
        System.out.println(x+""+y+"  "+ productos[x][y]+" "+precio[x][y]);
    }
}
    }
}
/*public void ubicar (int pos,String posicion)
{
   if (pos >=0 && pos <= 4)
   { productos[pos][pos]=posicion;}
}
public void presentar ()
{
    for(int x=0;x<4;x++)
{
    for(int y=0;y<4;y++)
    {
        System.out.println(x+""+y+"  "+ productos[x][y]+" "+precio[x][y]);
    }
}
}*/
}