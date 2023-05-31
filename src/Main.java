import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mount, day;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hangi Ay (1-12) :");
        mount = inp.nextInt();
        System.out.print("Hangi Gün (1-31) :");
        day = inp.nextInt();

        if (mount == 1) {
            if (day < 22) {
                System.out.println("OĞLAK");
            } else {
                System.out.println("KOVA");
            }
        } else if (mount == 2) {
            if (day <= 19) {
                System.out.println("KOVA");
            } else if ((day >= 20) & (day <= 29)) {
                System.out.println("BALIK");
            } else {
                System.out.println("Şubat ayında 29 gün vardır.");
            }
        } else if (mount == 3) {
            if (day <= 20) {
                System.out.println("BALIK");
            } else if ((day >= 21) & (day <= 31)) {
                System.out.println("KOÇ");
            } else {
                System.out.println("Mart ayında 31 gün vardır.");
            }
        } else if (mount == 4) {
            if (day <= 20) {
                System.out.println("KOÇ");
            } else if ((day >= 21) & (day <= 30)) {
                System.out.println("BOĞA");
            } else {
                System.out.println("Nisan ayında 30 gün vardır.");
            }
        } else if (mount == 5) {
            if (day <= 21) {
                System.out.println("BOĞA");
            } else if ((day >= 22) & (day <= 31)) {
                System.out.println("İKİZLER");
            } else {
                System.out.println("Mayıs ayında 31 gün vardır.");
            }
        }else if (mount == 6) {
            if (day <= 22) {
                System.out.println("İKİZLER");
            } else if ((day >= 23) & (day <= 30)) {
                System.out.println("YENGEÇ");
            } else {
                System.out.println("Haziran ayında 30 gün vardır.");
            }
        }else if (mount == 7) {
            if (day <= 22) {
                System.out.println("YENGEÇ");
            } else if ((day >= 23) & (day <= 31)) {
                System.out.println("ASLAN");
            } else {
                System.out.println("Temmuz ayında 31 gün vardır.");
            }
        }else if (mount == 8) {
            if (day <= 22) {
                System.out.println("ASLAN");
            } else if ((day >= 23) & (day <= 31)) {
                System.out.println("BAŞAK");
            } else {
                System.out.println("Ağustos ayında 31 gün vardır.");
            }
        }else if (mount == 9) {
            if (day <= 22) {
                System.out.println("BAŞAK");
            } else if ((day >= 23) & (day <= 30)) {
                System.out.println("TERAZİ");
            } else {
                System.out.println("Eylül ayında 30 gün vardır.");
            }
        }else if (mount == 10) {
            if (day <= 22) {
                System.out.println("TERAZİ");
            } else if ((day >= 23) & (day <= 31)) {
                System.out.println("AKREP");
            } else {
                System.out.println("Ekim ayında 31 gün vardır.");
            }
        }else if (mount == 11) {
            if (day <= 21) {
                System.out.println("AKREP");
            } else if ((day >= 22) & (day <= 30)) {
                System.out.println("YAY");
            } else {
                System.out.println("Kasım ayında 30 gün vardır.");
            }
        }else if (mount == 12) {
            if (day <= 22) {
                System.out.println("YAY");
            } else if ((day >= 23) & (day <= 31)) {
                System.out.println("OĞLAK");
            } else {
                System.out.println("Aralık ayında 31 gün vardır.");
            }
        }
    }
}