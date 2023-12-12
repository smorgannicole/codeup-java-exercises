import java.lang.reflect.Array;

public class ArraysExercises {

//    public int addTwo(int x){
//        System.out.println(x + 2);
//        return x + 2;
//    }


    public static Person[] addPerson(Person[] persons, Person person) {
        int personLength = persons.length;
        Person[] newArr = new Person[personLength + 1];
        for (int i = 0; i < personLength; i++) {
            newArr[i] = persons[i];
        }
        newArr[personLength] = person;
        String[] personsNames = {newArr[0].getName(), newArr[1].getName(), newArr[2].getName(), newArr[3].getName()};
        for (String name : personsNames) {
            System.out.println(name);
        }
        return persons;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int n : numbers) {
//            System.out.println(n);
//        }

    Person person1 = new Person("Name1");
    Person person2 = new Person("Name2");
    Person person3 = new Person("Name3");
    Person person4 = new Person("Name4");
    Person[] persons = {person1, person2, person3};
    Person[] newPersonArray = ArraysExercises.addPerson(persons, person4);

//        String[] personsNames = {person1.getName(), person2.getName(), person3.getName()};
//        for (String name : personsNames) {
//            System.out.println(name);
//        }

//            ArraysExercises instance = new ArraysExercises();
//            instance.addTwo(3);



    }

}
