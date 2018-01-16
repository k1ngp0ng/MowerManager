package com.mowitnow;

import java.util.ArrayList;
import java.util.List;

public class Instructions {

    /** Séquence brute d'instructions dans l'ensemble (G,D,A) */
    private String sequence;

    /** Liste séquentielle des actions demandées*/
    private List<Action> actions = new ArrayList<>();

    public List<Action> getActions() { return actions; }

    private void init(String sequence) {
        for (int i = 0; i< sequence.length(); i++) {
            Character currentChar = sequence.charAt(i);
            try {
                actions.add(Action.valueOf(String.valueOf(currentChar)));
            }
            catch(IllegalArgumentException e) {
                throw new IllegalArgumentException(String.format("The character '%s' at the position %s in the sequence '%s' is not part of actions codes", currentChar, i, sequence), e);
            }
        }
    }

    public Instructions(String sequence) {
        if (sequence == null || sequence.isEmpty()) {
            throw new IllegalArgumentException("La séquence est vide");
        }
        this.sequence = sequence;
        init(sequence);
    }

}
