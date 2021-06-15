/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto5;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a metragem em metros:");
        double metros = scanner.nextDouble();
        
        double cm = metros/1000;
        
        System.out.println("A metragem " + metros + "m, equivale á" + cm + "centímetros" );
        
    }
    
}
