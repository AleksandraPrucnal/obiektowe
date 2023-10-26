// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Ksiazka k1 = new Ksiazka();
//        System.out.println(k1.tytul);
//        Ksiazka k2 = new Ksiazka("Big Gatsby",
//                "FSJ",
//                1585);
//        System.out.println(k2.autor);
//
//        Samochod s1 = new Samochod("Citroen", "C2");
//        System.out.println(s1.rokProdukcji);
//        Samochod s2 = new Samochod("Ford", "Focus", 2004);

        Osoba o1 = new Osoba("Ola", "Alo");
//        System.out.println(o1.wiek);

//        Kwadrat kwadrat = new Kwadrat();
//        System.out.println(kwadrat.bok);

        Osoba o2 = new Osoba("Aleksandra","Ale");
        System.out.println(Osoba.licznik);
//        System.out.println(o1.licznik);
//      statyczne elementy wywolujemy z klasy (tu Osoba), nie z obiektu (tu o1 lub o2)

        System.out.println(Matematyka.PI);

        System.out.println(Kalkulator.dodawanie(2,7));
    }
}