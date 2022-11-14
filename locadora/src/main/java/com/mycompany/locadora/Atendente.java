package com.mycompany.locadora;
public class Atendente extends Pessoa{
    private boolean admim;
    
    public Atendente(int id, String nome, String dataNascto, String doctoIdentificacao, boolean admim){
        super(id,nome,dataNascto, doctoIdentificacao);
        this.admim = admim;
    }
    
    public boolean isAdmim(){
        return admim;
    }
    
    public void setAdmim(boolean admim){
        this.admim = admim;
    }
}
