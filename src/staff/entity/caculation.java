package staff.entity;

public class caculation {
    public int caculateStaffSalary(int namKN, int namCH) {
        int salary = 0;
        int salaryMain = 0;
        if (namKN <= 2) {
            salaryMain = 10_000_000;
        } else if (namKN > 2 && namKN <= 5) {
            salaryMain = 20_000_000;
        } else {
            salaryMain = 30_000_000;
        }
        if (namCH < 1) {
            salary = (int) (salaryMain * 1.3);
        } else if (namCH >= 1 && namCH < 2) {
            salary = (int) (salaryMain * (1.5));
        } else if (namCH >= 2 && namCH < 5) {
            salary = (int) (salaryMain * (2));
        } else {
            salary = (int) (salaryMain * 3);
        }
        return salary;
    }

}
