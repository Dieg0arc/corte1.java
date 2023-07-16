package maquinaDulces;

public class MaquinaDulces {
    public String dulces;
    public int precios;
    public int idetificacion;
    public String showMaquina() {
        switch (idetificacion) {
            case 23: {
                return " su seleccion a sido chocolates ";

                    }default: {
                return "por ahora no contamos con mas productos";
                }
            }
        }
        public String showMaquina2(){
        switch (dulces){
            case "chcolatina":{
                return "¿lo qu usd quiere es una chocolatina? ";
            } default:{
                return "seleccion incorrecta ";
            }
        }
    }
}
