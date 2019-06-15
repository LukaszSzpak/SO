package src.alg;

public abstract class Alg {
    protected int liczbaError;

    public Alg(int pojemnoscPamieci) {
        this.utworzPamiec(pojemnoscPamieci);
    }

    protected abstract void utworzPamiec(int pojemnosc);
    public abstract boolean check(int adresStrony);

    protected void error() {
        this.liczbaError++;
    }

    public int getLiczbaError() {
        return liczbaError;
    }

    protected abstract void zastStrony(int address);

}
