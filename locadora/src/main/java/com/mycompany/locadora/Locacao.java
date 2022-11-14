package com.mycompany.locadora;
public class Locacao {
   private int id;
   private String dataInicio;
   private String dataFim;
   private boolean imprimirTIK;
   private boolean faturaServico;
   
   public Locacao(int id, String dataInicio, String dataFim){
       this.id = id;
       this.dataInicio = dataInicio;
       this.dataFim = dataFim;
   }
   
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id = id;
   }
   
   public String getDataInicio(){
       return dataInicio;
   }
   public void setDataInicio( String dataInicio){
       this.dataInicio = dataInicio;
   }
   
   public String getdataFim(){
       return dataFim;
   }
   public void setDataFim(String dataFim){
       this.dataFim = dataFim;
   }
   
   public boolean getImprimirTIK(){
       return imprimirTIK;
   }
   public void setImprimirTIK(boolean imprimirTIK){
       this.imprimirTIK = imprimirTIK;
   }
   
   public boolean getFaturaServico(){
       return faturaServico;
   }
   public void setFaturaServico( boolean faturaServico){
       this.faturaServico = faturaServico;
   }
   
   public void ImprimeTicket(){
       if(getImprimirTIK() == true){          
        System.out.println("Tikect impresso com sucesso");
       }else{
        System.out.println("Tikect não impresso");
       }
   }
   public void faturaServico(){
       if(getFaturaServico() == true){
           System.out.println("Sucesso ao faturar servico");
       }else{
           System.out.println("Serviço não faturado");
       }
   }
   
   public void MostrarDados(){
       System.out.println("Id da locação é" + this.getId());
       System.out.println("O Inicio da locação foi é " + this.getDataInicio());
       System.out.println("O fim da locação foi é " + this.getdataFim());
   }
   
}
