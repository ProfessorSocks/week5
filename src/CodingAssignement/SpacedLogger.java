package CodingAssignement;

public class SpacedLogger implements HwLogger {

    @Override
    public void log(String str) {
        char[] arr = str.toCharArray();
        String newStr = "";
        for(char i : arr){
            newStr += i + " ";
        }
        System.out.println(newStr);
    }

    @Override
    public void error(String str) {
        char[] arr = str.toCharArray();
        String newStr = "";
        for(char i : arr){
            newStr += i + " ";
        }
        System.out.println("ERROR: " + newStr);
    }
    
}
