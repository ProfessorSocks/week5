public abstract class Employee {
    //abstract class can't be instantiated
    private String firstName;
    private String lastName;
    private double pay;
    private String boss;
    private String hoursWorked;

    public abstract String doSkill();
    //above is polymorphic

    public Employee(String firstName, String lastName, double pay, String boss){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pay = pay;
        this.boss = boss;
    }


    //getters and setters

    public String getInfo(){
        return "Name: " + firstName + " " + lastName + "\nBoss is " + boss;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getBoss(){
        return boss;
    }

}
