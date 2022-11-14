package com.mycompany.locadora;
public class Veiculo {
    
   private int id;
   private String marca;
   private String modelo;
   private double valorLocacaoDia;
   private int quilometragem;
   private int ano;
 
   public Veiculo(int id, String marca, String modelo, double valorLocacaoDia, int quilometragem, int ano ){
       this.id = id;
       this.marca = marca;
       this.modelo = modelo;
       this.valorLocacaoDia = valorLocacaoDia;
       this.quilometragem = quilometragem;
       this.ano = ano;
   }
    
    public int getId(){
       return id;
   }
   public void setId( int id){
       this.id = id;
   }
   
   public String getMarca(){
       return marca;
   }
   public void setMarca(String marca){
       this.marca = marca;
   }
   
   public String getModelo(){
       return modelo;
   }
   public void setModelo( String modelo){
       this.modelo = modelo;
   }
   
   public double getValorLocacaoDia(){
       return valorLocacaoDia;
   }
   public void setValorLocacaoDia(double valorLocacaoDia){
       this.valorLocacaoDia = valorLocacaoDia;
   }
   
   public int getQuilometragem(){
       return quilometragem;
   }
   public void setQuilometragem(int quilometragem){
        this.quilometragem = quilometragem;
   }
   
   public int getAno(){
       return ano;
   }
   public void setAno( int ano){
        this.ano = ano;
   }

    public void MostrarDados(){
        System.out.println("O Id do veiculo é " + this.getId());
        System.out.println("A marca do veiculo é " + this.getMarca());
        System.out.println("O modelo do veiculo é " + this.getModelo());
        System.out.println("A quilometragem do veiculo é " + this.getQuilometragem());
        System.out.println("O ano de fabricação do veiculo é " + this.getAno());
    }
    
    
}
