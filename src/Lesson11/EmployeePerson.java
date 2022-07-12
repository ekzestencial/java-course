package Lesson11;

public class Person {
    private int age;
    private String address;


    public Person(int age, String address) {
        System.out.println("Initialize constructor with " + age + " and" + address);
        this.age = age;
        this.address = address;
    }

    protected Person(int age) {
        System.out.println("Initialize constructor with " + age);
        this.age = age;
    }

    public Person() {
    }

    //    public Person() {
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }
}
