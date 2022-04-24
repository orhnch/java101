package salaryCalculation;

public class employee {
    String name;
    double salary;
    int workHours;
    int hireYears;

    public employee(String name, double salary, int workHours, int hireYears){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    double tax(){
        if(this.salary<1000){
            return 0;
        }else {
            return this.salary*(0.03);
        }
    }
    int bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }
    double raiseSalary(){
        int thisYear=2022;
        if(thisYear-this.hireYears < 10){
            return 0.05*this.salary;
        } else if (thisYear-this.hireYears < 20) {
            return 0.1*this.salary;
        }else {
            return 0.15*this.salary;
        }
    }

    public String tooString() {
        double salaryWithBonusTax = this.salary + bonus() - tax();
        double newSalary = salaryWithBonusTax + raiseSalary();
        return "Name:  " + this.name + "\n" +
                "Salary: " + this.salary + "\n" +
                "Work Hours: " + this.workHours + "\n" +
                "Hire Years: " + this.hireYears + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Raise Salary: " + raiseSalary() + "\n" +
                "Salary with bonus and tax: " + salaryWithBonusTax + "\n" +
                "New Salary: " + newSalary;


    }
}
