import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double sal, vend;
        nome = sc.next();
        sal = sc.nextDouble();
        vend = sc.nextDouble();
        vend = (vend * 0.15) + sal;
        System.out.println("TOTAL = R$ " + String.format("%.2f", vend));
    }
    
}