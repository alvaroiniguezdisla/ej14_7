package dominio;
import java.util.stream.Stream;
public class ej14_7 {
    public static int menornumerolista(int[] lista){
        return Stream.iterate(0, i -> i + 1).limit(lista.length).map(i -> lista[i]).min(Integer::compare).get();

    }
}
