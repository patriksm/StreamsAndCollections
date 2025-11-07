import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String ... args){
        List<String> myList = new ArrayList<String>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");
        myList.add("Five");
        myList.add("Six");
        myList.add("Seven");
        myList.add("Eight");
        myList.add("Nine");
        myList.add("Ten");
        System.out.println(myList);
        Stream myStream = myList.stream();
        System.out.println(myStream);
        myStream.map(e -> e + " ").forEach(System.out::print);
    }
}
