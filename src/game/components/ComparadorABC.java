package game.components;

import java.util.Comparator;

public class ComparadorABC implements Comparator <Monster>{

	@Override
	public int compare(Monster monster1, Monster monster2) {	
		return (monster1.monsterName.compareTo(monster2.monsterName));
		
	}
	
	

}
