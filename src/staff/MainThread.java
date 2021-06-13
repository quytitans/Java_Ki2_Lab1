package staff;

import staff.entity.caculation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of years of experience: ");
        int namKN = scanner.nextInt();
        System.out.println("Enter the number of years of service to the company: ");
        int namCH = scanner.nextInt();
        staff.entity.caculation cacuSlary = new caculation();
        int salary = cacuSlary.caculateStaffSalary(namKN, namCH);
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("The salary of this staff is: " + formatter.format(salary) + " VNĐ");
    }
}
