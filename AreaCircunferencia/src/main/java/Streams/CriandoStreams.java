package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java - ", "Lua - ", "JS\n");
        langs.forEach(print);

        String[] maisLahgs = { "Python - ", "Lisp - ", "Perl - ", "Go\n"};

        Stream.of(maisLahgs).forEach(print);
        Arrays.stream(maisLahgs).forEach(print);
        Arrays.stream(maisLahgs, 1, 4).forEach(print);

        List<String> outrasLangs =Arrays.asList("C ", "PhP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
