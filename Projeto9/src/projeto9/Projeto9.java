/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto9;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        
        double temperaturaEmC = 5 * ((fahrenheit-32) / 9);
        
        System.out.println("A temperatura " + fahrenheit + "Fahrenheits, equivale á " + temperaturaEmC + "graus Celsius");
    }
    
}
