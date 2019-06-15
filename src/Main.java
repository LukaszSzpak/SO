import alg.Alg;
import alg.FIFO;

import java.util.ArrayList;

public class Main {

    private static int czas = 0;

    public static int getCzas() {
        return Main.czas;
    }

    public static void main(String[] args) {

        Test test = new Test(1000, 20, 50);

        ArrayList<Alg> algArrayList = new ArrayList<>();
        algArrayList.add(new FIFO(test.getWielkoscRam()));


        for (Alg alg: algArrayList) {
            Main.czas = 0;
            for (Integer number: test.getList()) {
                alg.check(number);
            }

            System.out.println("Ilosc elem:" + test.getIloscElementow() +
                    " Ilosc RAM: " + test.getWielkoscRam() +
                    " Ilosc Pamieci: " + test.getWielkoscPamieci() +
                    " Algorytm: " + alg.toString() +
                    " Ilosc error: " + alg.getLiczbaError());
        }

    }
}
