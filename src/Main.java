import game.components.ComparadorABC;
import game.components.ComparadorVida;
import game.components.Monster;
import game.components.Player;
import game.components.RumbleGame;
import game.components.TipoComparacion;
import game.monsters.EvilBeast;
import game.monsters.IceBeast;
import game.monsters.Spartan;
import game.random.RandomGenerator;

import java.util.Arrays;
import java.util.List;

import entregable.monstruos.Bella;
import entregable.monstruos.Ghost;
import entregable.monstruos.Shadow;
import entregable.monstruos.Storm;
import entregable.monstruos.Witch;

public class Main {
	public static void main(String[] args) {

		RumbleGame rumbleGame = RumbleGame.getInstance();
		rumbleGame.init();
/*
 * 
		// Lista de monstruos del jugador 1
		List<Monster> monstersOne = Arrays.asList(new Witch("Malefica"), new Bella("Bella"), new Ghost("Casper"),
				new Shadow("La Sombra"), new Storm("Tormenta"), new Spartan("Spartan"));
		
		// Lista de monstruos del jugador 2 - ROJO
		List<Monster> monstersTwo = Arrays.asList(new Bella("Blancanieves"), new Bella("Cenicienta"), new EvilBeast("Bestia"),
				new Shadow("La Sombra 2 "), new Storm("Relampago"), new Storm ("Trueno"), new Spartan("Guerrero"));
 */
		
		// Lista de monstruos del jugador 1
				List<Monster> monstersOne = Arrays.asList(new Witch("Malefica"), new Bella("Bella"), new Ghost("Casper"),
						new Shadow("La Sombra"), new Storm("Tormenta"), new Spartan("Spartan"), new Bella ("Rapunzel"), new Ghost("Canterville"), new Storm ("Rayo"));
				
				// Lista de monstruos del jugador 2 - ROJO
				List<Monster> monstersTwo = Arrays.asList(new EvilBeast("Bestia"));
		
		
		/*
		 * 
		 * List<Monster> monstersOne = Arrays.asList(new Spartan("Spartan 1"), new
		 * Spartan("Spartan 2"), new Spartan("Spartan 3"), new Spartan("Spartan 4"), new
		 * Spartan("Spartan 5"), new Spartan("Spartan 6"), new Spartan("Spartan 7"), new
		 * Spartan("Spartan 8"), new Spartan("Spartan 9"), new Spartan("Spartan 10"),
		 * new IceBeast("Ice Beast"), new Spartan("Spartan 24"), new
		 * Spartan("Spartan 224"), new Spartan("Spartan 34"), new Spartan("Spartan 44"),
		 * new Spartan("Spartan 64"), new Spartan("Spartan 15"));
		 * 
		 * 
		//List<Monster> monstersTwo = Arrays.asList(new Spartan("Spartan A"), new Spartan("Spartan B"));
		 */

		// TODO ordenar el listado de monstruos que recibe el jugador uno
		rumbleGame.getPlayerOne().setMonsters(monstersOne);
		System.out.println(rumbleGame.getPlayerOne().toString());
		ordenarMonstruos(rumbleGame.getPlayerOne());

		// TODO ordenar el listado de monstruos que recibe el jugador dos
		rumbleGame.getPlayerTwo().setMonsters(monstersTwo);
		ordenarMonstruos(rumbleGame.getPlayerTwo());

		rumbleGame.startGame();
	}

	public static void ordenarMonstruos(Player player) {

		int comparacion = RandomGenerator.getInstance().obtenerComparador();
		switch (comparacion) {
		case 0:
			player.ordenarMonsters(TipoComparacion.ABC);
			break;
		case 1:
			player.ordenarMonsters(TipoComparacion.VIDA);
			break;
		default:
			break;
		}

	}

}
