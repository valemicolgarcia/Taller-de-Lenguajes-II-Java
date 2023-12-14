package entregable.ataques;

import game.components.Monster;

public class Gun implements Weapon{

	@Override
	public int damage(Monster monster) {
		//dispara y el enemigo muere al instante
		return monster.getLife();
	}

}
