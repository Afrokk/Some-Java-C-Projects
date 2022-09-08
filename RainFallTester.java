import java.util.Scanner;

public class RainFallTester {
    public static void main(String[] args) {
        RainFall rainData = new RainFall();
        Scanner scnr = new Scanner(System.in);
        double rainFall = 0;
        System.out.print("Enter Rainfall Data: ");

        for (int i = 0; i < 12; i++) {
            rainFall = scnr.nextDouble();
            rainData.setRainfall(rainFall, i);
            while (rainFall < 0) {
                System.out.print("Invalid input. Please re-enter: ");
                rainFall = scnr.nextDouble();
            }
        }

        System.out.print("If the rainfall values are: ");
        for (int i = 0; i < rainData.rainDataSize(); i++) {
            if (i == 11) {
                System.out.printf("%.1f\n", rainData.getRainfall(i));
            }
            else {
                System.out.printf("%.1f, ", rainData.getRainfall(i));
            }
        }

        System.out.printf("The total rainfall for this year is %.1f\n", rainData.totalYearlyRainfall());
        System.out.printf("The average rainfall for this year is %f\n", rainData.yearlyAvgRainfall());
        System.out.printf("The month with the highest amount of rain is %d with %.1f inches.\n", rainData.mostRainMonth(), rainData.mostRain());
        System.out.printf("The month with the least amount of rain is %d with %.1f inches.\n", rainData.leastRainMonth(), rainData.leastRain());

        scnr.close();
    }
}
