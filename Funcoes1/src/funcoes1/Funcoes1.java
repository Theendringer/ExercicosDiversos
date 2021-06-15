/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes1;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Funcoes1 {

    /**
     * @param args the command line arguments
     */
    
    public static void repeticao(int numRepetido){
        for(int i=0; i<numRepetido; i++){
            for(int j=0; j<(i+1); j++){
                System.out.print((i+1) +"");
                
            }
            System.out.println();
        }
    } 
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número para repetição: ");
        int numRep = scanner.nextInt();
        repeticao(numRep);
    }
    
}
