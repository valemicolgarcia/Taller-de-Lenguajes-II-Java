import java.util.Scanner;


public class Testimc {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //ingreso los valores desde teclado
        System.out.println("Ingrese el peso");
        float peso = scanner.nextFloat();
        System.out.println("Ingrese la altura");
        float altura = scanner.nextFloat();
        
        //cierro el scanner
        scanner.close();

        //instancia de imc
        Imc i = new Imc(peso, altura);
        float resultado = i.calculo();

        //prueba del metodo calculo
        if (resultado < 18.0) {
            System.out.println("Usted se encuentra x debajo del rango, el resultado del imc es" + resultado);
        }
        else {
            if (resultado < 25.0){
                System.out.println("Usted esta saludable, el resultado del imc es " + resultado);
            }
            else {
                System.out.println("Usted esta x arriba de lo esperado, el resultadp del imc es " + resultado);
            }
        }
        
        


    }

}
