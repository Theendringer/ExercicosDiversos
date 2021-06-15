/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturarepeticao1;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class EstruturaRepeticao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        boolean infoCorreta = false;
        String usuario;
        String senha;
        
        do{
            System.out.println("Informe seu nome de usuário:");
            usuario = scanner.next();
            
            System.out.println("Informe sua senha:");
            senha = scanner.next();
            
            if(usuario.equalsIgnoreCase(senha)){
                System.out.println("Senha não pode ser igual usuário, digite novamente.");
            } else{
                infoCorreta = true;
                System.out.println("Cadastro finalizado com sucesso!");
            }
            
        }while(!infoCorreta);
        
        
    }
    
    
}
