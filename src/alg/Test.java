package alg;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    private int iloscElementow;
    private int wielkoscRam;
    private int wielkoscPamieci;
    private ArrayList<Integer> list;

    public Test(int iloscElementow, int wielkoscRam, int wielkoscPamieci) {
        this.iloscElementow = iloscElementow;
        this.wielkoscRam = wielkoscRam;
        this.wielkoscPamieci = wielkoscPamieci;

        this.losujTablice();
    }

    private void losujTablice() {
        Random rand = new Random();

        for (int i = 0; i < this.iloscElementow; i++) {
            this.list.add(rand.nextInt(this.wielkoscPamieci));
        }
    }

    public int getWielkoscPamieci() {
        return wielkoscPamieci;
    }

    public int getWielkoscRam() {
        return wielkoscRam;
    }

    public int getIloscElementow() {
        return iloscElementow;
    }

    public ArrayList<Integer> getList() {
        return list;
    }
}
