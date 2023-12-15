public interface Logger {
    public void info(String info);
    public void warning(String warn);
    public void error(String error);
    public void fatal(String fatal);
    public void close();
}
