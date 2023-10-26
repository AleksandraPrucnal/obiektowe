// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        House domStefana = new House();
        domStefana.area = 150;
        domStefana.floors = 2;
        domStefana.garden= false;
        domStefana.garage = true;
        domStefana.rooms = 6;
        System.out.println(domStefana.getPrice());

        House domSylwii = new House();
        domSylwii.rooms = 4;
        domSylwii.area = 175;
        domSylwii.floors = 2;
        domSylwii.garden = true;
        domSylwii.garage = false;
        System.out.println(domSylwii.getPrice());

        Dog piesRafi = new Dog();
        piesRafi.name = "Rafi";
        piesRafi.breed = "sznaucer";
        piesRafi.age = 11;
        piesRafi.bark();

        BankAccount kontoOli = new BankAccount();
        kontoOli.balance = 1000.50;
        System.out.println(kontoOli.deposit(300.00));
        System.out.println(kontoOli.withdraw(200.00));

        Time time = new Time();
        time.hours = 20;
        time.minutes = 30;
        Time time2 = new Time();
        time2.hours = 11;
        time2.minutes = 10;
        Time time3 = time.addTime(time2);
        System.out.printf("hours: %d\nminutes: %d\n", time3.hours, time3.minutes);

        Car samochod = new Car();
        samochod.brand = null;
        System.out.println(samochod.brand);

        Osoba ja = new Osoba();
        ja.imie = "Ola";
        ja.ustawHaslo("bla");
        ja.pokaz();

        Rodzic rodzic = new Rodzic();
        rodzic.imie = "Adam";
        Dziecko dziecko = new Dziecko();
        dziecko.wezImieRodzica(rodzic);
        System.out.println(dziecko.imie_rodzica);

        Licznik licznik = new Licznik();
        licznik.liczba = 5;
        int liczba = 2;
        System.out.println(licznik.zwieksz(liczba));
        Licznik licznik2 = new Licznik();
        licznik2.liczba = 3;
        System.out.println(licznik.dodaj(licznik2));

        Zmieniacz zmieniacz = new Zmieniacz();

    }
}