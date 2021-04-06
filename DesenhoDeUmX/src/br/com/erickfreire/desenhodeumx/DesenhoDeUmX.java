package br.com.erickfreire.desenhodeumx;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Crie um programa em Java que desenha um X dentro de uma Janela Gráfica
 * @author Erick Freire
 * @version 1 - Criado em 05-04-2021 as 23:26
 */

public class DesenhoDeUmX  extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine(0, 0, width, height);
		g.drawLine(0, width, height, 0);
	}

}
