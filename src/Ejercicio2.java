
import java.util.Stack;




public class Ejercicio2 {
    public boolean esPalindromo(String texto){
        Stack<Character> pila = new Stack<>();
        for(char d : texto.toCharArray()){
            pila.push(d);
        }
        for(char l : texto.toCharArray()){
            if(l != pila.pop()){
                return false;
            }
        }
        return true;
    }

}
