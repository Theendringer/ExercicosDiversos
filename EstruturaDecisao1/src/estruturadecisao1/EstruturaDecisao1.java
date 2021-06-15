/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadecisao1;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class EstruturaDecisao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        float num1 = scanner.nextFloat();
        
        System.out.println("Informe outro número:");
        float num2 = scanner.nextFloat();
        
        
        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior. ");
        } else {
            System.out.println("O número " + num2 + " é maior.");
        }
    }
    
}
