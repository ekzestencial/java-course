package Lesson4;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(bmi(100, 1.98f));
    }

    public static String bmi(float weight, float height) {
        float bmi = weight / (height * height);

        if (bmi <= 18.5) {
            return "Underweight";
        }
        if (bmi <= 25) {
            return "Normal";
        }
        if (bmi <= 30) {
            return "Overweight";
        }
        if (bmi > 30) {
            return "Obese";
        }

        return "Unknown";
    }
}
