package com.mycompany.locadora;
public class Motocicleta extends Veiculo{
   private int cilindradas;
   
   public Motocicleta(int id, String marca, String modelo, double valorLocacaoDia, int quilometragem, int ano, int cilindradas){
       super(id,marca,modelo,valorLocacaoDia,quilometragem,ano);
       this.cilindradas = cilindradas;
   }
   
   public int getCilindradas(){
       return cilindradas;
   }
   
   public void setCilindradas(int cilindradas){
       this.cilindradas = cilindradas;
   }
   
}
