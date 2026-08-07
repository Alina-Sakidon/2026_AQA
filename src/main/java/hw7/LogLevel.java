package hw7;

public enum LogLevel {
    INFO(ConsoleColours.GREEN),
    DEBUG(ConsoleColours.BLUE),
    WARN(ConsoleColours.YELLOW),
    ERROR(ConsoleColours.RED);

    private final String colour;

    LogLevel(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
