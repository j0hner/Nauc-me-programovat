public class Kino {

    public static void main(String[] args) {

        // -------------------------
        // NULTÝ ÚKOL
        // -------------------------
        // Vytvoření dvourozměrného pole
        int[][] pole = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Výpis hodnot 3 7 6 1
        System.out.println(pole[0][2] + " " + pole[2][0] + " " + pole[1][2] + " " + pole[0][0]);

        // Výpis celého pole řádek po řádku
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(pole[i][j] + " ");
            }
        }
        System.out.println(); // nový řádek

        // -------------------------
        // PRVNÍ ÚKOL
        // -------------------------
        // Vytvoření 5x5 pole pro sedadla
        int[][] sedadla = new int[5][5];
        int cislo = 1;
        for (int i = 0; i < sedadla.length; i++) {
            for (int j = 0; j < sedadla[i].length; j++) {
                sedadla[i][j] = cislo;
                cislo++;
            }
        }

        // -------------------------
        // DRUHÝ ÚKOL
        // -------------------------
        // Pole boolean pro obsazenost
        boolean[][] obsazeno = new boolean[5][5];

        // Označíme sedadla dělitelná 3 jako obsazená
        for (int i = 0; i < sedadla.length; i++) {
            for (int j = 0; j < sedadla[i].length; j++) {
                if (sedadla[i][j] % 3 == 0) {
                    obsazeno[i][j] = true;
                }
            }
        }

        // -------------------------
        // TŘETÍ ÚKOL
        // -------------------------
        // Pole obsazenosti pro daný den
        boolean[][] denniObsazenost = {
            { true,  true,  false, false, true  },
            { false, true,  true,  false, false },
            { true,  true,  false, false, false },
            { false, true,  false, true,  true  },
            { false, false, false, false, false }
        };

        // Spočítání obsazených sedadel
        int pocetObsazenych = 0;
        for (int i = 0; i < denniObsazenost.length; i++) {
            for (int j = 0; j < denniObsazenost[i].length; j++) {
                if (denniObsazenost[i][j]) {
                    pocetObsazenych++;
                }
            }
        }
        System.out.println("Obsazených sedadel: " + pocetObsazenych);

        // -------------------------
        // ČTVRTÝ ÚKOL
        // -------------------------
        // Hledání nejméně obsazené řady
        int nejmensiObsazenost = Integer.MAX_VALUE;
        int indexNejmeneObsazeneRady = -1;

        for (int i = 0; i < denniObsazenost.length; i++) {
            int pocetVRadku = 0;
            for (int j = 0; j < denniObsazenost[i].length; j++) {
                if (denniObsazenost[i][j]) {
                    pocetVRadku++;
                }
            }
            if (pocetVRadku < nejmensiObsazenost) {
                nejmensiObsazenost = pocetVRadku;
                indexNejmeneObsazeneRady = i;
            }
        }

        System.out.println("Řada s nejméně obsazenými sedadly má index: " + indexNejmeneObsazeneRady);
    }
}
