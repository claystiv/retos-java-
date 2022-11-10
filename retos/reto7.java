package retos;

import java.util.*;

public class reto7
{

   
    public static void main(String[] args)
    {
    try (Scanner lector = new Scanner(System.in))
    {
       // int estudiantes = 0;
       // int notas = 0;
        double promedio = 0;
        double notas =0;
        String[]nombre = new String[5];
        double []nota = new double[5];

     /* System.out.println("ingrese la cantidad de estudiantes : ");
        estudiantes=lector.nextInt();
        System.out.println("ingrese la cantidad de notas : ");
        notas=lector.nextInt();*/

for(int x=0;x<5;x++)
{
    System.out.println("ingrese el nombre del estudiante : ");
    nombre[x]=lector.next();

    for(int y=0;y<5;y++)
    {
        System.out.println("ingrese la notas del estudiante : ");
        nota[y]=lector.nextInt(); 
        notas += nota[y];
    }
    promedio = notas/5;
    if (promedio<3)
    {
        System.out.println("El estudiante : "+ nombre[x] + " Reprobo");
    }  
     else if(promedio >=3 && promedio <=4)
     {
        System.out.println("El estudiante : "+ nombre[x] + " Paso raspando");
     }
     else if(promedio >4)
     {
        System.out.println("El estudiante : "+ nombre[x] + " Aprobo con buenos resultados");
     }
}
    }
}
}