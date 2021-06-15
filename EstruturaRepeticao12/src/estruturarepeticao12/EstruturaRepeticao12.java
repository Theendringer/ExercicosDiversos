/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturarepeticao12;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class EstruturaRepeticao12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int tabuada;
        
        System.out.println("Informe o numero a ser multiplicado");
        numero = scanner.nextInt();
        
        for(int i = 1; i<=10; i++){
            tabuada = numero * i;
            
            System.out.println(numero + " " + "x" + " " + i + " " + "=" + " " + tabuada);
        
        } 
    }
    
}
