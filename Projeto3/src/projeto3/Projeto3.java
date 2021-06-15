/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto3;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); 
     
        System.out.println("Informe o primeiro número:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Informe o segundo número:");
        int numero2 = scanner.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A soma dos números foi: " + soma);
    
     
    }
    
}
