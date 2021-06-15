/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto13;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua altura:");
        double altura = scanner.nextDouble();
        
        double  pesoIdealmas =  (72.7 * altura) - 58;
        double pesoIdealfem = (62.1 * altura) - 44.7;
        
        System.out.println("Seu peso ideal equivale á: " + pesoIdealmas + " Kg, se você for Homem");
        System.out.println("Seu peso ideal equivale á " + pesoIdealfem + " Kg, se você for Mulher");
    }
    
}
