import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the hill type (normal/large): ");
        String hillType = scanner.next();

        System.out.print("Enter the jumper's speed at the end of the ramp: ");
        double speed = scanner.nextDouble();

        // Determine hill parameters based on the hill type
        int height;
        double pointsPerMeter;
        int par;

        if (hillType.equals("normal")) {
            height = 46;
            pointsPerMeter = 2;
            par = 90;
        } else if (hillType.equals("large")) {
            height = 70;
            pointsPerMeter = 1.8;
            par = 120;
        } else {
            System.out.println("Invalid hill type. Please enter 'normal' or 'large'.");
            return;
        }

        // Calculate time in the air and distance traveled
        double timeInAir = Math.sqrt((2 * height) / 9.8);
        double distance = speed * timeInAir;

        // Calculate points based on distance and par
        double points = 60 + (distance - par) * pointsPerMeter;

        // Output distance and points
        System.out.println("Distance Traveled: " + distance + " meters");
        System.out.println("Points Earned: " + points);

        // Provide feedback based on points
        if (points >= 61) {
            System.out.println("Great job for doing better than par!");
        } else if (points < 10) {
            System.out.println("What happened??");
        } else {
            System.out.println("Sorry you didn't go very far");
        }



    }

}