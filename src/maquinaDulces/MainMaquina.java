package maquinaDulces;

import java.util.Scanner;

public class MainMaquina {
    public static void main(String[] args) {
        MaquinaDulces maquina= new MaquinaDulces();
            Scanner lector = new Scanner(System.in);
        System.out.println("ingrese la opcion que decesa: ");
        maquina.idetificacion =lector.nextInt();
        System.out.println(maquina.showMaquina());


    }
}
