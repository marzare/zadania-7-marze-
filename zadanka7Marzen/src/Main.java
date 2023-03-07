import InneKlasy.Kwiaciarnia;
import InneKlasy.Sklep;
public class Main {
    public static void main(String[] args) {

        Sklep klyent = new Sklep("Biedronka", 78, "tak", 1800);
        Kwiaciarnia klyent2 = new Kwiaciarnia("Biedronka", 78, "tak", 1800, 60);

        System.out.println(klyent);
        System.out.println(klyent2);
        klyent.Polki();
        klyent2.Polki();
        System.out.println("Kwota do zapłaty za podaną liczbę miesięcy: " + klyent.Hajs(5));

    }
}