public class Pole {

    private static final String[][] pole = new String[10][10];

    public static void addShip(int a, int number) {
        String[] slovar = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        pole[number][a] = "1";
        printPole();

    }

    public static void printPole() {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                if (pole[i][j] == null) {
                    System.out.print(" 0");
                } else {
                    System.out.print(" " + pole[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static boolean isRoundShip(int a, int number) {           //number индекс строки(массива) | a индекс элемента в строке 
        boolean logic = false;
        if (number == 0 && a == 0) {
            if (pole[0][1] == null && pole[1][0] == null && pole[1][1] == null) {
                logic = true;
            }
        } else if (number == 9 && a == 0) {
            if (pole[8][0] == null && pole[8][1] == null && pole[9][1] == null) {
                logic = true;
            }
        } else if (number == 0 && a == 9) {
            if (pole[0][8] == null && pole[1][8] == null && pole[1][9] == null) {
                logic = true;
            }
        } else if (number == 9 && a == 9) {
            if (pole[9][8] == null && pole[8][8] == null && pole[8][9] == null) {
                logic = true;
            }
        } else if (number == 0) {
            if (pole[0][a - 1] == null && pole[0][a + 1] == null && pole[1][a - 1] == null && pole[1][a] == null && pole[1][a + 1] == null) {
                logic = true;
            }
        } else if (a == 0) {
            if (pole[number + 1][0] == null && pole[number - 1][0] == null && pole[number + 1][1] == null && pole[number][1] == null && pole[number - 1][1] == null) {
                logic = true;
            }
        } else if (number == 9) {
            if (pole[9][a - 1] == null && pole[9][a + 1] == null && pole[8][a - 1] == null && pole[8][a] == null && pole[8][a + 1] == null) {
                logic = true;
            }
        } else if (a == 9) {
            if (pole[number + 1][9] == null && pole[number - 1] == null && pole[number + 1][8] == null) {
                logic = true;
            }
        }
        return logic;
    }
}

