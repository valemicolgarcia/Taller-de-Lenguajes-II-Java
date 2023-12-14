package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.Cyclone;
import entregable.ataques.Gun;
import entregable.ataques.Knife;
import entregable.ataques.Swirl;
import entregable.ataques.Twister;
import entregable.ataques.Weapon;
import game.attacks.ColdBreath;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class Storm extends Monster{

		
		// habilidades
		private List<Swirl> skills = Arrays.asList(new Twister(), new Cyclone());
		
		
		public Storm(String name) {
			this.life = 300;
			this.monsterName = name;
			// habilidades
			this.activeSkill = skills.get(0);
			this.types = Arrays.asList(Type.SWIRL);
		}

		public void onDamageReceive (Integer damage, Monster monster) {
			this.life = this.life - damage; 
			//La princesa esta protegida por la bestia y recibe la mitad del daño
			if (this.life < 0) {
				this.life = 0;
			} else {
				this.life += this.life / 2;
				//La tormenta recarga la mitad de su vida por la fuerza del agua o del viento
			}
			System.out.println(this.monsterName + "queda con " + this.life + "puntos de vida");
		}
		
		
		@Override
		public void attack(Monster enemy) {
			int damage = this.activeSkill.damage(enemy);
			System.out.println("--     [" + this + "] ataca a [" + enemy + "] haciendole " + damage + " de daño");
			enemy.onDamageReceive(damage, this);
		}
		
		
		
		
		@Override
	    public void move(PathBox oldPathBox, PathBox newPathBox) {
	        super.move(oldPathBox, newPathBox);
	        if(activeSkill instanceof Swirl) {
	            this.activeSkill = skills.get(1);
	            this.life -= 10;
	            //va perdiendo agua a medida que se mueve
	        } else {
	            this.activeSkill = skills.get(0);
	            this.life += 10;
	            //va ganando agua a medida que se mueve
	        }
	    
		
	}

}
