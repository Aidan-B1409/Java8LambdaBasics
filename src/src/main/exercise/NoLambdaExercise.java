package src.main.exercise;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;

public class NoLambdaExercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        //Sort list by last name
        people.sort((o1, o2) -> Collator.getInstance().compare(o1.getLastName(), o2.getLastName()));
        //Create a method that prints all elements in the list
        people.forEach(System.out::println);
        //Create a method that prints all people that have a last name beginning with C
        people.forEach(i -> {
            if(i.getLastName().charAt(0) == 'C'){
                System.out.println(i);
            }
        });
    }
}
