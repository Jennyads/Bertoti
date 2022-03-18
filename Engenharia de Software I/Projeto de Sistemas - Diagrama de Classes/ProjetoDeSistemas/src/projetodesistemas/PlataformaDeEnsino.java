/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetodesistemas;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jenny
 */
public class PlataformaDeEnsino {
    private final List <Pessoa>pessoa = new LinkedList<Pessoa>();
    
    public void cadastrarPessoa(Pessoa pessoa) {
        pessoa.add(pessoa);
        
    }
    
    public List<Pessoa>buscarPessoaPorNome(Nome nome){
        List <Pessoa> pessoaEncontrada = new LinkedLis<Pessoa>();
        for(Pessoa pessoa: pessoa){
            if(pessoa.getNome().comparar(nome)pessoa))pessoaEncontrada.add(pessoa);
            
        }
        return pessoaEncontrada;
    }
    public Pessoa buscarPessoaPorNome(String nome){
        for(Pessoa pessoa: pessoa) {
            if(pessoa.getTurma().equals(turma)) return pessoa;
            
        }
        return null;
    } 
    public List<Pessoa>getPessoa(){
        return pessoa;
    }
}
