package ross.goncharuk;


public class Main {
    public static void main(String[] args) {

        Person Ross = new Person();

        Ross.test("Ross");
        Ross.test("Kate","Smith");
        Ross.test(21);
        Ross.test(22,1234212);
        Ross.test("Ross", 21);
    }
}
