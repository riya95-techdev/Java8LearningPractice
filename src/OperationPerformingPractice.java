import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OperationPerformingPractice {
    public static void main(String[] args) {
        //terminal operation
        List<String> fruits = List.of("Apple", "Banana", "Orange");
        fruits.stream().forEachOrdered(fruit -> System.out.println("this is "+fruit));

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
                //even numbers
        nums.stream()
                .filter(num->num%2 == 0)
                .forEach(System.out::println);
        //odd numbers
        nums.stream()
                .filter(num -> num%2 != 0)
                .forEach(System.out::println);

        Optional<Integer> sum = nums.stream()
                .reduce((first,second)->first + second);
        System.out.println(sum); //Optional[55]

        List<String> xyz = List.of("one","two","three");
        Optional<String> kuchhbhi =xyz.stream().min(Comparator.comparing(String::length));
        System.out.println(kuchhbhi); //Optional[one]

        kuchhbhi.ifPresent(System.out::println); //one

        Optional<String> k= kuchhbhi.stream()
                .findFirst();
        System.out.println(k); //Optional[one]

        Optional<String> k1 = kuchhbhi.stream().findAny();
        System.out.println(k1); //Optional[one]

        k.ifPresent(System.out::println); //one
        k1.ifPresent(System.out::println); //one



    }
}


