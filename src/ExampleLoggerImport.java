import java.sql.Date;

public class ExampleLoggerImport implements Logger {

    @Override
    public void info(String info) {
        Date date = new Date(0);
        System.out.println(date.toString() + ": " + info);
    }

    @Override
    public void warning(String warn) {
        Date date = new Date();
        System.out.println("warning - " + date.toString() + ": " + warn);
    }

    @Override
    public void error(String error) {
        Date date = new Date();
        System.out.println("Error - " + date.toString() + ": " + error);
    }

    @Override
    public void fatal(String fatal) {
        Date date = new Date();
        System.out.println("FATAL!!!! - " + date.toString() + ": " + fatal);
    }
    
}
