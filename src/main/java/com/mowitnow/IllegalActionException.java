package com.mowitnow;

/**
 * Created by scapillier on 13/07/16.
 */
public class IllegalActionException extends RuntimeException {

    public IllegalActionException(Action action) {
        this("unknown action : " +  action);
    }

    public IllegalActionException(String message) {
        super(message);
    }

}
