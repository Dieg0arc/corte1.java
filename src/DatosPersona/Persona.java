package DatosPersona;

public class Persona {
    public String cedula;
    public String nombre;
    public String Email;
    public int edad;
    public float kilos;
    public String mostrarDatos(){
        return "hola usuario "+ nombre +" con numero de cedula "+ cedula +",tu ultimo reistro de peso fue "+ kilos;
    }

}
