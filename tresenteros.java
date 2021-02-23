//calcula 3 enteros ingresados por el usuario


import java.util.Scanner;

public class tresenteros {

    public static void main(String[] args) 
    {

        Scanner entrada = new Scanner(System.in);

        int x;
        int y;
        int z;
        int producto;

        System.out.print("Escriba el primer entero: ");
        x = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        y = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        z = entrada.nextInt();

        producto = x * y * z;

        System.out.printf("El producto es %d%n", producto);

        
    }
    
}
