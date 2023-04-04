import java.util.Scanner;
import java.time.LocalDate;

public class PoisedManager {

    // creating global Scanner to receive system input across all functions
    static Scanner globalScanner = new Scanner(System.in);

    //This java project management system will keep track of the projects of the engineering firm called Poised.
    //This is the main class called Poised.
    //Program will print menu for the user to use.
    //Program will run the main and call on the method from the class of Persons and Projects.


    // Creating new projectObject
    public static void main(String[] args) {
        Projects newProject = CreateNewProject();
        System.out.println(newProject);

        //Scanner will be used in while loop containing the menu and will allow user to edit Poised Projects
        System.out.println("welcome to Poised management system.");
        String menu = "\nSelect one of the following from the main menu:";
        menu += "\n1. Change the due date of the project : \n";
        menu += "\n2. Change the total amount of fee, PAID to date : \n";
        menu += "\n3. Update a contractor's details : \n";
        menu += "\n4. Exit and go back to main menu : \n";

        while (true) {
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            String menuChoice = input.nextLine();
            System.out.println("welcome to Poised");

            //if user choices 1, they will change due date of project.
            if (menuChoice.equals("1")) {
                System.out.println("Please enter new due date for project YYYY-MM-DD : \n");
                Scanner changeDueDate = new Scanner(System.in);
                LocalDate deadline = LocalDate.parse(changeDueDate.nextLine());
                newProject.setDeadLine("updated details");
                System.out.println("CreateNewProject");
            }
            // if user chooses 2, they will change the total amount paid till DATE
            else if (menuChoice.equals("2")) {
                System.out.println("please enter the new total amount that has till date: \n");
                Scanner changeTotalAmount = new Scanner(System.in);
                double totalAmountDate = changeTotalAmount.nextDouble();
                newProject.setAmountPaid(totalAmountDate);
                newProject.setDeadLine("updated details");
                System.out.println("CreateNewProject");

                // if the user chooses 3, they will be able to update the contractors details.
            } else if (menuChoice.equals("3")) {
                // user to enter details to update system
                // name of the contractor
//                Scanner upDateName = new Scanner(System.in);
                System.out.println("please enter the name of the contractor: \n");
                String name = globalScanner.nextLine();

                // The telephone Number.
//                Scanner telephoneNumber = new Scanner(System.in);
                System.out.println("please enter the contractor number : \n");
                String telephoneNumber = globalScanner.nextLine();

                //email address
//                Scanner upDateEmail = new Scanner(System.in);
                System.out.println("please enter contractors EmailAddress : ");
                String emailAddress = globalScanner.nextLine();

                //Physical Address
//                Scanner upDateAddress = new Scanner(System.in);
                System.out.println("please enter physical Address of contractor :\n";
                String physicalAddress = globalScanner.nextLine();

            } else if (menuChoice.equals("4")) {
                System.out.println("You have logged out!");
                globalScanner.close();
                break;
            } else {
                System.out.println("UNKNOWN VAL ENTERED");
            }
        }
    }

    public static Projects CreateNewProject() {
        // ask user for input for project details
        //get project name
        System.out.println("Enter Project name: ");
        String projectName = globalScanner.nextLine();

        // The project number
        System.out.print("please enter project number :\n");
        int projectNumber = Integer.parseInt(globalScanner.nextLine());

        //the project name
        System.out.print("please enter the building type : \n");
        String buildingType = globalScanner.nextLine();

        // the address of the project
        System.out.print("please enter address of the project: \n");
        String addressProject = globalScanner.nextLine();

        // the erf number
        System.out.println("please enter the ERF Number : \n");
        int erfNumber = Integer.parseInt(globalScanner.nextLine());

        // the total fee being charged for the project
        System.out.println("please enter the total amount of the project: \n");
        double totalFee = Double.parseDouble(globalScanner.nextLine());

        // the total amount that has been paid till date
        System.out.println("please enter the total amount that has been paid till date: \n");
        double totalAmountDate = Double.parseDouble(globalScanner.nextLine());

        // the deadline for the project
        System.out.println("please enter the deadLine for the project YYYY-MM-DD: \n");
        String deadLine = globalScanner.nextLine();

        String projectCompleted = "False";

        // the constructor will create an object
        Persons architect = getPersonalDetails("architect");
        Persons contractor = getPersonalDetails("contractor");
        Persons customer = getPersonalDetails("customer");

        return new Projects(projectNumber, projectName, buildingType, addressProject, erfNumber,
        totalFee, totalAmountDate, deadLine, projectCompleted, deadLine, architect, customer, contractor);

    }

    public static Persons getPersonalDetails(String personType) {
        // creating a new person object
        //the personType is the type of role the person has
        //the name of the person
        System.out.println("\nplease enter the name of the " + personType + ":");
        String name = globalScanner.nextLine();

        // the telephone number
        System.out.println("please enter the telephone number :");
        String telephoneNumber = globalScanner.nextLine();

        //the emailAddress
        System.out.println("please enter the emailAddress :");
        String emailAddress = globalScanner.nextLine();

        // the physical address
        System.out.println("Please enter the address of the project:");
        String physicalAddress = globalScanner.nextLine();

        // close the Poised project program and return its attributes
        return new Persons(name, telephoneNumber, emailAddress, physicalAddress);
    }
}

