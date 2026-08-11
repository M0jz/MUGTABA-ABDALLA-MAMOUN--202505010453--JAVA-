public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Mujtaba", "001");
        Person p2 = new Student("Mujtaba", "002");
        Person p3 = new Lecturer("Mujtaba", "003");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}