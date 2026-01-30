import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (Your Name)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Prompt for name
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String userName = input.nextLine();

        // 2. Prompt for floating-point number
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        // 3. Calculate expression: (4/3) * 2^( (31-x)/25 ) 
    
        double expressionResult = (4.0/3.0) * Math.pow(2, (31 - spice) / 25.0);
        
        System.out.print("Well " + userName + ", the spice value resulted in ");
        System.out.printf("%.4f\n", expressionResult);

        // 4. Convert to nearest hundredth using type casting (the "100 trick")
        double convertedValue = (int)(expressionResult * 100) / 100.0;
        System.out.println("And the converted value is " + convertedValue);

        // Call the paint calculator method
        calcWallPaint();
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        
        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // Calculate and output the wall's area
        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + (int)wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed
        double paintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);

        // Calculate and output the number of 1 gallon cans needed (rounded up)
        int cansNeeded = (int) Math.ceil(paintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
