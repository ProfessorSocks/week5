package CodingAssignement;

public class AsteriskLogger implements HwLogger {

    @Override
    public void log(String str) {
        System.out.println("***" + str + "***");
    }

    @Override
    public void error(String str) {
        System.out.println("***********\n***" + str + "***\n**************");
    }
    
}
