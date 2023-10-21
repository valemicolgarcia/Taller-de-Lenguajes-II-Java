package futbol;

public class Partido {

	public static void main(String[] args) {
		
		//imprimo posiciones de los jugadores para comprobar el correcto funcionamiento de los enumerativos
		for (Posicion p: Posicion.values())
			System.out.println(p);
		
		//armo dos equipos
		Equipo boca = new Equipo();
	//	Equipo river = new Equipo();
		
		//EQUIPO 1 BOCA
		String nom;
		nom = "vale";
		Jugador j1 = new Jugador(nom , Posicion.ARQUERO, Posicion.DELANTERO);
		nom = "dolo";
		Jugador j2 = new Jugador(nom, Posicion.DELANTERO, Posicion.DEFENSA);
		nom = "tibu";
		Jugador j3 = new Jugador(nom, Posicion.MEDIOCAMPO, Posicion.ARQUERO);
		nom = "peter";
		Jugador j4 = new Jugador(nom, Posicion.DEFENSA, Posicion.DEFENSA);
		nom = "coco";
		Jugador j5 = new Jugador(nom, Posicion.DEFENSA, Posicion.MEDIOCAMPO);
		
		boca.agregarJugador(j1);
		boca.agregarJugador(j2);
		boca.agregarJugador(j3);
		boca.agregarJugador(j4);
		boca.agregarJugador(j5);
		
		
		
		//VERIFICACION DE QUE ESTEN LAS POSICIONES REQUERIDAS PARA EL EQUIPO
		boolean arq = false;
		boolean del = false;
		boolean medio = false;
		boolean defensa = false;
		
		for (Jugador jug : boca.getJugadores()) {
			if((arq == false) && ((jug.getPos1() == Posicion.ARQUERO ) || (jug.getPos2() == Posicion.ARQUERO)) )
				arq=true; 
			else {
				if ((del == false )&&(( jug.getPos1() == Posicion.DELANTERO ) || (jug.getPos2() == Posicion.DELANTERO)))
					del=true;
				else {
					if ((defensa == false) && (( jug.getPos1() == Posicion.DEFENSA ) || (jug.getPos2() == Posicion.DEFENSA)))
						defensa = true;
					else {
						if ((medio == false) &&(( jug.getPos1() == Posicion.MEDIOCAMPO ) || (jug.getPos2() == Posicion.MEDIOCAMPO)) )
							medio = true;
					}
				}
			}
		}
		
		if ( arq && del && medio && defensa )
			System.out.println("Boca esta bien formado");
		else 
			System.out.println("Boca no cumple");
		
		
		
	}

}
