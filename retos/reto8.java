package retos;
import java.util.*;

public class reto8 
{
    public static void main(String[] args)
    {
        String mejorN;
        int mejorT =0;
        String[]nombre = new String[4];
        int []tiempo = new int [4];
    try (Scanner lector = new Scanner(System.in))
    {
for(int x=0;x<4;x++)
{
    for(int y=0;y<4;y++)
    {
        System.out.println("ingrese el nombre del nadador : ");
        nombre[x]=lector.next();
        System.out.println("ingrese el tiempo del nadador : ");
        tiempo[y]=lector.nextInt();   
    }
}
System.out.println("************************************************************************************************");

for(int x=0;x<4;x++)
{
    for(int y=0;y<4;y++)
    {
        System.out.println(x+""+y+"  "+ nombre[x]+" "+tiempo[y]);
        if (mejorT<tiempo[y])
        {
            mejorT = tiempo[y];
            mejorN = nombre[x];
            System.out.println(" El mejor es "+ mejorN+" con el tiempo de : "+mejorT);
        }  
        else 
         {
            
         } 
    }
} 
    }
}
}