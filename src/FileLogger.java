import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileLogger implements Logger {

    private BufferedWriter writer;

    public FileLogger(){
        try {
            writer = new BufferedWriter(new FileWriter("logs.txt"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void info(String info) {
        try {
            writer.write("Info: " + info);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void warning(String warn) {
        try {
            writer.write("WARNING: " + warn);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void error(String error) {
        try {
            writer.write("Error: " + error);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void fatal(String fatal) {
        try {
            writer.write("FATAL!!!!!!!!: " + fatal);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
