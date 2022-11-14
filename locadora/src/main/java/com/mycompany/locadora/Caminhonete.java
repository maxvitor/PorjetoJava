package com.mycompany.locadora;
public class Caminhonete extends Veiculo{
    private int capacidadeCarga;
    
    public Caminhonete(int id, String marca, String modelo, double valorLocacaoDia, int quilometragem, int ano, int capacidadeCarga){
        super(id,marca,modelo,valorLocacaoDia,quilometragem,ano);
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public int getCapacidadeCarga(){
        return capacidadeCarga;
    }
    public void setCapacidadeCarga( int capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }
}
