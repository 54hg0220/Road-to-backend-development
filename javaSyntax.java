import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class javaSyntax {
    // write your comment
    public static void main(String[] args) {
        //some variables
//        double number = 100.01;
        int number2 = 1;
        String brand = "s";
        byte theByte = -128;
        short theShort = 8989;
        int theInt = 654646465;
        long theLong = 2655646652222222L;
        float pi = 3.1415926f;
        double doublePi = 3.1415926;
        // this has to be single quote
        char a = 'a';
        LocalDate now = LocalDate.now();

        String name = new String("Guan "+now);

        // What is the difference between primitives and reference types
        int aa = 10;
        int bb = a ;
        aa = 100;
        // bb is a copy of aa, so if we change aa, the b lives in a different memory address

        Person alex = new Person("alex");
        Person guan = alex;
        // with reference types, it is a bit different of how these objects are stored in the memory.
        // for person guan, instead of poiting to address of alex, its pointing to the address of the object.
        // if alex changed, then guan will also be changed

        // Ternary operator

        int age = 15;
        String message = age>=18?
                "I am adult": "I am not adult";

        // Using switch on performing an if condition only have one value, it is neater

        int [] numbers = {1,2};
        String [] names = {"Anna","Ali","Bob","Guan"};
        //enhanced for loop
        for (int number : numbers){
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }
        Arrays.stream(numbers).forEach(System.out::println);

        // break and continue
        for (String any:names){
            if(any.startsWith("A")){
//                break;
                continue;
            }
            System.out.println(any);
        }

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String user = scanner.nextLine();
        System.out.println("Hello "+user);

        Lens lensOne = new Lens("sony","85mm",true);
        Lens lensTwo = new Lens("canon","70mm",true);
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
//        System.out.println(name);
    }
    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime
             ){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

    }
    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }
    }
}