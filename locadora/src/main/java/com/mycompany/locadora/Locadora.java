package com.mycompany.locadora;
public class Locadora {

    public static void main(String[] args) {   
        Veiculo v1 = new Veiculo();
        v1.marca = "ford";
        v1.modelo = "fordK";
        v1.cor = "azul" ;
        v1.numPlaca = 2582 ;
        v1.quilometragem = 35;
        v1.anoFabri = 2001;
        v1.tipoVeiculo = "Passeio";
        v1.statusLocacao = true;
        v1.consultaVeiculo();
        
        Veiculo v2 = new Veiculo();
        v2.cadastrarVeiculos("fiat","palio","prata",5218,60,2013,"passeio",true);
        v2.consultaVeiculo();
     
        Motocicleta moto = new Motocicleta();
        moto.cilindradas = 100;
        moto.cor = "azul";
        moto.marca = "HONDA";
        
        Carro novoCarro = new Carro();
        novo
       
       
        
    }
}
