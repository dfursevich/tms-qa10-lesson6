public class Accountant extends Employee {
    private boolean head;

    public Accountant(String name, int age, String phone, String job, boolean head) {
        super(name, age, phone, job);
        this.head = head;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public void print() {
        super.print();
        System.out.println("head = " + head);
    }


}
