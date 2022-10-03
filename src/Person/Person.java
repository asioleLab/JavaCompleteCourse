package Person;

public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setAge(int age){
        if(age<0||age>100){
            this.age=0;
        }else{
            this.age=age;
        }
    }

    public boolean isTeen(){
        if(this.age<20 && this.age>12){
            return true;
        }else{
           return false;
        }
    }

    public String getFullName() {
        if (firstName!= null && lastName!= null && firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName!= null && firstName.isEmpty()) {
            return lastName;
        } else if (lastName!= null && lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}

