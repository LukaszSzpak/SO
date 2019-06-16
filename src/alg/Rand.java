package alg;

import java.util.Random;

public class Rand extends Alg{

    int [] addresses;
    Random rand = new Random();

    public Rand(int pojemnoscPamieci) {
            super(pojemnoscPamieci);
        }

        @Override
        protected void utworzPamiec(int pojemnosc) {
            addresses = new int[pojemnosc];
        }

        @Override
        public boolean check(int adresStrony) {
            for(int i = 0; i < addresses.length; i++) {
                if (i == adresStrony) {
                    return true;
                }
            }

            error();
            zastStrony(adresStrony);
            return false;
        }

        @Override
        protected void zastStrony(int address) {
            int roll = rand.nextInt(addresses.length);
            addresses[roll] = address;
        }
}
