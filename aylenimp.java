
import java.util.Scanner;

public class aylenimp 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        String numeros;

        System.out.print("Ingrese paginas a imprimir: ");
        numeros = entrada.nextLine();

        String[] parts = numeros.split(",");
        if ( parts != null ){
            for ( int i = 0 ; i < parts.length ; i++ ){

                if ( parts[i].contains("-"))
                {
            
                    String[] contiene = parts[i].split("-");
                            String num1 =   contiene[0];
                            String num2 =   contiene[1];

                            int numeroent1 = Integer.parseInt(num1);
                            int numeroent2 = Integer.parseInt(num2);
                
                    for(int x = numeroent1; x <= numeroent2; x++) {
                        if ( ( x <= numeroent2 && i < (parts.length - 1))  || ( x < numeroent2 && i == (parts.length - 1) ) ){
                            System.out.print( x + ", ");
                        }
                        else
                            System.out.print(x);
                    }	
                }
                else{
                    if ( i < (parts.length - 1)){
                            System.out.print( parts[i] + ", ");
                        }
                    else
                        System.out.print( parts[i] );			
                }
            }
        }

    }
}