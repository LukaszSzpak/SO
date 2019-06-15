package alg;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO extends Alg{

    public Queue<Integer> addresses;
    int size;

    public FIFO(int pojemnoscPamieci) {
        super(pojemnoscPamieci);
        this.size = pojemnoscPamieci;
    }

    @Override
    protected void utworzPamiec(int pojemnosc) {
        addresses = new LinkedList<Integer>();
    }

    @Override
    public boolean check(int adresStrony) {
        if(!addresses.contains(adresStrony)){

            if (this.addresses.size() < this.size) {
                this.addresses.add(adresStrony);
            } else {
                zastStrony(adresStrony);
            }
            error();

            return false;
        }
        return true;
    }

    @Override
    protected void zastStrony(int adresStrony) {
        addresses.remove();
        addresses.add(adresStrony);
    }

    public void wypisz(){
        for(int address : addresses){
            System.out.println(address);
        }
    }

}