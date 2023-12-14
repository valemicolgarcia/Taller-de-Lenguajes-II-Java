package game.components;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrameWinner extends JFrame{

	
	
	public FrameWinner(String ganador) {
		
		if (ganador.equals("blue")) {
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLUE);
			String ruta = "C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\azul.jpg";
			ImageIcon icono = new ImageIcon(ruta);
			JLabel imagen = new JLabel(icono);
			panel.add(imagen);
			JOptionPane.showMessageDialog(null, panel, "Ganador jugador azul!", JOptionPane.PLAIN_MESSAGE);
		} else {
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLUE);
			String ruta = "C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\rojo.jpg";
			ImageIcon icono = new ImageIcon(ruta);
			JLabel imagen = new JLabel(icono);
			panel.add(imagen);
			JOptionPane.showMessageDialog(null, panel, "Ganador jugador Rojo!!!!", JOptionPane.PLAIN_MESSAGE);
		}
		
	}
		 
		 
	}

