//Indica las paginas a imprimir 1,3-5,10 donde el "-" representa un rango de paginas -> el resultado esperado 1,3,4,5,10


import java.util.Scanner;

public class impre 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        String numeros;
        
        System.out.print("Ingrese paginas a imprimir: ");
        numeros = entrada.nextLine();

        String[] parts = numeros.split(",");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];


            if(part1.contains("-")){
                String[] contiene = part1.split("-");
                String num1 =   contiene[0];
                String num2 =   contiene[1];

                int numeroent1 = Integer.parseInt(num1);
                int numeroent2 = Integer.parseInt(num2);

                for(int x = numeroent1; x <= numeroent2; x++) {
                    System.out.print(x+",");}}
        else
            System.out.println(part1+",");


            if(part2.contains("-")){
                String[] contiene = part2.split("-");
                String num1 =   contiene[0];
                String num2 =   contiene[1];
    
                int numeroent1 = Integer.parseInt(num1);
                int numeroent2 = Integer.parseInt(num2);
    
                for(int x = numeroent1; x <= numeroent2; x++) {
                    System.out.print(x+",");}}
            else
                System.out.print(part2+",");


                if(part3.contains("-")){
                    String[] contiene = part3.split("-");
                    String num1 =   contiene[0];
                    String num2 =   contiene[1];
        
                    int numeroent1 = Integer.parseInt(num1);
                    int numeroent2 = Integer.parseInt(num2);
        
                    for(int x = numeroent1; x <= numeroent2; x++) {
                        System.out.print(x+",");}}
                else
                    System.out.print(part3);

    }
}
