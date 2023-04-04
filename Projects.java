public class Projects {


    int projectNumber;

    String projectName;

    String buildingType;

    String physicalAddress;

    int erfNumber;

    double totalFee;

    double amountPaid;

    String deadLine;

    String projectCompleted;

    String dateCompleted;

    // people in the project

    Persons architect;
    Persons customer;
    Persons contractor;

    // constructor for project class
     public Projects(int projectNumber, String projectName, String buildingType, String physicalAddress, int erfNumber,
                     double totalFee, double amountPaid, String deadLine, String projectCompleted, String dateCompleted,
                     Persons architect, Persons customer, Persons contractor) {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.physicalAddress = physicalAddress;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.amountPaid = amountPaid;
        this.deadLine = deadLine;
        this.projectCompleted = projectCompleted;
        this.dateCompleted = dateCompleted;
        this.architect = architect;
        this.customer = customer;
        this.contractor = contractor;
    }
        // getter and setter to edit project details when needed.
    public void getNumber(String projectName) {
        this.projectName = projectName;
    }
    public void getNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }
    public void getAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public int getErfNumber() {
        return erfNumber;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setProjectName(String projectName) { this.projectName  = projectName;}

    public void setDeadLine(String deadLine) { this.deadLine = deadLine;}

    public void setAmountPaid(double amountPaid) {this.amountPaid = amountPaid;}

    public void setProjectCompleted(String projectCompleted) {this.projectName = projectCompleted;}

    public void setDateCompleted(String dateCompleted) {this.dateCompleted = dateCompleted;}

//    public Persons getArchitect() {
//        return getArchitect();
//    }
//
//    public Persons getContractor() {
//        return Contractor;
//    }
//
//    public Persons getCustomer() {
//        return customer;
//    }

    // toString method print out project details
    public String toString(){
        String output = "";
        output += "\nProject Number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + buildingType;
        output += "\nPhysical Address: " + physicalAddress;
        output += "\nErf Number: " + erfNumber;
        output += "\nTotal Fee: " + totalFee;
        output += "\nAmount Paid: " + amountPaid;
        output += "\nDeadline: " + deadLine;
        output += "\nProject Completed: " + projectCompleted;
        output += "\nCompleted Date: " + dateCompleted;
        output += "\nArchitect: " + architect.toSting();
        output += "\nCustomer: " + customer.toSting();
        output += "\nContractor: " + contractor.toSting();

        return output;
    }
}
