/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto6;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o raio do círculo:");
        double raio = scanner.nextDouble();
        
        double area = Math.PI * (raio * raio);
        
        System.out.println("A área do círculo equivale á: " + area);   
    }
    
}
