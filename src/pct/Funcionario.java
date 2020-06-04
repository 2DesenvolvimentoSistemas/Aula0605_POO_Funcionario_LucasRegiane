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
    
    private int numMatricula;
    private String nome;
    private char nivel;
    private double salario;
    private boolean afastado;
    
   public void apresentarFuncionario(){
       
        switch (getNivel()) {
            case 'T':
                System.out.println("Nome: " + getNome());
                System.out.println("Nivel:" + getNivel() +"-Trainee");
                System.out.println("Salário:R$ " + getSalario());
                System.out.println("afastado:" + isAfastado());
                System.out.println("Número da matrícula:" + getNumMatricula());
                break;
            case 'J':
                System.out.println("Nome: " + getNome());
                System.out.println("Nivel:" + getNivel() +"-Junior");
                System.out.println("Salário:R$ " + getSalario());
                System.out.println("afastado:" + isAfastado());
                System.out.println("Número da matrícula:" + getNumMatricula());
                break;
            case 'P':
                System.out.println("Nome: " + getNome());
                System.out.println("Nivel:" + getNivel() +"-Pleno");
                System.out.println("Salário:R$ " + getSalario());
                System.out.println("afastado:" + isAfastado());
                System.out.println("Número da matrícula:" + getNumMatricula());
                break;
            case 'S':
                System.out.println("Nome: " + getNome());
                System.out.println("Nivel:" + getNivel() +"-Senior");
                System.out.println("Salário:R$ " + getSalario());
                System.out.println("afastado:" + isAfastado());
                System.out.println("Número da matrícula:" + getNumMatricula());
                break;
            default:
                System.out.println("Profissional não identificado verifique o nível.");
                break;
        }
          
    }
    public void calcularINSS(){
        
           setSalario(getSalario() - (getSalario() * 0.10));
                
        }

    /**
     * @return the numMatricula
     */
    public int getNumMatricula() {
        return numMatricula;
    }

    /**
     * @param numMatricula the numMatricula to set
     */
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nivel
     */
    public char getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the afastado
     */
    public boolean isAfastado() {
        return afastado;
    }

    /**
     * @param afastado the afastado to set
     */
    public void setAfastado(boolean afastado) {
        this.afastado = afastado;
    }

    public Funcionario(int numMatricula, String nome, char nivel, double salario, boolean afastado) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
        this.afastado = afastado;
    }
    
    public  Funcionario(){
    
    }
}