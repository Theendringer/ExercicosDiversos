/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto17;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Projeto17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho da área em metros que será pintada:");
        double areaPintada = scanner.nextDouble();
        
        double questA = areaPintada/6;
        double questAa = questA / 18;
        
        System.out.println("Será necessário a compra de: " + questAa + " lata(s).");
       
        double questB = questA /3.6;
        
        System.out.println("Serão necessários a compra de: " + questB + " galão(ões)");
    }
    
}
