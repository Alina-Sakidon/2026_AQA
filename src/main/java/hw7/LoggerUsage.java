package hw7;

public class LoggerUsage {
    public static void main(String[] args) {
        Logger.printMessage(LogLevel.ERROR, "red message");
        Logger.printMessage(LogLevel.WARN, "yellow message");
        Logger.printMessage(LogLevel.INFO, "green message");
        Logger.printMessage(LogLevel.DEBUG, "blue message");

    }
}
