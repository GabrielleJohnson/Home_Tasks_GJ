public class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName = p1.name;
        p1.name = p2.name;
        p2.name = tempName;

        int tempAge = p1.age;
        p1.age = p2.age;
        p2.age = tempAge;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Gabrielle";
        person1.age = 18;

        Person person2 = new Person();
        person2.name = "Haley";
        person2.age = 24;

        //prints name and age before change
        System.out.println("Person 1: "+ person1.name);
        System.out.println(person1.age);

        System.out.println("Person 2: "+ person2.name);
        System.out.println(person2.age + "\n");

        MakingChanges.changeIdentities(person1 , person2);

        //prints name and age after change
        System.out.println("Person 1: "+ person1.name);
        System.out.println(person1.age);

        System.out.println("Person 2: "+ person2.name);
        System.out.println(person2.age);
    }

}


