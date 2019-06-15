package src.alg;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO extends Alg{

    public Queue<Integer> addresses;
    int size = 0;

    public FIFO(int pojemnoscPamieci) {
        super(pojemnoscPamieci);
    }

    @Override
    protected void utworzPamiec(int pojemnosc) {
        addresses = new LinkedList<Integer>();
        size = pojemnosc;
    }

    @Override
    public boolean check(int adresStrony) {
        if(!addresses.contains(adresStrony)){
            error();
            zastStrony(adresStrony);
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