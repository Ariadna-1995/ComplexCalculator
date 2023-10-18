package calculator.logger;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    private static String message;

    static {
        FileInputStream in = new FileInputStream("log.config")){
            LogManager.getLogManager().readConfiguration(in);
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}

