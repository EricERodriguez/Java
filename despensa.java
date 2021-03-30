import java.util.Scanner;

public class despensa 
{
    public static void main(String []args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        
        double repositores = 15890;
        double cajeros = 25630.89;
        double supervisores = 33560.20;
        int numero;

        System.out.println ("Seleccione sueldo:");
        System.out.println ("1 - Repositores");
        System.out.println ("2 - Cajeros");
        System.out.println ("3 - Supervisores");

        System.out.println ("Ingrese numero: ");
        numero = entrada.nextInt();

        if (numero == 1)
        {
            System.out.print("Repositor : $" + repositores * (1.1));
        }
        if (numero == 2)
        {
            System.out.print("Cajero : $" + cajeros );
        }        
        if (numero == 3)
        {
            System.out.print("Supervisor : $" + supervisores * (0.89));
        }
        else 
        {
            System.out.print("Error" );
        }
        
    }
    
}
