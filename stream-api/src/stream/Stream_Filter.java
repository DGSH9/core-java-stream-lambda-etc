package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Filter {
    public static void main(String[] args) {

        //Create list and filter all even numbers

        //method1 add not works
        List<Integer> list1 = List.of(2,5,34,67,8,6,90);

        //method2
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);
        list2.add(76);

        //method3
        List<Integer> list3 = Arrays.asList(23,456,32,456,677);


        //without stream
        List<Integer> listEven = new ArrayList<>();
        for(Integer i:list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        //using stream
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList = stream.filter(e->e%2==0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList = list1.stream().filter(l->l>50).collect(Collectors.toList());
        System.out.println(newList);







    }
}
