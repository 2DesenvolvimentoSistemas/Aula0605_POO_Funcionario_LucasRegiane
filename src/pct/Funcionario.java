/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Akio
 */
public class Funcionario {
    
    //Atributos
    
    int numMatricula;
    String nome;
    char nivel;
    double salario;
    boolean afastado;
    
   public void exibirFuncionario(){
       
        switch (nivel) {
            case 'T':
                System.out.println("Nome: " + nome);
                System.out.println("Nivel:" + nivel +"-Trainee");
                System.out.println("Salário:R$ " + salario);
                System.out.println("afastado:" + afastado);
                System.out.println("Número da matrícula:" + numMatricula);
                break;
            case 'J':
                System.out.println("Nome: " + nome);
                System.out.println("Nivel:" + nivel +"-Junior");
                System.out.println("Salário:R$ " + salario);
                System.out.println("afastado:" + afastado);
                System.out.println("Número da matrícula:" + numMatricula);
                break;
            case 'P':
                System.out.println("Nome: " + nome);
                System.out.println("Nivel:" + nivel +"-Pleno");
                System.out.println("Salário:R$ " + salario);
                System.out.println("afastado:" + afastado);
                System.out.println("Número da matrícula:" + numMatricula);
                break;
            case 'S':
                System.out.println("Nome: " + nome);
                System.out.println("Nivel:" + nivel +"-Senior");
                System.out.println("Salário:R$ " + salario);
                System.out.println("afastado:" + afastado);
                System.out.println("Número da matrícula:" + numMatricula);
                break;
            default:
                System.out.println("Profissional não identificado verifique o nível.");
                break;
        }
          
    }
    public void calcularINSS(){
        
           salario = salario -(salario * 0.10);
                
        }
    
}
