/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto7;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o comprimento do lado do quadrado:");
        double lado = scanner.nextDouble();
        
        double area = (lado * lado);
        
        double area2vezes = area + area;
        
        System.out.println("O dobro da área do quadrado equivale á: " + area2vezes);
    }
    
}
