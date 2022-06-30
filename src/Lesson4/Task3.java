package Lesson4;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(calculateHydrate(6.7f));
    }

    public static int calculateHydrate(float time) {
        return (int) (Math.floor (time)*0.5);

    }
}
