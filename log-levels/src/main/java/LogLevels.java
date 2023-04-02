public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].strip();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1,logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        String typeMessage = logLevel(logLine);
        String message = message(logLine);
        return message + " (" + typeMessage + ")";
    }
}
