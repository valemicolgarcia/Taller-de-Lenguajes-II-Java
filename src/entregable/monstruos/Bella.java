package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.Gun;
import entregable.ataques.Knife;
import entregable.ataques.Love;
import entregable.ataques.Princess;
import entregable.ataques.Weapon;
import game.attacks.ColdBreath;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class Bella extends Monster{
	
	public Bella(String name) {
		this.life = 1000;
		this.monsterName = name;
		this.activeSkill = new Princess();
		this.types = Arrays.asList(Type.LOVE);
		
	}

	public void onDamageReceive (Integer damage, Monster monster) {
		this.life = this.life - (damage / 2); 
		//La princesa esta protegida por la bestia y recibe la mitad del daño
		if (this.life < 0) {
			this.life = 0;
		} else {
			if (this.life < 10 && this.life > 0) {
				this.life = 50;
				//La princesa recarga vida
			}
		}
		System.out.println(this.monsterName + "queda con " + this.life + "puntos de vida");
	}
	
	@Override
	public void attack(Monster enemy) {
		int damage = this.activeSkill.damage(enemy);
		System.out.println("--     [" + this + "] ataca a [" + enemy + "] haciendole " + damage + " de daño");
		enemy.onDamageReceive(damage, this);
	}
	
	/*
	 * 
	@Override
	public void move(PathBox oldPathBox, PathBox newPathBox) {
		super.move(oldPathBox, newPathBox);
		if(activeSkill instanceof ColdBreath) {
			this.activeSkill = skills.get(1);
		} else {
			this.activeSkill = skills.get(0);
		}
	}
	 */
	
	
	
}
