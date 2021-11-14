
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
        System.out.print("Hola, me llamo " + nombre + ", tengo " + edad + " años y soy ");
        if (esChico) {
            System.out.println("un chico");    
        }
        else {
            System.out.println("una chica");
        }
        
    }
}
