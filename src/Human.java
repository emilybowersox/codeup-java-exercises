package oop;
public class Human {
    public static final String planet = "earth";
    private String name;
    private String email;
    private String address;
    public String getName(){
        return this.name;
    }
    public void setName(String aName){
        this.name = aName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean verify(String email){
        return email.contains("@");
    }
    public void sendMail(String to){
        if(this.verify(to)){
            System.out.println("sending email from " + this.email + " to " + to);
        }else{
            System.out.println("Wrong email format");
        }
    }
}

public class HumanApp {
    public static void main(String[] args){
        Human stacy = new Human();
        Human fer = new Human();
        stacy.setName("Stacy");
        fer.setName("Fer");
        fer.setEmail(fer.getName() + "@gmail.com");
        stacy.setEmail(stacy.getName() + "@yahoo.com");
        stacy.sendMail("instructors@codeup.com");
        stacy.sendMail("instructors&codeup.com");
        fer.sendMail("support@google.com");
    }
}