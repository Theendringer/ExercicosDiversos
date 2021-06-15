/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto4;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Informe a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Informe a qaurta nota:");
        double nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("O valor médio das notas é de: " + media);
        
    }
    
}
