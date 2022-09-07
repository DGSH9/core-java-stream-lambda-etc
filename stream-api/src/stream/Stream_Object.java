package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Object {
    public static void main(String[] args) {
        //Stream API - collection process
        //collection //group of object


        //method1 blank stream
        Stream<Object> stream1 = Stream.empty();
        stream1.forEach(e->{
            System.out.println(e);
        });


        //method2 - array,object,collection
        String list1[] = {"Durgesh","Neero","Mohan","Ramesh"};
        Stream<String> stream2 = Stream.of(list1);
        stream2.forEach(e->{
            System.out.println(e);
        });


        //method3
        Stream<Object> stream3 = Stream.builder().build();

        //method4 - list,set
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(66);
        list2.add(77);
        list2.add(88);

        Stream<Integer> stream4 =list2.stream();
        stream4.forEach(e->{
            System.out.println(e);
        });









    }
}
