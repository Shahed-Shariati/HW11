package TamrinB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("shahed","amir","samran"));
        Map<Integer, List<String>> map =  list.stream()
                .collect(Collectors.groupingBy(String::length));
        map.forEach((count,strings) -> {
            System.out.print(count+" ");
            strings.forEach(s -> System.out.print(s + " "));
            System.out.print(strings.stream().count());
            System.out.println();
        });
    }
}
