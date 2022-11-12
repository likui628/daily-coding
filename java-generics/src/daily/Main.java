package daily;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main<T> {

    public static void main(String[] args) {

        System.out.printf("Max of %d, %d and %d is %d\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        List<Cat> animals = List.of(new Cat("c1"), new Cat("c2"));
        List<Bird> birds = List.of(new Bird("b1"), new Bird("b2"));
        printAllAnimal(animals);
        printAllAnimal(birds);

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1,2,3,4,5,6));
        consumer(numbers,7);
        producer(numbers);
    }

    // Multiple Bounds
    public static <T extends Number & Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    // Wildcards
    public static void printAllAnimal(List<? extends Animal> animals) {
        animals.forEach(System.out::println);
    }

    // PECS Producer Extends，Consumer Super
    // Use an extends wildcard when you only get values out of a structure.
    // Use a super wildcard when you only put values into a structure.
    public static <T> void producer(Collection<? extends T> collections) {
        collections.forEach(System.out::println);
    }

    public static <T> void consumer(Collection<? super T> collections, T t) {
        collections.add(t);
    }
}

interface Animal {
}

class Cat implements Animal {
    private final String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + this.name + " can run";
    }
}

class Bird implements Animal {
    private final String name;

    Bird(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird " + this.name + " can fly";
    }
}