package siit.homework05;

public class Text {

    public String number;

    public String message;

    Text(String number, String message){

        this.number = number;
        this.message = message;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return "\n Sent to: " + getNumber() + "\n" + "Message : " + getMessage() + "\n";
    }
}
