/**
 * Mienbros estáticos de una clase
 */
package miembros_estaticos;

/**
 * Clase que ayuda a entender el concepto de miembros estáticos de una clase.
 * 
 * @author Brithanny Arguello
 */
public class Estatico {

    /**
     * Cuando usamos el static en un atributo de una clase, deja de ser un atributo
     * individual de cada objeto, y se convierte en un atributo que se comparte. Si
     * al atributo se le cambia el valor, este va a cambiar para todos los objetos,
     * ya que el atributo estatico es compartido.
     */
    private static String sentence = "Hello world";

    /**
     * También existen los métodos de tipo estático, los cuales no necesitan de un
     * objeto para que podamos acceder a ellos.
     * 
     * @param num1
     * @param num2
     * @return
     */
    public static int add(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    /**
     * Método main de la clase Estatico.
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Creamos dos diferentes objetos de clase Estatico
         */
        Estatico objectOne = new Estatico();
        Estatico objectTwo = new Estatico();

        /**
         * Se le cambia el valor del atributo estático a uno de los objetos, pero como
         * el atributo no es propio del objeto sino de la clase, el valor cambia para
         * todos los objetos.
         */
        objectTwo.sentence = "Hello Brithanny";

        System.out.println(objectOne.sentence);
        System.out.println(objectTwo.sentence);

        /**
         * También podemos acceder al atributo, sin necesitad de un objeto, ya que este
         * le pertenece a la clase.
         */
        System.out.println(Estatico.sentence);

        /**
         * Llamamos al método sin tener que crear una instancia.
         */
        System.out.println("La suma es: " + Estatico.add(2, 3));
    }

    /**
     * Cuando tenemos miembros estáticos de una clase, dichos miembros no le
     * pertenecen a la clase, sino que van a pertenecer a la clase.
     */

}
