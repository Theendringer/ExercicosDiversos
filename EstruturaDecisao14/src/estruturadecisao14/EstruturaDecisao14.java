/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadecisao14;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class EstruturaDecisao14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe sua segunda nota");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2)/2;
        
        if (media > 9 & media >=10){
            System.out.println("A");
        } else if (media > 7.5 & media <= 9) {
            System.out.println("B");
        } else if (media > 6 & media >= 7.5){
            System.out.println("C");
        } else if (media > 4 & media <= 6) {
            System.out.println("D");
        }else if (media <= 4 & media == 0){
            System.out.println("E");
        }
            
        
    }
    
}
