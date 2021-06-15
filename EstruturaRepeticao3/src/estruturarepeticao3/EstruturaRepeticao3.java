/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturarepeticao3;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class EstruturaRepeticao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        boolean infoValida = false;
        
        do {
            System.out.println("Insira seu Nome:");
            nome = scanner.next();
            
            if(nome.length() > 3){
                infoValida = true;
            } else{
                System.out.println("Nome precisa ser maior que 3 caracteres.");
            }
       } while(!infoValida);
        
        do{
            System.out.println("Insira seu idade.");
            idade = scanner.nextInt();
            
            if(idade >= 0 && idade <= 150){
                infoValida = true;
            }else{
                System.out.println("idade precisa ser entre 0 e 150.");
            }
        }while(!infoValida);
        
        do{
            System.out.println("Informe seu salário:");
            salario = scanner.nextDouble();
            
            if(salario > 0){
                infoValida = true;
            } else{
                System.out.println("Salário precisa ser maior que 0");
            }
        }while(!infoValida);
        
        do{
            System.out.println("Informe seu sexo");
            sexo = scanner.next();
            
            if(sexo.equalsIgnoreCase("f") && sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else{
                System.out.println("Sexo precisa ser informado como 'f' ou 'm'.");
            }
        }while(!infoValida);
        
        do{
            System.out.println("Informe seu Estado Civil:");
            estadoCivil = scanner.next();
            
            if(estadoCivil.equalsIgnoreCase("s") && estadoCivil.equalsIgnoreCase("c") && estadoCivil.equalsIgnoreCase("v")
                    && estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Estado Civil precisa ser insirido como 's', 'c', 'v' ou 'd'.");
            }
        }while(!infoValida);
        
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " +sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        
        
        
    }
    
}
