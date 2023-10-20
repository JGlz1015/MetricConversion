import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Welcome to Metric Converter App!");
            System.out.println("Conversions that can be used: 1. kg to lb  2. gram to ounces  3. km to mile  4. mm to inch");
    
            String input;
            do {
                System.out.print("Enter your choice of options 1 - 4 (or 'exit' to quit): ");
                input = scanner.nextLine();
    
                
            switch (input.toLowerCase()) {
                case "1":
                    convertAndPrint("kg", "lb", 2.20462);
                    break;

                case "2":
                    convertAndPrint("gram", "ounces", 0.03527396);
                    break;

                case "3":
                    convertAndPrint("km", "mile", 0.621371);
                    break;

                case "4":
                    convertAndPrint("mm", "inch", 0.0393701);
                    break;

                case "exit":
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!input.equalsIgnoreCase("exit"));

        scanner.close();
    }

    private static void convertAndPrint(String fromUnit, String toUnit, double conversionFactor) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value in " + fromUnit + ": ");
        double inputValue = scanner.nextDouble();

        double result = inputValue * conversionFactor;
        System.out.println(inputValue + " " + fromUnit + " is equal to " + result + " " + toUnit);
    }
    }
  