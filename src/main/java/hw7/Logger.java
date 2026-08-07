package hw7;

public final class Logger {

    public static void printMessage(LogLevel level, String message) {
        System.out.println(level.getColour()
                + "[" + level + "] "
                + message
                + ConsoleColours.RESET);
    }

    public static void info(String message) {
        Logger.printMessage(LogLevel.INFO, message);
    }

    public static void debug(String message) {
        Logger.printMessage(LogLevel.DEBUG, message);
    }

    public static void warn(String message) {
        Logger.printMessage(LogLevel.WARN, message);
    }

    public static void error(String message) {
        Logger.printMessage(LogLevel.ERROR, message);
    }
}
