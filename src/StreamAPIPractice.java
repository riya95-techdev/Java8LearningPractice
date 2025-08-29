import java.util.Arrays;
import java.util.List;
public class StreamAPIPractice {
    public static void main(String[] args) {

////        ✅ Question 1: Double Each Number
////        Given a list of integers:
////        [2, 4, 6, 8, 10]
////        Use Stream API to create a new list where each number is doubled.
////                Expected Output:
////                 [4, 8, 12, 16, 20]
//        List<Integer> numbers = List.of(2,4,6,8,10);
//
//        List<Integer> doubledNumbers = numbers.stream()
//                                              .map(number->number*2) //[4,8,12,16,20]
//                                              .skip(2L) //[12,16,20]
//                                              .toList();
//        System.out.println(doubledNumbers);


        /*
        ✅ Question 2: Convert List of Strings to Uppercase
        Given a list of names:
        ["alice", "bob", "charlie"]
        Use Stream API to convert each name to uppercase.
        Expected Output:
        ["ALICE", "BOB", "CHARLIE"]
         */
        List<String> names= Arrays.asList("alice", "bob", "charlie");
        List<String> namesInUpperCase = names.stream()
                                                .map(name-> name.toUpperCase())
                                                .toList();
        System.out.println(namesInUpperCase);

        List<String> namesUpperCase = names.stream()
                                            .map(String :: toUpperCase)
                                            .toList();
        System.out.println(namesUpperCase);
    }
}
