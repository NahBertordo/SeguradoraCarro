/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carroseguradora;

/**
 *
 * @author alunolab08
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Seguro[] seguro;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome(){
       return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getCPF(){
       return cpf;
    }
    
    public void setCPF(String cpf)
    {
        this.cpf = cpf;
    }
     public Seguro[] getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro[] seguro) {
        this.seguro = seguro;
    }
}
