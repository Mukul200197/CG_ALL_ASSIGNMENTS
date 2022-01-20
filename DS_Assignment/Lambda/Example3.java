import java.util.*;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
  
class Example3 {
    public static void main(String args[])
    {
        List<String> names = Arrays.asList(
            "Java", "Html", "Typescript", "Javascript", "Cpp");
        System.out.println("Predicate-----------");
        Predicate<String> p = (s) -> s.startsWith("J");
        for (String st : names) {
            if (p.test(st))
                System.out.println(st);
        }
        System.out.println("Consumer-----------");
        Consumer<String> Consumer = t -> System.out.println(t);
        Stream<String> lang = Stream.of("Hindi", "English", "Marathi", "Chinese");
        lang.forEach(Consumer);
        
        System.out.println("Suplier-----------");
        Supplier<Integer> s = () -> Math.abs(25);
        Optional<Integer> s1 = Optional.of(10);
        System.out.println(s1.orElseGet(s));
    }
}