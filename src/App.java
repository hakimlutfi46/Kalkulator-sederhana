import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int operator, num1, num2;
        String ulang = "y";

        while (ulang.equals("y")) {
            System.out.println("Selmat datang di program Kalkulator Sederhana Java");
            System.out.println("");

            System.out.print("Masukkan angka pertama : ");
            num1 = sc.nextInt();

            System.out.print("Masukkan angka keuda : ");
            num2 = sc.nextInt();

            System.out.println();

            System.out.println("Pilih operator yang ingin anda gunakan");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus (sisa bagi)");
            operator = sc.nextInt();

            System.out.println("======================");

            switch (operator) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + penjumlahan(num1, num2));
                    break;

                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + pengurangan(num1, num2));
                    break;

                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + perkalian(num1, num2));
                    break;

                case 4:
                    double hasil = pembagian(num1, num2);

                    if (hasil % 2 == 1 || hasil % 2 == 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (int) hasil);
                    } else {
                        System.out.println(num1 + " / " + num2 + " = " + hasil);
                    }
                    break;

                case 5:
                    System.out.println(num1 + " % " + num2 + " = " + modulus(num1, num2));
                    break;

                default:
                    System.out.println("Perintah yang anda masukkan salah");
                    break;
            }

            System.out.println("Apakah anda ingin melakukakannya lagi? (y/t)");
            ulang = sc.next();
        }

    }

    static int penjumlahan(int a, int b) {
        int c = a + b;
        return c;
    }

    static int pengurangan(int a, int b) {
        int c = a - b;
        return c;
    }

    static int perkalian(int a, int b) {
        int c = a * b;
        return c;
    }

    static double pembagian(double a, double b) {
        double c = a / b;
        return c;
    }

    static int modulus(int a, int b) {
        int c = a % b;
        return c;
    }
}
