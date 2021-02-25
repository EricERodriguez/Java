//2.33 Calculadora del indice de masa corporal

import java.util.Scanner;

public class calculadoraimc 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int peso;
        int altura;
        int bmi;

        System.out.print("Intruzca su peso en kg: ");
        peso = entrada.nextInt();

        System.out.print("Introduzca su altura en metros: ");
        altura = entrada.nextInt();

        bmi = (peso)/(altura*altura);

        System.out.printf("Su indice de masa corporal es %d%n", bmi);
        System.out.print("VALORES DE BMI\nBajo peso: menos de 18.5\nNormal: entre 18.5 y 24.9\nSobrepeso: entre 25 y 29.9\nObeso: 30 o más\n");


    }
}
