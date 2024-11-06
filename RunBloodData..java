import java.util.Scanner;

class BloodData {
    static String bloodType;
    static String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }

    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String input1 = scanner.nextLine().trim();
-
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = scanner.nextLine().trim();

        BloodData bd;
        if (input1.isEmpty() || input2.isEmpty()) {
            bd = new BloodData();
        } else {
            bd = new BloodData(input1, input2);
        }

        bd.display();

        scanner.close();
    }
}
