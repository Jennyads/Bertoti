/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetodesistemas;

/**
 *
 * @author jenny
 */
public class Turma {
    private String semestre;
    private String periodo;
    private int ano;

public Turma(String semestre, String periodo, int ano) {
    this.semestre = semestre;
    this.periodo = periodo;
    this.ano = ano;
}

public String getSemestre() {
    return semestre;
    
}
public void setSemestre(String novoSemestre) {
    semestre = novoSemestre;
  
}
public String getPeriodo() {
    return periodo;
}

public void setPeriodo(String novoPeriodo) {
    periodo = novoPeriodo;                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
               
}
public int getAno(){
    return ano;
}

public void setAno(int novoAno){ {
    ano = novoAno;
}
}
