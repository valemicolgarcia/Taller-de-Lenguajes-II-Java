package game.components;

import javax.swing.*;

import game.types.Type;

import java.awt.*;

public class PathBox {
	private Monster monster;
	private PathBox southBox;
	private PathBox northBox;
	private String name;
	private JButton buttonUI;

	public PathBox(JButton buttonUI, String name) {
		this.buttonUI = buttonUI;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public JButton getButtonUI() {
		return buttonUI;
	}

	public void setButtonUI(JButton buttonUI) {
		this.buttonUI = buttonUI;
	}

	public PathBox getSouthBox() {
		return southBox;
	}

	public void setSouthBox(PathBox southBox) {
		this.southBox = southBox;
	}

	public PathBox getNorthBox() {
		return northBox;
	}

	public void setNorthBox(PathBox northBox) {
		this.northBox = northBox;
	}

	public void update() {
		if (this.monster != null) {
			buttonUI.setText(monster.toString());
			buttonUI.setVisible(true);

			ImageIcon icon = null; // inicializo la imagen en null
			String nombreClase = monster.getClass().getName();
			
			if (monster.getPlayer().getId().equals(1L)) {
				// JUGADORES DEL TIPO 1 - AZUL

				switch (nombreClase) {
				case "game.monsters.EvilBeast":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\bestiablue.jpg");
					break;
				case "entregable.monstruos.Bella":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\bellablue.jpg");
					break;
				case "entregable.monstruos.Ghost":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\fantasmablue.jpg");
					break;
				case "entregable.monstruos.Shadow":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\sombrablue.jpg");
					break;
				case "entregable.monstruos.Storm":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\tormentablue.jpg");
					break;
				case "entregable.monstruos.Witch":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\brujablue.jpg");
					break;
				case "game.monsters.Spartan":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\spartanblue.jpg");
					break;
				case "game.monsters.IceBeast":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\bestiablue.jpg");
					break;
					
				}
				buttonUI.setIcon(icon); // seteo la imagen
				buttonUI.setBackground(new Color(123, 179, 252));// AZUL
				
				
			}else {
				
				//JUGADORES DEL TIPO 2 - ROJO
				
				switch (nombreClase) {
				case "game.monsters.EvilBeast":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\bestia.jpg");
					break;
				case "entregable.monstruos.Bella":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\bella.jpg");
					break;
				case "entregable.monstruos.Ghost":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\fantasma.jpg");
					break;
				case "entregable.monstruos.Shadow":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\sombra.jpg");
					break;
				case "entregable.monstruos.Storm":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\tormenta.jpg");
					break;
				case "entregable.monstruos.Witch":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\bruja.jpg");
					break;
				case "game.monsters.Spartan":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\spartan.jpg");
					break;
				case "game.monsters.IceBeast":
					icon = new ImageIcon(
							"C:\\Users\\oscar\\Documents\\2023\\tdl2\\entregaFinal\\assets\\bestia.jpg");
					break;
					
				}
				buttonUI.setIcon(icon); // seteo la imagen
				buttonUI.setBackground(new Color(231, 123, 123));// ROJO
			}
			
		} else {
			buttonUI.setVisible(false);
			buttonUI.setText("");
			buttonUI.setBackground(Color.WHITE);
		}
	}

}
