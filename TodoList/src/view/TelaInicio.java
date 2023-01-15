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
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		//Criacão do texto
		
		JLabel titulo = new JLabel("Atividade desenvolvida durante as aulas de Orientacão a Objetos");
		
		//Criacão do Botão
		
		JButton botao = new JButton("Iniciar");
		
		
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
