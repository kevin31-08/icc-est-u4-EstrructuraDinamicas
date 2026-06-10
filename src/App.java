
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        // runLinkList();
        // runQueue();
        // runStack();
        // Ejercicio1 ejemplo = new Ejercicio1();
        // System.out.println("invertido"+ ejemplo.invertirString("comptutacion"));
        System.out.println("Ejercicio 2: es palindromo");
        Ejercicio2 ejemplo1 = new Ejercicio2();

        System.out.println("radar es Palindromo? " + ejemplo1.esPalindromo("radar"));

        System.out.println("la palabra radar deve retornar : " + ejemplo1.esPalindromo("radar"));
        System.out.println("computacion es Palindromo: " + ejemplo1.esPalindromo("computacion"));

        
    }




















     private static void runLinkList(){
        System.out.println("Linkedlist");

        LinkedList<String> texto = new LinkedList<>();
        
        texto.add("Computacion");

        System.out.println(texto);
     }

     private static void runQueue(){

            Queue<String> cola = new LinkedList<>();
            cola.offer("radar");
            System.out.println("COLA" + cola);
            
     }
     private static void runStack(){
        ArrayDeque<String> cola = new ArrayDeque<>();
        cola.push("galo");

        System.out.println("pila "+ cola);
        System.out.println("------------------------------------------------------------------");

        ArrayDeque<String> pila = new ArrayDeque<>();

        pila.offer("kevin");
        System.out.println(pila);

     }
}
