import threads.PelotaRebotando;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {

        boolean state = true;
        while (state){
            Scanner scanner = new Scanner(System.in);
            System.out.println("0\tCrear nueva pelota");
            System.out.println("1\tSalir de la Aplicacion");
            System.out.print("Seleciona la opcion: ");
            switch (scanner.nextInt()){
                case 0->{
                    Thread thread = new Thread(new PelotaRebotando());
                    thread.start();
                }
                case 1-> state=false;
            }
        }
    }

}
