package org.example.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("[" + dateFormat.format(date) + " " + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {

        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }
}
