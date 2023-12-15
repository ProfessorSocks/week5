package CodingAssignement;

public class HwApp {
    public static void main(String[] args) {
        HwLogger asterisk = new AsteriskLogger();
        HwLogger spaced = new SpacedLogger();

        asterisk.log("Hello");
        asterisk.error("too many cats");

        spaced.log("Hello");
        spaced.error("Too many cats");
    }
}
