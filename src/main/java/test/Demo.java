package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();

        ints.stream().map(items-> items++).collect(Collectors.toList());
        System.out.println("hello");



    }
}
