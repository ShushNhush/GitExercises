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
            } else {

                System.out.println(count);
                count++;
            }
        }
    }
}