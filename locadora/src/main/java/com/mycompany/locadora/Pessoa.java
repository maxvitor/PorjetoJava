package com.mycompany.locadora;
public class Pessoa {
    private int id;
    private String nome;
    private String dataNascto;
    private String doctoIdentificacao;
    
    public Pessoa(int id, String nome, String dataNascto, String doctoIdentificacao){
        this.id = id;
        this.nome = nome;
        this.dataNascto = dataNascto;
        this.doctoIdentificacao = doctoIdentificacao;
    }
   
    public int getId(){ 
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public String getDataNascto(){ 
        return dataNascto;
    }
    public void setDataNascto(String DataNascto){
        this.dataNascto = DataNascto;
    }
    
    public String getDoctoIdentificacao(){
        return doctoIdentificacao;
    }
    public void setDoctoIdentificacao( String doctoIdentificacao){
        this.doctoIdentificacao = doctoIdentificacao;
    }
    
    public void MostrarDados(){
        System.out.println("O Id da pessoa é " + this.getId());
        System.out.println("A nome da pessoa é " + this.getNome());
        System.out.println("A Data de nascimento é " + this.getDataNascto());
        System.out.println("O documento de identificacao é " + this.getDoctoIdentificacao());
    }
}
