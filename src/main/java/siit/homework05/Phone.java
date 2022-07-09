package siit.homework05;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Phone implements Action {

    public String number;
    public float batteryLife;
    ArrayList<Contact> contactList = new ArrayList<Contact>();
    Contact contact1 = new Contact("0771421355", "Fibonacci", "Number");
    Contact contact2 = new Contact("0712332112", "Random", "Person");
    Contact contact3 = new Contact("0798765432", "This is", "Acontact");

    ArrayList<Text> textList = new ArrayList<>();
    ArrayList<String> callLog = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    protected Phone(String number, float batteryLife) {

        this.number = number;
        this.batteryLife = batteryLife;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(float batteryLife) {
        this.batteryLife = batteryLife;
    }
    @Override
    public void addContact() {

        System.out.println("\nPlease enter the phone number.");
        String numberContact = in.nextLine();

        System.out.println("\nPlease enter contact's first name.");
        String firstNameContact = in.nextLine();

        System.out.println("\nPlease enter contact's last name.");
        String lastNameContact = in.nextLine();

        if(numberContact.length() < 10 || numberContact.length() > 10) {
            System.out.println("Your input is not ok. Try something like 07xyzxyzxy");
        } else {
            Contact contact = new Contact(numberContact, firstNameContact, lastNameContact);
            contactList.add(contact);
        }
    }
    @Override
    public void listContacts(){

        System.out.println("This is your contact list:\n");
        for(Contact contact : contactList){
            System.out.println(contact);
        }
    }
    @Override
    public void sendText() {

        System.out.println("Please enter the phone number you want to text.");
        Scanner textThisNumber = new Scanner(System.in);
        String numberText = (textThisNumber.nextLine());

        System.out.println("Insert your text here(max 500 characters):");
        Scanner message = new Scanner(System.in);
        String messageContent = (message.nextLine());

        if(messageContent.length() < 500) {

            Text text = new Text(numberText, messageContent);
            textList.add(text);
            setBatteryLife(getBatteryLife() - 1);
        }
        else {

            System.out.println("Your text was too long, please use a maximum of 500 characters.");
            setBatteryLife(getBatteryLife() - 1);
        }

        if(getBatteryLife() < 0 ) {
            System.out.println("Your phone just died, please recharge it before trying to use it again.");
        }
    }
    @Override
    public void listMessages(){

        System.out.println("This is your message log:\n");
        for(Text text : textList) {
            System.out.println(text);
        }
    }
    @Override
    public void call(){

        System.out.println("\nPlease enter the number you want to call.");
        String callNumber = in.nextLine();

        if (contactList.size() == 0) {

            System.out.println("Unavailable number. Please make sure the number is in your contacts list.");
        } else {

            for (Contact contact : contactList) {

                if (contact.getNumber().equals(callNumber)) {

                    System.out.println("\nCalling " + callNumber + "\nRing ring.." + "\nRing ring.." + "\nRing ring.." + "\n..............\nCall ended.");
                    callLog.add(callNumber);
                    setBatteryLife(getBatteryLife() - 2);

                } else {

                    System.out.println("\nYou called an unavailable number.");
                }
            }
        }

        if(getBatteryLife() < 0 ) {
            System.out.println("Your phone just died, please recharge it before trying to use it again.");
        }
    }
    @Override
    public void callLog(){

        System.out.println("This is your call log:\n");
        System.out.println(callLog);
    }
}