/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto10;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe uma temperatura em graus Celsius: ");
        double tempEmC = scanner.nextDouble();
        
        double tempEmF = (9/5)*tempEmC + 32;
        
        System.out.println(tempEmC + "C equivale a " + tempEmF + " Fahrenheits");
    }
    
}
