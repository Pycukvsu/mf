import java.util.Scanner;

public class Ship {

    private static int n;

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Ship.n = n;
    }

    Ship(int n) {
        Ship.n = n;
        addShipOnPole();
    }

    private static void addShipOnPole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите координаты, куда хотите поставить корабль, состоящий из " + n + " клеток");
        String[] slovar = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        int dopSymbol;
        int dopNumber;
        boolean horizont = false;
        boolean vertical = false;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String symbol = String.valueOf(str.charAt(0));

            boolean logic = false;
            int symbolToSlovar = -1;
            while (!logic){
                symbolToSlovar++;
                if (slovar[symbolToSlovar].equals(symbol)){
                    logic = true;
                }
            }

            int number = Integer.parseInt(String.valueOf(str.charAt(1))) - 1;
            if (i == 0) {
                Pole.addShip(symbolToSlovar,  number);
                dopSymbol = symbolToSlovar;
                dopNumber = number;
            }else if (number == ) {

            }
        }
    }
}
