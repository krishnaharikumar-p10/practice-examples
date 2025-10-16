package modifiers;

import java.util.*;

class Data {
    String name;
    int age;

    Data(String name, int age) {
        this.name = name;
        this.age = age;
    }
  

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }
}

public class SortComparator {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Mike", 22));
        list.add(new Data("Taylor", 20));
        list.add(new Data("Alex", 25));

        System.out.println("Before sorting:");
        for (Data d : list) {
            System.out.println(d);
        }
        
        Comparator<Data> comp1 = new Comparator<Data>() {
            @Override
            public int compare(Data d1, Data d2) {
                return (d1.age % 10) - (d2.age % 10);
            }
        };
        
        Comparator<Data> comp2 = new Comparator<Data>() {
            @Override
            public int compare(Data d1, Data d2) {
                return d1.name.compareTo(d2.name);
            }
        };

        Collections.sort(list, comp1);

        System.out.println("\n Sorting by last digit of age:");
        for (Data d : list) {
            System.out.println(d);
        }
        Collections.sort(list, comp2);

        System.out.println("\nSorting by name:");
        for (Data d : list) {
            System.out.println(d);
        }
    }
}
