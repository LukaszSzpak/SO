package alg;

abstract class Alg {
    protected int liczbaError;

    public Alg(int pojemnoscPamieci) {
        this.utworzPamiec(pojemnoscPamieci);
    }

    abstract void utworzPamiec(int pojemnosc);
    abstract boolean check(int adresStrony);

    protected void error() {
        this.liczbaError++;
    }

    public int getLiczbaError() {
        return liczbaError;
    }

}
