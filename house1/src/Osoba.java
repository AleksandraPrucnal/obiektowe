public class Osoba {
    public String imie;
    private String haslo;
    public void ustawHaslo(String h){
        haslo = h;
    }
    public void pokaz(){
        System.out.println(haslo);
    }
}
