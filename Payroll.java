import java.util.Scanner;

public class Payroll {
    private int[] employeeID = new int[]{658845, 4520125, 7895122, 8777541,
                                        8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    public void setEmployeeID(int employeeID, int index) {
        this.employeeID[index] = employeeID;
    } 

    public void setHours(int hours, int index) {
        this.hours[index] = hours;
    }

    public void setPayRate(double payRate, int index) {
        this.payRate[index] = payRate;
    }

    public void setWages(double payRate, int hours, int index) {
        this.wages[index] = payRate * hours; 
    }

    public int getEmployeeID(int subscript) {
        return employeeID[subscript];
    }

    public int getHours(int subscript) {
        return hours[subscript];
    }

    public double getPayRate(int subscript) {
        return payRate[subscript];
    }

    public double getWages(int subscript) {
        return wages[subscript];
    }

    public double getGrossPayRate(int subscript) {
        double grossPayRate = payRate[subscript] * hours[subscript];
        return grossPayRate;
    }

    public static void main(String[] args) {
        Payroll ID = new Payroll();
        Scanner scnr = new Scanner(System.in);
        int hours = -1;
        double payRate = 0; 

        for (int i = 0; i < 7; i++) {
            System.out.printf("ID #%d: %d\n", i, ID.getEmployeeID(i));
            while (hours < 0) {
                System.out.printf("Enter Employee %d's Hours: ", ID.getEmployeeID(i));
                hours = scnr.nextInt();
                ID.setHours(hours, i);
            }

            while (payRate < 6.00) {
                System.out.printf("Enter Employee %d's Pay Rate: ", ID.getEmployeeID(i));
                payRate = scnr.nextDouble();
                ID.setPayRate(payRate, i);
            }
            ID.setWages(payRate, hours, i);
            hours = -1;
            payRate = 0;
        }

        for (int i = 0; i < 7; i++) {
            System.out.printf("ID #%d: %d ", i, ID.getEmployeeID(i));
            System.out.println("- Gross Wages: $" + ID.getWages(i));
        }
        scnr.close();
    }
}