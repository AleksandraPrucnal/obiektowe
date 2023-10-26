import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int liczba = random.nextInt();
        minmax();
        StringBuilder sb = new StringBuilder("ble ble bla");
        }

    public static void gaussiand(){
        Random random = new Random();
        double liczba2 = random.nextDouble();
    }

    public static void piramida(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak: ");
        String znak = scanner.next();
        System.out.println("Podaj wysokosc piramidy: ");
        int wysokosc = scanner.nextInt();

        for(int i = 0; i < wysokosc; i++){
            int liczbaspacji = wysokosc - i - 1;
            int iloscznakow = 2 * i + 1;
            StringBuilder sb = new StringBuilder();
            while(liczbaspacji-- > 0){
                sb.append(' ');
            }
            while(iloscznakow-->0){
                sb.append(znak);
            }
            System.out.println(sb.toString());
        }
    }

    public static void srednia(){
        Random random = new Random();
        int[] tab = new int[20];
        int suma = 0;
        for(int i = 0; i < 20; i++){
            tab[i] = random.nextInt(100);
            suma += tab[i];
        }
        double srednia = (double)suma / 20;
        System.out.println(srednia);
    }

    public static void wyswietlOdwrotnie(){
        Random random = new Random();
        int[] tab = new int[10];
        for(int i = 0; i < 10; i++){
            tab[i] = random.nextInt();
        }
        for(int i = 9; i>=0; i--){
            System.out.println(tab[i]);
        }
    }

    public static void minmax(){
        Random random = new Random();
        int[] tab = new int[15];
        for(int i = 0; i < 15; i++){
            tab[i] = random.nextInt(20);
            System.out.println(tab[i]);
        }
        int min = tab[0];
        int max = tab[0];
        for(int i = 1; i < 15; i++){
            if(tab[i] > max){
                max = tab[i];
            }
            if(tab[i] < min){
                min = tab[i];
            }
        }
        System.out.println("min = "+ min + "\nmax = " + max);
    }

    public static void reverseString(StringBuilder sb){
        sb.reverse();
        System.out.println("odwrocony tekst: " + sb);
    }


}