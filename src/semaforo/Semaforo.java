package semaforo;

public class Semaforo {

    public String color;
    public boolean estado;
    public String decicion(){
        if (color.equals("verde")){
            return "Avance...";
        }else if (color.equals("rojo")){
            return "Detenga su vehiculo...";
        }else if (color.equals("amarrilo")){
            return "Prepare motores...";
        }else{
            return "el semaforo esta dañado";
        }


    }
}
