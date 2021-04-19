import java.util.Scanner;

public class vectoresscanner {
    public static void main(String[] args) 
    {

        int numeros [] = new int [8];

        Scanner teclado = new Scanner (System.in);

        for (int i = 0; i<numeros.length; i++)
        {

            System.out.println("Ingrese el numero para la posicion: " + i);
            numeros[i] = teclado.nextInt();
        }

        for (int i=0;1<numeros.length;i++){
            System.out.println("Estoy en indice: " + i + " El numero que esta guardado es el: " + numeros [i]);
        }
    }
}
