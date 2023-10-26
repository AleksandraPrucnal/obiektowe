public class Licznik {
    public int liczba;
    public int zwieksz(int parametr){
        return liczba += parametr;
    }
    public int dodaj(Licznik otherLicznik){
        return this.liczba += otherLicznik.liczba;
    }
}
