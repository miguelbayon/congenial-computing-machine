
/**
 * Clase Persona
 * 
 * @author Miguel Bayon
 * @version 0.1
 */
public class Persona
{
    private String nombre;
    private int edad;
    private boolean esChico;
    
    /**
     * Constructor
     */
    public Persona(String elNombre, int laEdad, boolean siEsChico)
    {
        nombre = elNombre;
        edad = laEdad;
        esChico = siEsChico;
    }

    /**
     * Metodo saludar
     */
    public void saludar()
    {
        System.out.println("Hola, me llamo " + nombre + ", tengo " + edad + " años y soy un ");
    }
}
