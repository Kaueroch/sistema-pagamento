package com.sistemapizza;

import java.util.ArrayList;
import java.util.Scanner;

public class products {
	Scanner sc = new Scanner(System.in);
	private int quantidade, valordoproduto;
	private String nomeproduto;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getValordoproduto() {
		return valordoproduto;
	}

	public void setValordoproduto(int valordoproduto) {
		this.valordoproduto = valordoproduto;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public void adicionarvalorenomeproduto() {
		System.out.println("Nome do produto");
		nomeproduto = sc.nextLine();
		System.out.println("Insira a quantidade de produtos");
		quantidade = sc.nextInt();
        System.out.println("Insira o valor do produto ");
        valordoproduto = sc.nextInt();
        System.out.println( "--Informações da compra-- ");
        System.out.println(nomeproduto);
        System.out.println(quantidade);
        System.out.println(valordoproduto);
        autocalcular();
	}
  
	// fazer lógica que implemente o valor e o nome produto no log ao digitar
	// e auto calcular ja
	public void autocalcular() {
		int calculoauto = quantidade * valordoproduto;
		System.out.println("O resultado da sua compra: " + calculoauto);
	}
 
//Descontos e promoções: Capacidade de aplicar descontos, 
//cupons promocionais e ofertas especiais durante o processo de pagamento.	
	public void desconto() {

	}

}
