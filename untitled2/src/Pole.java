public class Pole {

    private static final String[][] pole = new String[10][10];

    public static void addShip(int a, int number){
        String[] slovar = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        pole[number][a] = "1";
        printPole();

    }

    public static void printPole(){
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                if (pole[i][j] == null){
                    System.out.print(" 0");
                }else {
                    System.out.print(" " + pole[i][j]);
                }
            }
            System.out.println();
        }
    }
}
