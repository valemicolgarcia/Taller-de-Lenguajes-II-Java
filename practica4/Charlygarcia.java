package practica4;



public class Charlygarcia {
    
    //la instancia de la clase se crea en el momeento de carga de la clase,
    //INICALIZACION TEMPRANA

    //restringe la instanciacion de una clase y asegura que
    //solamente una instancia de la clase exista en la maquina virtual java


    //patron de creacion singleton
    private static Charlygarcia INSTANCE = new Charlygarcia();
    //OBJETIVO--> variable privada de clase del tipo de la clase
    // para referenciar a la unica instancia de esa clase.

    //constructor privado
    private Charlygarcia() {}
    //OBJETIVO--> evitar la creacion de objetos desde otras clases

    //get instance
    public static Charlygarcia getInstance (){
        return INSTANCE;
    }

    //metodo de instancia
    public void cantar(){
    System.out.println("Charly Garcia está cantando");
    }
    //metodo publico de clase que retorne dicha instancia


}
