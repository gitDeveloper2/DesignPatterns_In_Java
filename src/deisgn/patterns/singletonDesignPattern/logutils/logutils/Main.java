package deisgn.patterns.singletonDesignPattern.logutils.logutils;

import deisgn.patterns.singletonDesignPattern.logutils.logutils.myLogger.MyLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger=MyLogger.createLogger();
        logger.log(Level.SEVERE," Test");

    }
}