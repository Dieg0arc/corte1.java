package DatosPersona;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.cedula="1092456444";
                persona.nombre="Diego ALejandro Ramirez Castro";
                        persona.kilos=60.5f;
        System.out.println(persona.mostrarDatos());

    }
}
