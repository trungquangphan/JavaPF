package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Loc");
        names.add("Dung");
        names.add("Vu");

        for (String name : names) {
            if(name.equals("Loc")){
                System.out.println(name + " codegym");
            }
        }

        List<String> result = names.stream().filter(name -> name.equals("Loc")).collect(Collectors.toList());
        System.out.println(Arrays.toString(result.toArray()));
    }
}
