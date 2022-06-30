package Module3;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

int a=125344343; //1 byte =>> 4 byte

byte b = (byte) a; // 4 bytes >> 1 byte

        Integer c = 5;

        System.out.println("Hello world");
        {

        }

        System.out.println(b);

        String str4 = new String("Hello world");
        String str5 = new String("Hello world");

//        System.out.println(str4.toUpperCase());
//        System.out.println(str4.indexOf(1));
//        System.out.println(str4.replace("H","A"));
        System.out.println(str4.join("\n\n\n\n",str4,str5));

        String str6 = "Hello world";
        Person person = new Person();
        person.create();

//        person.destruct()




//        4.65f
//        Integer b = Integer.parseInt("12"); //позволяет "считать" число из строки

    }

    private static void test1(int a) {
//        System.out.println(a);

    }

    private static void test2() {
    }
}
