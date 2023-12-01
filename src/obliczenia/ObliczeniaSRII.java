package obliczenia;
import java.io.*;
public class ObliczeniaSRII {

    public static void main(String[] args)
        throws IOException
    {
        float a, b, wynik;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj liczbę a: ");
        a = Float.parseFloat(br.readLine());
        System.out.println("Podaj liczbę b: ");
        b = Float.parseFloat(br.readLine());

        //wynik ma być podany do 2 miejsc po przecinku

        wynik = a+b;
        System.out.printf("Suma liczb a i b wynosi: %2.2f.\n", wynik);

        wynik = a-b;
        System.out.printf("Roznica liczb a i b wynosi: %2.2f.\n", wynik);

        wynik = a/b;
        System.out.printf("Iloraz liczb a i b wynosi: %2.2f.\n", wynik);

        wynik = a*b;
        System.out.printf("Iloczyn liczb a i b wynosi: %2.2f.\n", wynik);

    }
}
