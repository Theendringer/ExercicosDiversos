/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadecisao5;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class EstruturaDecisao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a sua primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Insira a sua segunda nota:");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2)/2;
        
        
        if (media >= 7){
            System.out.println("Aprovado!");
        } else if (media < 7){
            System.out.println("Reprovado");
        } else if (media >= 10){
            System.out.println("Aprovado com distinção");
        }
            
        
        
        
    }
    
}
