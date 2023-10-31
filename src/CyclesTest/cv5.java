package CyclesTest;

import java.util.Scanner;

public class cv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej číslo: ");
        int num = sc.nextInt();
        int num2 = 1;
        for (int i = 0; i < num; i++) { //řádek
            for (int j = num2; j < num+num2; j++) {  //číslo
                System.out.print(j+"\t");
            }
            System.out.println();
            num2 = num2 + num;

            // 1.Čtěte vstupy (celá čísla) od uživatele. Načítání vstupů uživatel ukončí zadáním čísla -1.
            // Jakmile cyklus doběhne, vypište součet všech zadaných čísel. (Můžete předpokládat, že uživatel
            // bude zadávat pouze a jedině čísla)
            //
            // 2.Pomocí cyklů vypočtěte faktoriál čísla. a.Použijte stejný
            // mechanismus na vypočtení n-té mocniny čísla (Ano, jde to pomocí Math.pow(), ta ale je neefekƟvní
            // a zároveň se jedná o jednoduchou metodu)
            //
            // 3.Napište Ɵpovací hru: a.Vygenerujte náhodné
            // číslo od 1 do 100. b.Od uživatele budete číst Ɵpy (celá čísla). c.Dle Ɵpu od uživatele vypíšete,
            // jestli zadal číslo moc malé nebo číslo moc velké. d.Pokud uživatel Ɵpl správné číslo, ukončete program.
            //
            // 4.Vygenerujte 100000x náhodné číslo od 1 do 100. Vypište, kolikrát padlo číslo 42.
            //
            // 5.Vypište matici (‚tabulku‘) nxn celých čísel od 1 do n2.
            // Př: n = 3, vypíšu 3 x 3 hodnoty od 1 do 9, tj.:
            //
            // 1    2    3
            // 4    5    6
            // 7    8    9
            //
            // možná se bude hodit, co je Math.sqrt()...
        }
    }
}
