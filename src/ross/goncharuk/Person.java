package ross.goncharuk;


public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void test(String firstName){
        String lastName = "Ivanov";
        int age = 10;
        String gender = "male";
        int phoneNumber = 123123;
        System.out.println(firstName+" "+lastName+" "+age+" "+gender+" "+phoneNumber);
    }
    public void test(String firstName, String lastName){
        int age = 20;
        String gender = "female";
        int phoneNumber = 321321;
        System.out.println(firstName+" "+lastName+" "+age+" "+gender+" "+phoneNumber);
    }
    public void test(int age){
        String firstName = "Oleg";
        String lastName = "Babaev";
        String gender = "male";
        int phoneNumber = 123123123;
        System.out.println(firstName+" "+lastName+" "+age+" "+gender+" "+phoneNumber);
    }
    public void test(int age, int phoneNumber){
        String firstName = "Frodo";
        String lastName = "Baggins";
        String gender = "male";
        System.out.println(firstName+" "+lastName+" "+age+" "+gender+" "+phoneNumber);
    }
    public void test(String firstName, int age){
        String lastName = "Whatever";
        String gender = "female";
        int phoneNumber = 123456789;
        System.out.println(firstName+" "+lastName+" "+age+" "+gender+" "+phoneNumber);
    }
}
