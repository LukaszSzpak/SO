package alg;

import main.Main;

public class Strona {
    private int ostatnieUzycie;

    public Strona() {
        this.ostatnieUzycie = Main.getCzas();
    }
    public void dostep() {
        this.ostatnieUzycie = Main.getCzas();
    }

    public int getOstatnieUzycie() {
        return ostatnieUzycie;
    }
}
