package il.ac.hit.comandlinedemo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("One more change to commit...");
        System.out.println("Here new code comes ...");
        Person firstPerson = new Person("George", "Smith", 199);
        Person secondPerson = new Person("Sam", "Jones", 2005);
        System.out.println("Get person's details :");

        System.out.println("First Person : " + firstPerson.getFirstName() + " " +
                firstPerson.getLastName() + " " + firstPerson.getId());

        System.out.println("Second Person : " + secondPerson.getFirstName() + " " +
                secondPerson.getLastName() + " " + secondPerson.getId());


    }
}
