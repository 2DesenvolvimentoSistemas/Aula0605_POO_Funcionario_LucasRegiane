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
         
         funcionario.setNumMatricula(658754);
         funcionario.setNome("Gilberto D S");
         funcionario.setNivel('S'); // T = Trainee, J= Junior, P= Pleno, S= Senior;
         funcionario.setSalario(20000);
         funcionario.setAfastado(false);
         
         // Apresentar o  Funcionario
       
       System.out.println("\n\t\t ------ Funcionario ------\n");
       funcionario.apresentarFuncionario();
         
       
       // Calcular o desconto do Salário
       
       funcionario.calcularINSS();
         
       // Imprimir o Salario com desconto  do INSS

       System.out.println("\n\t\t ------Salário com desconto do INSS ------\n");
       funcionario.apresentarFuncionario();
        
    }
    
    
}
