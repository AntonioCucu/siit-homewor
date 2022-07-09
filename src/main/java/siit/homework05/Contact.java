package siit.homework05;

public class Contact {

    public String number;
    public String firstName;
    public String lastName;
    Contact(String number, String firstName, String lastName){

        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "name: " + getFirstName() + " " +  getLastName() + " - " + getNumber()  + "\n";
    }
}
