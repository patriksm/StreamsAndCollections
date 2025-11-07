import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
        List<String> myNewList = (List<String>) myStream.
//                filter(obj -> obj.equals("One")).
                map(e -> e + " ").
                collect(Collectors.toList());
        System.out.println(myNewList);

        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        //make it so that you print only the values larger or equal to 90
        // and add 12 to them
        Stream<Integer> myArrStream = Arrays.stream(arr).boxed();
        myArrStream.
                filter(e -> e >= 90).
                map(e -> e + 12).
                forEach(e -> System.out.print(e + " "));
    }
}
