//Fig. 3.1: Cuenta.java
//Clase cuenta que contine una variable de instancia llamada nombre
//y metodos para establecer y obtener su valor.

public class cuenta 
{
    private String nombre; //variable de instancia
    
    //metodo para establecer el nombre en el objeto
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre;
    }

    //metodo para obtener el nombre del objeto
    public String obtenerNombre()
    {
        return nombre; //devuelve el valor de nombre a quien lo invoco
    }
} //fin de la clase ceunta
