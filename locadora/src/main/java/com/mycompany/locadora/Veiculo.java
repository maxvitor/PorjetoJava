package com.mycompany.locadora;
public class Veiculo {
    
   public String marca;
   public String modelo;
   public String cor;
   public Integer numPlaca;
   public float quilometragem;
   public Integer anoFabri;
   public String tipoVeiculo;
   public  boolean statusLocacao;
    
    public void consultaVeiculo(){
        System.out.println("A marca do veiculo é " + this.marca);
        System.out.println("O modelo do veiculo é " + this.modelo);
        System.out.println("A cor do veiculo é " + this.cor);
        System.out.println("Numero da placa é " + this.numPlaca);
        System.out.println("A quilometragem do veiculo é " + this.quilometragem);
        System.out.println("O ano de fabricação do veiculo é " + this.anoFabri);
        System.out.println("O tipo do veiculo é " + this.tipoVeiculo);
        if(this.statusLocacao == true){
        System.out.println("Liberado para locação");
        }else{
         System.out.println("Indisponivel no momento");  
        }
    }
    
    public void cadastrarVeiculos(String marcax, String modelox, String corx, int numPlacax, float quilometragemx, int anoFabrix,String tipoVeiculox,boolean statusLocacaox){
        marca = marcax;
        modelo = modelox;
        cor = corx;
        numPlaca = numPlacax;
        quilometragem = quilometragemx;
        anoFabri = anoFabrix;
        tipoVeiculo = tipoVeiculox;
        statusLocacao = statusLocacaox;
        
        if( (marca.equals("")) && (modelo.equals("")) && (cor.equals("")) && (numPlaca == null) && (anoFabri == null) && (tipoVeiculo.equals("")) ){
             System.out.println("Veiculo registrado com sucesso"); 
        }else{
              System.out.println("Veiculo registrado com sucesso"); 
        }
    }
    
    
}
