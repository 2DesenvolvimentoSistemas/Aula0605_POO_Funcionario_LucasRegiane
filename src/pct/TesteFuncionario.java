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
public class TesteFuncionario {
    
    public static void main(String[] args) {
        
         // Construção do objeto funcionario
        
         Funcionario funcionario = new Funcionario();
         
         funcionario.numMatricula= 658754;
         funcionario.nome= "Gilberto D S";
         funcionario.nivel= 'S'; // T = Trainee, J= Junior, P= Pleno, S= Senior;
         funcionario.salario= 20000;
         funcionario.afastado=false;
         
         // Apresentar o  Funcionario
       
       System.out.println("\n\t\t ------ Funcionario ------\n");
       funcionario.exibirFuncionario();
         
       
       // Calcular o desconto do Salário
       
       funcionario.calcularINSS();
         
       // Imprimir o Salario com desconto  do INSS

       System.out.println("\n\t\t ------Salário com desconto do INSS ------\n");
       funcionario.exibirFuncionario();
        
    }
}
