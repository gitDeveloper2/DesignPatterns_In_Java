package deisgn.patterns.singletonDesignPattern.logutils.logutils.myLogger;

import deisgn.patterns.singletonDesignPattern.logutils.logutils.formatter.LogFormatter;

import java.util.Random;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;

public class MyLogger {
private static Logger logger;
private MyLogger(){}
    public static Logger createLogger() {
        Random rand = new Random();
        logger = Logger.getLogger("myLogger" + rand.nextInt());

        ConsoleHandler handler = new ConsoleHandler();

        Formatter formatter = new LogFormatter();
        handler.setFormatter(formatter);
        logger.setUseParentHandlers(false);

        logger.addHandler(handler);
        return logger;
    }

}
