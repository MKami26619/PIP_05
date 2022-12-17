import java.util.Scanner;
// Zadanie wymaga wprowadzenia konkretnej liczby = 5; dla poszerzenia funkcjonalnosci, uzylem funkcji skaner
class ZAD_3 {
    public static void print(int n) {
        if (n % 2 == 0) {
            n--;
        }

        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadz dowolna liczbe calkowita: ");
        int n = scanner.nextInt();

        print(n);
    }
}