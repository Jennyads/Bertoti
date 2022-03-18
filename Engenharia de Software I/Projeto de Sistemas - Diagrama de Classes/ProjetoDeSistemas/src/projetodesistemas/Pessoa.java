package projetodesistemas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenny
 */
public class Pessoa {
    private String nome;
    private String tipo;
    
    public Pessoa(String nome, String tipo) {
        this.nome = nome; 
        this.tipo = tipo;
        
    }
    public String getNome(){
        return nome;
        
    }
    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    public String getTipo() {
        return tipo;
        
    }
    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

}
