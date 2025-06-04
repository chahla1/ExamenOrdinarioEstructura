import java.util.ArrayList;
import java.util.Arrays;

public class conjuntoCadenas {
    private String[] conjunto;
    private int contador;

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

    // Cuenta cuantas cadenas contienen una subcadena
    public int numeroInclusiones(String subcadena) {
        int cuenta = 0;
        for (int i = 0; i < contador; i++) {
            if (conjunto[i].contains(subcadena)) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public void eliminaNoInclusiones(String subcadena){
        int nuevaPos = 0;
        for (int i = 0; i < contador; i++) {
            if (conjunto[i].contains(subcadena)) {
                conjunto[nuevaPos++] = conjunto[i];
            }
        }
        contador = nuevaPos;
    }

    // Aqui ponemos un metodo privado para saber si un elemento esta
    private boolean contiene(String elemento) {
        for (int i = 0; i < contador; i++) {
            if (conjunto[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
}





