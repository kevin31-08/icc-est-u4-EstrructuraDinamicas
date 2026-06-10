import java.util.ArrayDeque;

public class Ejercicio1 {
    
    public String invertirString(String texto){
        ArrayDeque<Character> pila = new ArrayDeque<>();
        for(char c : texto.toCharArray()){
            pila.push(c);
        }
        String invertido = " "; 
        while(!pila.isEmpty()){
            invertido+= pila.poll();
        }
        return invertido;
    }
}
