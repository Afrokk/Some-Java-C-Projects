import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class AverageGasPrices {
    
    /** 
     * @param index
     * @return String
     */
    public String getMonth(int index) {
        String month = "null";
        switch(index) { 
            case 0: month = "January"; break;
            case 1: month = "February"; break;
            case 2: month = "March"; break;
            case 3: month = "April"; break;
            case 4: month = "May"; break;
            case 5: month = "June"; break;
            case 6: month = "July"; break;
            case 7: month = "August"; break;
            case 8: month = "September"; break;
            case 9: month = "October"; break;
            case 10: month = "November"; break;
            case 11: month = "December"; break;
            case 13: month = "December"; break; 
        }
        return month;
    }
    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        AverageGasPrices gasObj = new AverageGasPrices();
        File file = new File("1994_Weekly_Gas_Averages.txt");
        File outputFile = new File("1994_Monthly_Gas_Averages.txt");
        PrintStream output = new PrintStream(outputFile);
        Scanner fileReader = new Scanner(file);
        ArrayList<Double> monthlyAvg = new ArrayList<Double>();
        double Avg, avgWeek1, avgWeek2, avgWeek3, avgWeek4;
        String month = "null";

        while (fileReader.hasNextLine()) {
            avgWeek1 = fileReader.nextDouble();
            avgWeek2 = fileReader.nextDouble();
            avgWeek3 = fileReader.nextDouble();
            avgWeek4 = fileReader.nextDouble();

            Avg = (avgWeek1 + avgWeek2 + avgWeek3 + avgWeek4) / 4;
            monthlyAvg.add(Avg);
        }
        monthlyAvg.set(11, ((monthlyAvg.get(11) + monthlyAvg.get(12)) / 2));
        monthlyAvg.remove(12);
        ArrayList<Double> monthlyAvgCopy = new ArrayList<>(monthlyAvg);
        Collections.sort(monthlyAvgCopy);

        for (int i = 0; i < monthlyAvg.size(); i++) {
            for (int j = 0; j < monthlyAvg.size(); j++) {
                if ((Double.compare(monthlyAvgCopy.get(i), monthlyAvg.get(j))) == 0) {
                    month = gasObj.getMonth(j);
                    break; 
                }
                else {
                    continue;
                }
            }
            System.setOut(output);
            System.out.printf("%s: $%.2f\n", month, monthlyAvgCopy.get(i));
        }
        fileReader.close();
    }
}