import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.*;

public class AppRunner {
    public static void main(String[] args) {
        //testing of lambda expressions
//        1. create lambda expression that takes an integer and returns its square
//        Function<Integer, Integer> findingSquare = integer -> integer * integer;
//        System.out.println(findingSquare.apply(8));
//        System.out.println(findingSquare.apply(86));
//        System.out.println(findingSquare.apply(567));

//2. create a function that takes a String and return its length
//        Function<String,Integer> returnLengthOfString = string -> string.length();
//        System.out.println(returnLengthOfString.apply("Riya Namdev"));
//        System.out.println(returnLengthOfString.apply("riya8678fullEnjoy"));
//        System.out.println(returnLengthOfString.apply("rajyalakshmi"));

//        //3. implement a funciton that takes a double and converts it to a long by casting
//        Function<Double,Long> converterDoubleToLong = doubleValue ->  doubleValue.longValue();
//        System.out.println(converterDoubleToLong.apply(9097.9870));
//        System.out.println(converterDoubleToLong.apply(86754.07966));
//        System.out.println(converterDoubleToLong.apply(586969.476875));

//        //4. Write a Function that takes a String and return a String in upperCase.
//        Function<String , String > LowerToUpperCaseConveter = string -> string.toUpperCase();
//        System.out.println(LowerToUpperCaseConveter.apply("riyanamdev"));
//        System.out.println(LowerToUpperCaseConveter.apply("RIYA NAMDEV"));
//        System.out.println(LowerToUpperCaseConveter.apply("NamdeVriYA"));
//        System.out.println(LowerToUpperCaseConveter.apply("riYaNamdEV"));

//        //5. Create a Function that takes a String and returns the String with all whitespace removed.
//        Function<String,String > removeAllWhiteSpaces = string -> string.replaceAll("\\s+" , "");
//        System.out.println(removeAllWhiteSpaces.apply(" R i y a  N a m d e v "));
//        System.out.println(removeAllWhiteSpaces.apply("  Riya Namdev "));
//        System.out.println(removeAllWhiteSpaces.apply(" ri ya  K i Powe r"));

        //6. Write a Function that takes a List<Integer> and returns the sum of all elements.
//        Function<List<Integer>> sumOfListElement = listOfInteger -> {}

        //BiFunction
//        //1.Write a lambda expression for a BiFunction that takes two Integers and returns their sum.
//        BiFunction<Integer,Integer,Integer> sumOfTwoIngers = (int1, int2) -> int1+int2;
//        System.out.println(sumOfTwoIngers.apply(9,98));
//        System.out.println(sumOfTwoIngers.apply(97,65));

//        //2.Create a BiFunction that takes two Strings and returns a new String that is the concatenation of the two.
//        BiFunction<String ,String,String> concatinationOfStrings = (str1,str2) -> str1.concat(str2);
//        System.out.println(concatinationOfStrings.apply("Riya","Namdev"));

//        //3. Implement a BiFunction that takes a String and an Integer and returns a Boolean indicating if the Integer is the length of the String.
//        BiFunction<String,Integer,Boolean> cheker = (string,integer)-> integer==string.length();
//        System.out.println(cheker.apply("RiyaNamdev",10));
//        System.out.println(cheker.apply("RiyaNamdev",11));

//        //4. Write a BiFunction that takes a Double and a Double and returns the larger of the two.
//        BiFunction<Double,Double,Double> checkerLarger = (double1,double2) -> {
//             double large=0.0 ;
//            if(double1>double2)
//                large =double1;
//            else
//                large =double2;
//            return large;
//        };
//        System.out.println("Maximum : "+checkerLarger.apply(69.8,68.9));
//        System.out.println("Maximum: "+checkerLarger.apply(678.67,465.756));

//        //5.Create a BiFunction that takes a String and a char and returns the count of that character in the String.
//        BiFunction<String,Character,Integer> counter = (string,character)->{
//            int count =0;
//            for(int i=0;i<=string.length();i++){
//                if(Character.compare(character,string.charAt(i))==0)
//                    count++;
//            }
//            return count;
//        };
//        System.out.println(counter.apply("Riya Namdev", 'm'));

//        //7. Write a BiFunction that takes two Integers and returns their product.
//        BiFunction<Integer,Integer,Integer> product = (int1,int2)-> int1*int2;
//        System.out.println(product.apply(8,9));
//        System.out.println(product.apply(34,56));

        //consumer
//        //1. Write a Consumer that takes a String and prints it to the console.
//        Consumer<String> printString = string -> System.out.println(string);
//        printString.accept("Riya Namdev");
//        printString.accept("Technology is improving with very high speed");

//        //2. Create a Consumer that takes an Integer and prints whether the number is even or odd.
//        Consumer<Integer> evenOrOddPrinter = integer -> {
//            if(integer%2 == 0)
//                System.out.println(integer+" is an even integer.");
//            else
//                System.out.println(integer+" is an odd integer .");
//        };
//        evenOrOddPrinter.accept(789);
//        evenOrOddPrinter.accept(97688);
//        evenOrOddPrinter.accept(1);
//        evenOrOddPrinter.accept(2);

//        //6. Write a Supplier that returns a random Double value.
//        Supplier<Double> returningDoubleValue = () -> 790.78;
//        System.out.println(returningDoubleValue.get());

//        //9. Write a Supplier that returns the String "Java is fun!".
//        Supplier<String> returningString = () -> "Java is fun!";
//        System.out.println(returningString.get());

        //Unary Operator
//        //Write a lambda using UnaryOperator<Integer> that doubles an integer.
//        UnaryOperator<Integer> returndoubleofinteger = integer -> 2*integer;
//        System.out.println(returndoubleofinteger.apply(6));
//        System.out.println(returndoubleofinteger.apply(56));

//        //Create a BinaryOperator<String> that concatenates two strings with a space in between
//        BinaryOperator<String> returnConcatinationOfString = (str1,str2) -> str1+" "+str2;
//        System.out.println(returnConcatinationOfString.apply("riya","namdev"));
//        System.out.println(returnConcatinationOfString.apply("Namdev","Riya"));

        //Use a Predicate<Integer> to check if a number is greater than 100.
//        Predicate<Integer> returnBoolean = integer -> integer>100;
//        System.out.println(returnBoolean.test(99));
//        System.out.println(returnBoolean.test(100));
//        System.out.println(returnBoolean.test(101));

//        //Write a BiPredicate<String, String> to check if two strings are equal, ignoring case.
//        BiPredicate<String,String> checkingEquals = (s1,s2)-> s1.equals(s2);
//        System.out.println(checkingEquals.test("riya","riya"));
//        System.out.println(checkingEquals.test("Riya","riya"));
//        System.out.println(checkingEquals.test("riya","RIYA"));

        //Create a Supplier<Double> that returns a random number between 0 and 100.
//        Supplier<Double> returnRandomDoubleValue =()-> 984.34;
//        System.out.println(returnRandomDoubleValue.get());

//        //print reversed number of the number that is given by user
//        Consumer<Integer> digits = integerN ->{
//            int remainder=0;
//            int reversed = 0;
//            System.out.println("given number is "+integerN+
//                    "\nProcess of reversing:");
// //         yadi kisi bhi number ka reverse no. find karna hai to is tarike se last me ek no. hi find out hoga naa ki only digit
// //        fir yadi us reversed number mein koi operation perform karna ho to perform kiya ja sakta hai
//            while(integerN !=0 ){
//                remainder = integerN % 10;
//                integerN = integerN /10;
//                reversed = (reversed*10)+remainder;
//                System.out.println(reversed);
//            }
//            System.out.printf("process of reversing is ended and" +
//                    " finaly it gives reverse no. of given number is %d.",reversed);
//            System.out.print("\n"+reversed+"*2 = "+reversed*2);
//        };
//        digits.accept(9754);

//        Function<Integer, List<Integer>> digits = int1 -> {
//            int remainder;
//            List<Integer> listOfdigits = new ArrayList<>();
//            while(int1 != 0){
//                remainder = int1 % 10;
//                int1 = int1 / 10;
//                listOfdigits.add(remainder);
//            }
//            return listOfdigits;
//        };
//        System.out.println(digits.apply(8769));

//        //Armstrong number is a number that equals the sum of its own digits, each raised to the power of the total number of digits.
//        /*
//        153 = (1)^3 +(5)^3 + (3)^3 =153
//        1634 = (1)^4 + (6)^4 + (3)^4 + (4)^4 = 1634
//         */
//        //isArmstrong or not
//        Consumer<Integer> isArmstrong =number -> {
//            int realNumber = number;
//            String stringNumber = String.valueOf(number);
//            int lengthOfString = stringNumber.length();
//            int digit ,sum=0;
//            while (number != 0){
//                digit = number % 10;
//                number/=10;
//                int result=1;
//                for(int power = lengthOfString; power >0; power--){
//                    result *= digit;
//                }
//                sum += result;
//            }
//            if(realNumber == sum) {
//                System.out.println("given number is an armstrong number,because it satisfies all conditions of an armstrong number.");
//            }
//            else{
//                System.out.println("given number is not an armstrong number, since it is not satisfying all conditions of an armstrong number.");
//            }
//        };
//        Scanner riya = new Scanner(System.in);
//        System.out.print("armstrong check karne ke liye ek number enter kijiye : ");
//        int number = riya.nextInt();
//        isArmstrong.accept(number);

//        //Palindrom number is a number that reads the same forwards and backwards.
//        /*
//        like: 121,5445,76567....
//         */
        Scanner riya = new Scanner(System.in);
        Predicate<Integer> isPalindrom = number -> {
            int originalNumber = number;
            int remainder;
            int reversedNumber=0;
            while (number != 0){
                remainder = number % 10;
                number /= 10;
                reversedNumber = (reversedNumber * 10)+remainder;
            }
            if(reversedNumber == originalNumber)
                return true;
            else
                return false;
        };
        System.out.println("enter a number for checking ,whether a number is palindrom or not : ");
        int number = riya.nextInt();
        System.out.println(isPalindrom.test(number));


        
    }
}
