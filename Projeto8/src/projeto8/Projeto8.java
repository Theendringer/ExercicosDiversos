/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto8;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o seu valor de ganho por hora:");
        double valorPorhora = scanner.nextDouble();
        
        System.out.println("Informe o número de horas trabalhadas por mês:");
        double horasPormes = scanner.nextDouble();
        
        double salario = valorPorhora * horasPormes;
        
        System.out.println("Seu salário equivale á R$" + salario);
    }
    
}
