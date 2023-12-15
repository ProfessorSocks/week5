public class StudentExample {
    //classes don't have mains

    //static shares between objects/classes
    static int numberOfStudents;


    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int gradeLevel;

    public StudentExample(String firstName, Strng lastName, String phoneNumber, int gradeLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gradeLevel = gradeLevel;
    }

    public StudentExample(){}

    public void introduce(){
        System.out.println("Hello my name is " + firstName + " " + lastName);
        System.out.println("I am in grade " + gradeLevel);
        System.out.println("My phone number is " + phoneNumber);
    }


    // Getters and Setters DO NOT EDIT DIRECTLY use these
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

}
