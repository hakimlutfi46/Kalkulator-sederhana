import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selmat datang di program Kalkulator Sederhana Java");
        System.out.println("");

        int operator, num1, num2;

        System.out.println("Masukkan angka pertama : ");
        num1 = sc.nextInt();

        System.out.println("Masukkan angka keuda");
        num2 = sc.nextInt();

        System.out.println();

        System.out.println("Pilih operator yang ingin anda gunakan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        operator = sc.nextInt();

        System.out.println("======================");

        switch (operator) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + penjumlahan(num1, num2));
                break;

            case 2:
                System.out.println(num1 + " + " + num2 + " = " + pengurangan(num1, num2));
                break;

            case 3:
                System.out.println(num1 + " + " + num2 + " = " + perkalian(num1, num2));
                break;

            case 4:

                double hasil = pembagian(num1, num2);

                if (hasil % 2 == 1) {
                    System.out.println(num1 + " + " + num2 + " = " + (int) hasil);
                } else {
                    System.out.println(num1 + " + " + num2 + " = " + hasil);
                }
                break;

            default:
                System.out.println("Perintah yang anda masukkan salah");
                break;
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
}
