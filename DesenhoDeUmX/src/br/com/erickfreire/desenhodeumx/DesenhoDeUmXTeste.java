package br.com.erickfreire.desenhodeumx;

import javax.swing.JFrame;

public class DesenhoDeUmXTeste {
	public static void main(String[] args) {
		
		DesenhoDeUmX painel = new DesenhoDeUmX();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicacao.add(painel);
		aplicacao.setSize(250,250);
		aplicacao.setVisible(true);
		
	}

}
