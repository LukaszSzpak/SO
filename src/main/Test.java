package main;

import java.util.ArrayList;
import java.util.Comparator;
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

        this.list = new ArrayList<>();
        this.losujTablice();
        this.list.sort(Integer::compareTo);
    }

    private void losujTablice() {
        Random rand = new Random();

        for (int i = 0; i < this.iloscElementow; i++) {
            this.list.add(rand.nextInt(this.wielkoscPamieci));
            //this.list.add((int)(rand.nextGaussian() * this.wielkoscPamieci/2 + this.wielkoscPamieci/2));
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
