public class Osoba {
    public String imie;
    public String nazwisko;
    public int wiek;
    public static int licznik;

    public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        licznik +=1;
    }
    public Osoba(String imie, String nazwisko){
        this(imie,nazwisko, 0);
    }
}
