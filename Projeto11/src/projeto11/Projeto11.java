/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto11;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe dois números inteiros:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        
        System.out.println("Informe um número Real:");
        float numeroReal = scanner.nextFloat();
        
        double questA = (numero2/2) * numero1;
        
        float questB = (numero1 * 3) + numeroReal;
        
        float questC = (numeroReal * numeroReal * numeroReal);
        
        System.out.println("O produto do dobro do primeiro com metade do segundo equivale á: " + questA);
        System.out.println("A soma do triplo do primeiro com o terceiro equivale á: " + questB);
        System.out.println("O terceiro elevado ao cubo equivale á: " + questC);           
    }
    
}
