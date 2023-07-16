package switch1;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Switch1 s = new Switch1();
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese una opcion: ");
        s.option = lector.nextInt();
        System.out.println(s.showOptions());

    }
}
