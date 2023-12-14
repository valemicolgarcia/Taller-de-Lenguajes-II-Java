package entregable.monstruos;

import java.util.Arrays;

import java.util.List;
import entregable.ataques.*;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class Shadow extends Monster {

	// habilidades
	private List<Weapon> skills = Arrays.asList(new Gun(), new Knife());

	public Shadow(String name) {
		this.life = 300;
		this.monsterName = name;
		// habilidades
		this.activeSkill = skills.get(1);
		this.types = Arrays.asList(Type.WEAPON);

	}

	@Override
	public void attack(Monster enemy) {
		int damage = this.activeSkill.damage(enemy);
		System.out.println("--     [" + this + "] ataca a [" + enemy + "] haciendole " + damage + " de daño");
		enemy.onDamageReceive(damage, this);
	}

	public void onDamageReceive(Integer damage, Monster monster) {
		this.life = this.life - (damage * 3);
		// La sombra como es la mas peligrosa, es la que recibe mas daño
		if (this.life < 0) {
			this.life = 0;
		}
		System.out.println(this.monsterName + "queda con " + this.life + "puntos de vida");
	}

	@Override
	public void move(PathBox oldPathBox, PathBox newPathBox) {
		super.move(oldPathBox, newPathBox);
		// si la vida del mosntruo es menor a 100, esta en peligro entonces empieza a
		// usar la pistola

		if (activeSkill instanceof Weapon) {
			if (this.life < 100) {
				this.activeSkill = skills.get(0);
			} else {
				if (activeSkill instanceof Weapon) {
					this.activeSkill = skills.get(1);
				}

			}

		}

	}
}
