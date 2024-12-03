package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Imprimir {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
        aprovados.forEach(System.out::println);
        //iterator
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Stream
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
