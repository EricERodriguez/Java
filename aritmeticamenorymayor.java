//2.17 aritmetica mayor menor: recibe 3 numeros saca menor, mayor, suma, promedio y producto

import java.util.Scanner;

public class aritmeticamenorymayor 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int suma;
        int promedio;
        int producto;

        System.out.print("Escriba el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.print("Escriba el tercer numero: ");
        numero3 = entrada.nextInt();

        suma = numero1 + numero2 + numero3;
        promedio = (numero1 + numero2 + numero3)/3;
        producto = numero1 * numero2 * numero3;

        System.out.printf("la suma es %d%n", suma);

        System.out.printf("El promedio es %d%n", promedio);

        System.out.printf("El producto es %d%n", producto);

        if (numero1 > numero2)
            System.out.printf("%d es mayor que  %d%n", numero1, numero2);

        if (numero2 > numero3)
            System.out.printf("%d es mayor que  %d%n", numero2, numero3);

        if (numero1 > numero3)
            System.out.printf("%d es mayor que  %d%n", numero1, numero3);

        if (numero2 > numero1)
            System.out.printf("%d es mayor que  %d%n", numero2, numero1);

        if (numero3 > numero1)
            System.out.printf("%d es mayor que  %d%n", numero3, numero1);

        if (numero3 > numero2)
            System.out.printf("%d es mayor que  %d%n", numero3, numero2);


        if (numero1 < numero2)
            System.out.printf("%d es menor que  %d%n", numero1, numero2);

        if (numero2 < numero3)
            System.out.printf("%d es menor que  %d%n", numero2, numero3);

        if (numero1 < numero3)
            System.out.printf("%d es menor que  %d%n", numero1, numero3);

        if (numero2 < numero1)
            System.out.printf("%d es menor que  %d%n", numero2, numero1);

        if (numero3 < numero1)
            System.out.printf("%d es menor que  %d%n", numero3, numero1);

        if (numero3 < numero2)
            System.out.printf("%d es menor que  %d%n", numero3, numero2);




        
    }
    
}
