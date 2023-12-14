package entregable.ataques;

import game.components.Monster;
import game.types.Type;

public class Cyclone implements Swirl {

	@Override
	public int damage(Monster monster) {

		if (monster.getTypes().contains(Type.FIRE)) {
			// si el enemigo es de tipo fuego el dano es el resto de la division de su vida por 7
			return (monster.getLife() / 7);
		} else {
			
			return (monster.getLife() % 7);
		}
	}

}
