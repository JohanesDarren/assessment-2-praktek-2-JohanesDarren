import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        variabel(N);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length);
    }

    public static void variabel(int N) {
        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
