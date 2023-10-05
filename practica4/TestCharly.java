package practica4;

public class TestCharly {
    
    public static void main (String [] args){

        //clase parra probar el singleton
        Charlygarcia charly = Charlygarcia.getInstance();
        charly.cantar();

        Charlygarcia charly2 = Charlygarcia.getInstance();

        if (charly2 == charly){
            System.out.println("Es la misma instancia");
        }
        else{
            System.out.println("No es la misma instancia (SINGLETON)");
        }

    }

}
