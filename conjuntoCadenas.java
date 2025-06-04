import java.util.ArrayList;
import java.util.Arrays;

public class conjuntoCadenas {
    private String[] conjunto;
    private int contador;
    private boolean contiene(String nuevoElemento) {
        return false;
    }

    //Este es el constructor de la clase
    public conjuntoCadenas(){
        conjunto = new String[1000];
        contador = 0;
    }

    //Este es el constructor de la clase con tamaño maximo
    public conjuntoCadenas(int max){
        conjunto = new String[max];
        contador = 0;
    }

    //Este es el conjunto anade
    public void anade(String nuevoElemento) {
        if (!contiene(nuevoElemento)) {
            if (contador < conjunto.length) {
                conjunto[contador++] = nuevoElemento;
            } else {
                System.out.println("El conjunto esta lleno, no se puede anadir mas elementos");
            }
        }
    }

    public int tamano(){
        return contador;
    }

    public void muestraElementosOrdenados(){
        String[] copia = Arrays.copyOf(conjunto, contador);
        Arrays.sort(copia);
    }





}
