import Objekti.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> izasliNaIspit = new ArrayList<String>();
        ArrayList<String> polozili = new ArrayList<String>();

        while (true) {
            System.out.println("Unesite ime studenta (ili kraj za prekid):");
            String ime = scanner.nextLine();
            if (ime.equals("kraj")) {
                break;
            };

            System.out.println("Unesite prezime studenta:");
            String prezime = scanner.nextLine();

            System.out.println("Unesite ocenu studenta (5, 6, 7 ili 9):");
            int ocena = scanner.nextInt();
            scanner.nextLine();

            Student noviStudent = new Student(ime, prezime, ocena);
            izasliNaIspit.add(String.valueOf(noviStudent));

            if (ocena > 5) {
                polozili.add(String.valueOf(noviStudent));
            }
        }

        System.out.println("Svi studenti:" + izasliNaIspit);

        System.out.println("Polozili studenti:" + polozili);


    }
}






