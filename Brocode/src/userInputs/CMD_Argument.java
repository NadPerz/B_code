package userInputs;

public class CMD_Argument {

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Usage: java CMD_Argument <StudentID> <Name> <District>");
            System.out.println("Please provide all three arguments.");
            return; // Exit the program if not enough arguments are provided
        }

        String stdID = args[0];
        String name = args[1];
        String district = args[2];

        System.out.println("DitNo: " + stdID);
        System.out.println("Name: " + name);
        System.out.println("District: " + district);
    }
}