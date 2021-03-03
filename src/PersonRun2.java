public class PersonRun2 {
    public static void main(String[] args) {
        Person sam = new Employee("Sam", 30, "+37522", "ingeneer");

        sam.print();
    }

    public static void doSomething(Person person) {
        person.print();
    }
}
