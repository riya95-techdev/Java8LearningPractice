import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticMethodReferenceUse {
    public static void main(String[] args) {
        List<String > names = Arrays.asList("Java","Python","C++");
//        //Using Lambda expression
//        names.sort((s1,s2)->StringHelper.compareIgnoreCase(s1,s2));
//        System.out.println(names);

        //using a static method reference
        names.sort(StringHelper :: compareIgnoreCase);
        System.out.println(names);

    }
}
