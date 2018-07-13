package instanceOf;

public class Main {
    public static void main(String[] args) {

        Person [] person = new Person[18];
        person[0] = new Worker("Szymon" , "Derulo", 7000);
        person[1] = new Student("Jacek" , "Nowak" ,"Math");

        for (Person persons : person) {
            if (persons instanceof Person) {
                persons.getDescription();
                System.out.println();
            } else {
                break;
            }
        }

    }

}

abstract class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    abstract void getDescription();

}

class Worker extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public Worker(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }


    @Override
    void getDescription() {
        System.out.println("I am a worker.");
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Salary: " + getSalary());
    }

}

class Student extends Person {
   private String directionOfStudy;

    public String getDirectionOfStudy() {
        return directionOfStudy;
    }

    public Student(String firstName, String lastName, String directionOfStudy) {
        super(firstName, lastName);
        this.directionOfStudy = directionOfStudy;
    }

    @Override
    void getDescription() {
        System.out.println("I am a student.");
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Direction of study: " + getDirectionOfStudy());
    }
}

class Zombie {

}