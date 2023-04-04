public class Persons {
    String name;

    String telephoneNumber;

    String emailAddress;

    String physicalAddress;

    //constructor

    public Persons(String name, String telephoneNumber, String emailAddress, String physicalAddress) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
    }
    // Creating setter for editing purposes:

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int TelephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setEmailAddress(String EmailAddress) {
        this.emailAddress = emailAddress;
    }

    // Creating string toString
    public String toSting() {
        String output = "";
        output += "\nName:" + name;
        output += "\nTelephone Number:" + telephoneNumber;
        output += "\nEmail Address:" + emailAddress;
        output += "\nPhysical Address: " + physicalAddress;

        return output;
    }
}
