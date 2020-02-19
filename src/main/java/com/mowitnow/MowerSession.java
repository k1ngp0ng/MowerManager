package com.mowitnow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scapillier on 13/07/16.
 */
public class MowerSession {

    private List<Mower> mowers;

    public MowerSession() {
        this.mowers = new ArrayList<>();
    }

    public void addMower(Mower mower) {
        mowers.add(mower);
    }

    public Mower getMower(Integer index) {
        return mowers.get(index);
    }

    //TODO empêcher qu'une session puisse se lancer 2 fois de suite
    public void launchSession() {
        System.out.println("Launching session of mow");
        for (Mower mower : mowers) {
            mower.move();
        }
    }
}
