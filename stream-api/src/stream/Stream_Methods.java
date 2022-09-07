package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_Methods {
    public static void main(String[] args) {
        //filter(Predicate)--->
        // bollean value function
        // e -> true



        //map(function)
        //each element operation
        List<String> names = List.of("Durgesh","ganesh","Ramesh","Dipu","Dinesh");
        List<String> obj1Names = names.stream().filter(e->e.startsWith("D")).collect(Collectors.toList());
        System.out.println(obj1Names);

        //map
        List<Integer> numbers = List.of(2,4,2,4,6);
        List<Integer> objNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(objNumbers);

        //sorted
        numbers.stream().sorted().forEach(System.out::println);

        //min
        System.out.println("SPace==============================>");
        Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(integer);

        //max
        Integer integer1 = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(integer1);



    }
}
