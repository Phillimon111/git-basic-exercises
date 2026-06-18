public class LogLine {
    private final LogLevel level;
    private final String message;

    public LogLine(String logLine) {
        String prefix = logLine.substring(1, 4);
        message = logLine.substring(7).trim();
        switch (prefix) {
            case "TRC": level = LogLevel.TRACE;   break;
            case "DBG": level = LogLevel.DEBUG;   break;
            case "INF": level = LogLevel.INFO;    break;
            case "WRN": level = LogLevel.WARNING; break;
            case "ERR": level = LogLevel.ERROR;   break;
            case "FTL": level = LogLevel.FATAL;   break;
            default:    level = LogLevel.UNKNOWN; break;
        }
    }

    public LogLevel getLogLevel() {
        return level;
    }

    public String getOutputForShortLog() {
        return level.code + ":" + message;
    }
}