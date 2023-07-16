package semaforo;

public class mainSemaforo {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.color="verde";
        semaforo.estado=true;
        System.out.println(semaforo.decicion());
    }
}
