public class Manager extends Employee {

    public Manager(String firstName, String lastName, double pay, String boss) {
        super(firstName, lastName, pay, boss);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String doSkill() {
        if(getFirstName() == getBoss()){
            return "I am the boss I have no skills";
        }
    }

   
    


}
