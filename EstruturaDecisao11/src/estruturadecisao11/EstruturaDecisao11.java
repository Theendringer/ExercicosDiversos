/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadecisao11;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class EstruturaDecisao11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seu atual salário:");
        double salario =scanner.nextDouble();
        
        double salarioAument1 = salario * 20/100;
        double salarioAument2 = salario * 15/100;
        double salarioAument3 = salario * 10/100;
        double salarioAument4 = salario * 5/100;
        
        
        
        if (salario <= 280) {
            System.out.println("Seu salário era de R$" + salario);
            System.out.println("Foi aplicado um percentual de 20% de aumento em seu salário.");
            System.out.println("O aumento em seu salário foi de R$" + salarioAument1);
            System.out.println("O valor do seu salário após o aumento é de R$" + (salario + salarioAument1));
        } else if (salario > 280 && salario <= 700){
            System.out.println("Seu salário era de R$" + salario);
            System.out.println("Foi aplicado um percentual de 15% de aumento em seu salário.");
            System.out.println("O aumento em seu salário foi de R$" + salarioAument2);
            System.out.println("O valor do seu salário após o aumento é de R$" +(salario + salarioAument2));
        } else if (salario > 700 && salario <= 1500){
            System.out.println("Seu salário era de R$" + salario);
            System.out.println("Foi aplicado um percentual de 10% de aumento em seu salário");
            System.out.println("O aumento em seu salário foi de R$" + salarioAument3);
            System.out.println("O valor do seu salário após aumento é de R$" + (salario + salarioAument3));
        } else if (salario > 1500){
            System.out.println("Seu salário era de R$" + salario);
            System.out.println("Foi aplicado um percentual de 5% de aumento em seu salário");
            System.out.println("O aumento em seu saláro foi de R$" + salarioAument4);
            System.out.println("o valor do seu salário após o aumento é de R$" + (salario + salarioAument4));
        }
    }
    
}
