package alg;

import java.util.HashMap;

public class LRU extends Alg{

    public HashMap<Integer, Strona> addresses;
    int size = 0;

    public LRU(int pojemnoscPamieci) {
        super(pojemnoscPamieci);
    }

    @Override
    protected void utworzPamiec(int pojemnosc) {
        addresses = new HashMap<Integer, Strona>();
        size = pojemnosc;
    }

    @Override
    public boolean check(int adresStrony) {
        for(int address : addresses.keySet()){
            if(address == adresStrony){
                this.addresses.get(adresStrony).dostep();
                return true;
            }
        }
        error();
        zastStrony(adresStrony);
        return false;
    }

    @Override
    protected void zastStrony(int address) {
        int theBiggest = Integer.MAX_VALUE;
        int tmpAddr= 0;
        for(int addr : addresses.keySet()){
            if(theBiggest > addresses.get(addr).getOstatnieUzycie()){
                tmpAddr = addr;
                theBiggest = addresses.get(addr).getOstatnieUzycie();
            }
        }
        addresses.remove(tmpAddr);
        addresses.put(address, new Strona());
    }

    public String toString() {
        return "LRU";
    }

}
