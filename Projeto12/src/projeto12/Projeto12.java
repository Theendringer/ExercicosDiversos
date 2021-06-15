/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto12;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua altura:");
        double altura = scanner.nextDouble();
        
        double  pesoIdeal =  (72.7 * altura) - 58;
        
        System.out.println("Seu peso ideal equivale á: " + pesoIdeal + "Kg");
        
    }
    
}
