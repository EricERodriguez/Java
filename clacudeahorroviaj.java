// 2.35 Calculadora de ahorro por viajes compartidos en automovil:

import java.util.Scanner;

public class clacudeahorroviaj 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int kilometros;
        int costonaf;
        int promkmlitro;
        int estacionamiento;
        int peaje;
        int prepeaje;
        int personas;
        int preesta;

        System.out.print("Introduzca kilometros a viajar: ");
        kilometros = entrada.nextInt();

        System.out.print("Introduzca precio del litro de nafta: ");
        costonaf = entrada.nextInt();

        System.out.print("Introduzca cantidad de personas en el viaje: ");
        personas = entrada.nextInt();

        System.out.print("Introduzca cantidad de estacionamientos: ");
        estacionamiento = entrada.nextInt();

        System.out.print("Introduzca precio de estacionamientos: ");
        preesta = entrada.nextInt();

        System.out.print("Introduzca cantidad de peajes a pagar: ");
        peaje = entrada.nextInt();

        System.out.print("Introduzca precio peajes: ");
        prepeaje = entrada.nextInt();

        //12 km se hacen x litro de nafta

        promkmlitro = 12;

        System.out.print("El costo por persona es: ");
        System.out.print((((kilometros/promkmlitro)*costonaf)+(estacionamiento*preesta)+(peaje*prepeaje))/personas);
        
    }
}
