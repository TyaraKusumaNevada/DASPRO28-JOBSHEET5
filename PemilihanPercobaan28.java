import java.util.Scanner;

public class PemilihanPercobaan28 {

    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.println("masukkan angka: ");
        int angka = input28.nextInt();

        if (angka % 2 == 0)
        System.out.println("Angka "+angka+" bilangan genap");
        else
        System.out.println("Angka "+angka+" bilangan ganjil");
    }
}