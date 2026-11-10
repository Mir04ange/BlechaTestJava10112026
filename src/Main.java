public class Main {

    public static void main(String[] args) {
        System.out.println("1. analyza");
        analyzujNazev("  Kosatka  ");

        System.out.println();
        System.out.println("2. Celkova delka");
        String delka = " 12.5 ";
        String pocet = "3";
        vypocitejCelkovouDelku(delka, pocet);

        System.out.println();
        System.out.println("3. kuk na  velryby");
        vypisPozorovani(" Kosatka ; plejtvak ; ; ORKA ; keporkak ");

        System.out.println();
        System.out.println("4. Identifikace");
        vypisIdentifikacniKod("KOSATKA-2026");
    }

    public static void analyzujNazev(String nazev) {
        if (nazev == null || nazev.trim().isEmpty()) {
            System.out.println("Neplatny nazev");
            return;
        }

        nazev = nazev.trim();

        System.out.println("Prvni z: " + nazev.charAt(0));
        System.out.println("Posledni nak: " + nazev.charAt(nazev.length() - 1));

        int pocetA = 0;




        /**
         *          pocet A a a
            *
         */

        for (int i = 0; i < nazev.length(); i++) {
            char znak = nazev.charAt(i);

            if (znak == 'a' || znak == 'A') {
                pocetA++;
            }
        }

        System.out.println("Pocet pismen a/A: " + pocetA);
    }

    public static void vypocitejCelkovouDelku(String delka, String pocet) {
        delka = delka.trim();

        double delkaVelryby = Double.parseDouble(delka);
        int pocetVelryb = Integer.parseInt(pocet);

        double celkovaDelka = delkaVelryby * pocetVelryb;
        String vysledek = String.valueOf(celkovaDelka);

        System.out.println("Celkova delka velryb: " + vysledek + " m");
    }

    public static void vypisPozorovani(String zaznam) {
        if (zaznam == null || zaznam.trim().isEmpty()) {
            System.out.println("Zadna pozorovani");
            return;
        }

        String[] pozorovani = zaznam.split(";");
        int poradi = 1;
        String nejdelsiNazev = "";

        for (String polozka : pozorovani) {
            String nazev = polozka.trim().toLowerCase();

            if (nazev.isEmpty()) {
                continue;
            }

            System.out.println(poradi + ". " + nazev);
            poradi++;

            if (nazev.length() > nejdelsiNazev.length()) {
                nejdelsiNazev = nazev;
            }
        }

        int celkovyPocet = poradi - 1;

        System.out.println("Celkovy pocet nazvu: " + celkovyPocet);

        if (celkovyPocet > 0) {
            System.out.println("Nejdelsi nazev: " + nejdelsiNazev);
        }
    }

    public static void vypisIdentifikacniKod(String kod) {
      pomlka();
        System.out.println("délka " + kod.length());

        int pomlcka = kod.indexOf('-');

        String nazev = kod.substring(0, pomlcka);
        String rokText = kod.substring(pomlcka + 1);

        int rok = Integer.parseInt(rokText);
        int pocetLet = 2030 - rok;

        System.out.println("Nazev velryby: " + nazev);
        System.out.println("Rok: " + rok);
        System.out.println("Do roku 2030 uplyne let: " + pocetLet);
        pomlka();
    }

    public static  String pomlka(){
        return "-".repeat(125);
    }
}
