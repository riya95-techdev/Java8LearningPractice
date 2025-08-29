import java.util.List;
import java.util.Arrays;
public class InstanceMethodReferenceUse {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        List<String> names = Arrays.asList("Alice","Bob","Charlie");

        //Using a Lambda Expression
        names.forEach(name -> greeter.greet(name) );

        System.out.println();
        //Using an instance method refrence
        names.forEach(greeter :: greet);
    }
}
