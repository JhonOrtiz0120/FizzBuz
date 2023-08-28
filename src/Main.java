public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Fizz Buzz game...!");
        String result = "";

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            } else {
                result = "no divisible";
            }

            System.out.println(i+" Is "+result);
        }

        System.out.println("Game over!!");
    }
}