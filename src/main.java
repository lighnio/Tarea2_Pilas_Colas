import com.sun.security.jgss.GSSUtil;

import javax.lang.model.element.NestingKind;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //Scanner
        Scanner entry = new Scanner(System.in);
        int op;
        //Implementando la Queue
        Queue<String> queue = new LinkedList<>();

        //Rellenar la queue
        queue = addToQueue(queue);

        while (true){

            printMenu();
            op = entry.nextInt();
            switch (op){

                case 1:
                    queue = addToQueue(queue);
                    break;

                case 2:

                    System.out.println("Aviones: ");

                    if (queue.size() < 1){
                        System.out.println("No hay aviones.");
                    }else {
                        System.out.println(queue);
                    }

                    break;

                case 3:
                    System.out.println("Avion Disponible: " + queue.peek());
                    break;

                case 4:
                    System.out.println("Aviones pendientes: ");
                    System.out.println(queue);
                    break;

                case 5:
                    System.out.println("Proximo avion a despegar: " + queue.peek());
                    break;

                case 6:
                    queue.remove(queue.peek());
                    break;

                case 7:
                    System.out.println("Gracias por usar el servicio.");
                    break;

                default:
                    System.out.println("Dato incorrecto");
                    break;

            }

            if (op == 7){
                break;
            }
        }

    }

    public static Queue addToQueue(Queue secondQueue){
        Scanner SecondEntry = new Scanner(System.in);

        while(true){
            System.out.println("Enter the plane registration (enter EXIT to finish):");
            String temp = SecondEntry.next();

            if (temp.toLowerCase().trim().equals("exit")){
                break;
            }

            secondQueue.add(temp);
        }

        return secondQueue;
    }

    public static void printMenu(){
        System.out.println("\tMenu");
        System.out.println("1. Ingresar Aviones");
        System.out.println("2. Mostrar Aviones en Hangar");
        System.out.println("3. Mostrar Avion Disponible");
        System.out.println("4. Ver aviones pendientes a despegar");
        System.out.println("5. Ver proximo avion a despegar");
        System.out.println("6. Despegar el proximo avion");
        System.out.println("7. Salir\n\n");
    }



}
