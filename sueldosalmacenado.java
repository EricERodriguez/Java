import java.util.Scanner;


public class sueldosalmacenado {
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        int numero [] = new int[12];

        for(int i = 0; i<numero.length; i++){

            System.out.println("Ingrese sueldo del mes " + i);
            numero [i] = entrada.nextInt();
        }

        int suma = 0;

        for(int i = 0; i<numero.length; i++){
            suma +=  numero[i];
        }
        System.out.println("La cantidad total de dinero en el año es: " + suma);
        System.out.println("El promedio de sueldo es "+(suma/12));
    }
}
