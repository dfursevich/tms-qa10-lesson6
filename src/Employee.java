public class Employee extends Person {
    private String job;

    public Employee() {
    }

    public Employee(String name, int age, String phone, String job) {
        super(name, age, phone);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("job = " + job);
    }
}
