import java.util.*;


public class RemoveIf {
    public static void main(String args[]){

        List<String> words = new ArrayList<>();
        words.add("JAVA");
        words.add("CPP");
        words.add("HTML");
        words.add("CSS");
        words.add("PYTHON");
        words.add("DOTNET");
        
        words.removeIf(w-> w.length()%2!=0);
        words.forEach(System.out::println);
    }
}