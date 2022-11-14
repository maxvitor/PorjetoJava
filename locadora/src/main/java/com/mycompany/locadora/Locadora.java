package com.mycompany.locadora;
public class Locadora {

    public static void main(String[] args) {   
        
        Veiculo v1 = new Veiculo(0, "", "", 0, 0 ,0);
        v1.setId(5);
        v1.setMarca("HONDA");
        v1.setModelo("CIVIC");
        v1.setValorLocacaoDia(80.00);
        v1.setQuilometragem(80);
        v1.setAno(2015);
        v1.MostrarDados();
        
        Motocicleta m1 = new Motocicleta(0, "", "", 0, 0, 0,0);
        m1.setId(8);
        m1.setMarca("Suzuki");
        m1.setModelo("Hayabusa ");
        m1.setValorLocacaoDia(80);
        m1.setQuilometragem(90);
        m1.setAno(2019);
        m1.setCilindradas(100);
        m1.MostrarDados();
        
        Caminhonete c1 = new Caminhonete(0, "", "", 0, 0, 0,0);
        c1.setId(10);
        c1.setMarca("CHEVROLET");
        c1.setModelo("S10");
        c1.setValorLocacaoDia(80);
        c1.setQuilometragem(90);
        c1.setAno(2018);
        c1.setCapacidadeCarga(100);
        c1.MostrarDados();
        
        Carro ca1 = new Carro(0, "", "", 0, 0, 0, 0);
        ca1.setId(10);
        ca1.setMarca("FIAT");
        ca1.setModelo("PUNTO");
        ca1.setValorLocacaoDia(120);
        ca1.setQuilometragem(60);
        ca1.setAno(2020);
        ca1.setNumPortas(4);
        ca1.MostrarDados();
        
        Pessoa p1 = new Pessoa(0, "", "", "");
        p1.setId(2);
        p1.setNome("Maria");
        p1.setDataNascto("28/06/1888");
        p1.setDoctoIdentificacao("mg127123");
        p1.MostrarDados();
        
        Atendente A1 = new Atendente(0, "", "", "",false);
        A1.setId(5);
        A1.setNome("Paulo");
        A1.setDataNascto("21/03/22");
        A1.setDoctoIdentificacao("MG6465465");
        A1.setAdmim(false);
        A1.MostrarDados();
        
        Cliente cli1 = new Cliente(0, "", "", "",false);
        cli1.setId(5);
        cli1.setNome("Hugo");
        cli1.setDataNascto("24/05/1998");
        cli1.setDoctoIdentificacao("MG41517418");
        cli1.setFinanceiroAprova(true);
        cli1.MostrarDados();
        
        Locacao l1 = new Locacao(0,"","");
        l1.setId(88);
        l1.setDataInicio("08/11/2022");
        l1.setDataFim("20/11/2022");
        l1.setImprimirTIK(true);
        l1.setFaturaServico(true);
        l1.ImprimeTicket();
        l1.faturaServico();
        l1.MostrarDados();
    }
}
