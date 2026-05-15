public class LogLevels {
    
    public static String message(String logLine) {
       
        int colonIndex = logLine.indexOf(':');
        String msg = logLine.substring(colonIndex + 1);
        return msg.trim();

    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        String level = logLine.substring(start, end);
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
       // Extract the message
        int colonIndex = logLine.indexOf(':');
        String message = logLine.substring(colonIndex + 1).trim();

        // Extract the log level
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        String level = logLine.substring(start, end).toLowerCase();

        // Combine into the required format
        return message + " (" + level + ")";

    }
}
