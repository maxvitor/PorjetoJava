package com.mycompany.locadora;
public class Cliente extends Pessoa{
    private boolean financeiroAprova;
    
    public Cliente(int id, String nome, String dataNascto, String doctoIdentificacao, boolean financeiroAprova){
        super(id,nome,dataNascto,doctoIdentificacao);
        this.financeiroAprova = financeiroAprova;
    }
    
    public boolean getFinanceiroAprova(){
        return financeiroAprova;
    }
    public void setFinanceiroAprova( boolean financeiroAprova){
        this.financeiroAprova = financeiroAprova;
    }
}
