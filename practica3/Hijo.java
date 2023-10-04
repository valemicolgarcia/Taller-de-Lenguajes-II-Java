
//
class Hijo extends Padre {

    Hijo() {
       
    super(1); //faltaba esta linea, porque java no lo hace de manera automatica si el constructor no esta vacio.
    System.out.println("Constructor Hijo()");
    }
}

//JAVA garantiza la correcta creacion de objetos dado que los constructores siempre invocan a los constructores de la superclase. 
