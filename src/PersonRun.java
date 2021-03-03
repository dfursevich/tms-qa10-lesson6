public class PersonRun {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 20, "+37522");
        Employee sam = new Employee("Sam", 30, "+37522", "ingeneer");
        Accountant ann = new Accountant("Ann", 40, "+37533", "accountant", true);

        alex.print();
        System.out.println();
        sam.print();
        System.out.println();
        ann.print();
    }
}
