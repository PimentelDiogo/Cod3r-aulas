package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Stream<String> langs = Stream.of("Java", "Lua", "JS");
        langs.forEach(print);

        String[] maisLangs = {"Python", "C#", "C++", "Go"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);

        List<String> outraLang = Arrays.asList("Python", "C#", "C++", "Go");
        outraLang.stream().forEach(print);
        outraLang.parallelStream().forEach(print);
    }
}
