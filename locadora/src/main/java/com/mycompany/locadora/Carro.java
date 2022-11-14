package com.mycompany.locadora;
public class Carro extends Veiculo{
    private int numPortas;
    
    public Carro(int id, String marca, String modelo, double valorLocacaoDia, int quilometragem, int ano, int numPortas ){
        super(id,marca,modelo,valorLocacaoDia,quilometragem,ano);
        this.numPortas = numPortas;
    }
    
    public int getNumPortas(){
        return numPortas;
    }
    public void setNumPortas( int numPortas){
        this.numPortas = numPortas;
    }
}
