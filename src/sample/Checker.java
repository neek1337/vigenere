package sample;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Checker implements Runnable {

    volatile AtomicBoolean flag;
    ArrayList<String> words;
    String target;
    int[] key;

    public Checker(AtomicBoolean flag, ArrayList<String> words, String target, int[] key1) {
        this.flag = flag;
        this.words = words;
        this.target = target;
        this.key = new int[key1.length];
        for (int i = 0; i < key1.length; i++) {
            this.key[i] = key1[i];
        }
    }

    @Override
    public void run() {
        if (words.contains(target) && flag.get()) {
            flag.set(false);
            Logic.founded = true;
            Logic.truekey = key;

        }
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
