package unlp.info.comparacionstring;
public class StringDemo {
public static void main(String[] args) {
String str1="Leones y Tigres y Osos!";
String str2="Leones y Tigres y Osos!";
String str3=str2;
String str4=new String("Leones y Tigres y Osos!");
String str5=" Y yo!";
String str6="Leones y Tigres y Osos! Y yo!";
String str7= str1 + str5; //concatena str1 y str5 
System.out.println(str7); //imprime "Leones y Tigres y Osos! Y yo!"

System.out.println(str1==str2); //true (porque apuntan a la misma direccion, al mismo objeto string, ya que se crearon con =)
System.out.println(str1==str3); //true( porq str3 apunta a str2, que apunta a la direccion de str1 por ser la misma cadena que str1 y fueron creadas con = )
System.out.println(str1==str4); //false( str4 aunque tiene el mismo contenido que str1, fue creada con new string, osea que se instancio un objeto string nuevo sin importar si en memoria ya habia una cadena con ese nombre)
System.out.println(str2==str3); //true(apuntan a la misma direccion de memoria ya que fueron igualados)
System.out.println(str2==str4); //false( str4 fue creado con new String, y str2 con =, son objetos diferentes, apuntan a diferentes direcciones aundque tengan el mismo contenido )
System.out.println(str3==str4); //false(lo mismo que el anterior)
System.out.println(str6==str7); //false(ya que str7 es una concatenacion de str1 y str5, lo que crea una nueva cadena en memoria. como apuntan a direcciones diferentes es false)
System.out.println(str1.equals(str4)); //true( tienen el mismo contenido)
System.out.println(str6.equals(str7)); //true( tienen el mismo contenido aunque sean diferentes las referencias a memoria)
}
 }


 /* SOBREESCRITURA DEL EQUALS @Override
- el metodo equals comparar el contenido de dos objetos. Es por esta razón que frecuentemente se lo sobrescribe, asi se pueden definir criterios propios para determinar la igualdad.
- Si no se sobreescribe el método equals en una clase personalizada, el criterio por defecto en Java para comparar dos objetos de esa clase será el criterio de igualdad por referencia. En otras palabras, se considerarán iguales solo si son la misma instancia en memoria, es decir, si hacen referencia al mismo objeto en memoria.
- siempre se espera que se sobreescriba 
*/