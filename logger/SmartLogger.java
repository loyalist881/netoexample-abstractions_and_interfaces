package logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SmartLogger implements Logger {
    private int counter = 0;

    @Override
    public void log(String msg) {
        counter++;
        String level = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(level + "#" + counter + " [" + timestamp + "] " + msg);
    }
}
