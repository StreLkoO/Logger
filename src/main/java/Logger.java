public class Logger {
    protected int num = 1;
    private static Logger instance;


    private Logger() {
    }

    public static Logger get() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[" + num++ + "] " + message);
    }
}
