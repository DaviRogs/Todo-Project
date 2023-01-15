package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaInicio extends JFrame {
	
	public TelaInicio() {
		//Config da Janela
		
		setTitle("Início");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.RED);
		
		//Criacão do texto
		
		JLabel titulo = new JLabel("Seja bem-vindo");
		
		//Criacão do Botão
		
		JButton botao = new JButton("Hellou");
		
		
		//Dicionando os componentes na janela
		
		add(botao);
		add(titulo);
	}

	public static void main(String[] args) {
		// Criacao da janela
		
		TelaInicio frame = new TelaInicio();
		
		//Exibir a janela
		
		frame.setVisible(true);

	}

}
