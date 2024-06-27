import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroCorrecto = new Random().nextInt(100);
        int intentos = 0;

        while (intentos < 3){

            System.out.println("Escribe un número del 1 al 100: ");
            int numero = teclado.nextInt();
            intentos++;

            if(numero == numeroCorrecto){
                System.out.println("¡Haz adivinado, el número correcto es " + numeroCorrecto + " y lo adivinaste en " + intentos + " intentos!");
                break;
            }else if(numero < numeroCorrecto){
                System.out.println(numeroCorrecto);
                System.out.println("El número que escribiste es menor al número correcto.");
            }else {
                System.out.println(numeroCorrecto);
                System.out.println("El número que escribiste es mayor al número correcto.");
            }

            if(intentos == 3){
                System.out.println("¡Perdiste!");
            }
        }
    }
}
