public class Main {
    public static void main(String[] args) {


        counter();


    }

    public static void counter() {

        int count = 0;

        while (count <= 100) {

            if (count % 3 + count % 5 == 0) {

                System.out.println("FizzBuzz");

                count++;
            }

            if (count % 3 == 0) {
                System.out.println("Fizz");
                count++;
            }
            if (count % 5 == 0) {

                System.out.println("Buzz");

            }
          else {

                System.out.println(count);

            }
            count++;
        }
    }
}