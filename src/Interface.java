public class Interface {
    /*
     *See logger.java for example
     * See ExampleLoggerImport to see example of implementing a interface from Logger.java
     * 
     * 
     *  know what you want to know but not how it's going to happen
     * a contract
     * only has abstract methods on it
     * 
     * 
     */

     public static void main(String[] args){
        Logger logger = new FileLogger();
        //must call a class interfaces can not be called

        logger.warning("Cat is cute");

        logger.close();
     }
}
