package Recursion;

public class test {
    public static int calculateFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static void reverseCount(int number) {
        if (number == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(number);
        reverseCount(number - 1);
    }

    public static int powerOfTwo(int number) {
        if (number == 0) {
            return 1;
        }
        return 2*powerOfTwo(number - 1);
    }

    public static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }


    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
        reverseCount(5);
        System.out.println(powerOfTwo(10));
        System.out.println(fibonacci(7));
    }
}
