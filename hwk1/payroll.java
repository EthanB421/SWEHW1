package hwk1;

public class payroll {
    public static void main(String[] args) {
        salariedEmployee salariedEmployee = new salariedEmployee("Joe", "Jones", "111-11-1111", "$2500");
        hourlyEmployee hourlyEmployee = new hourlyEmployee("Stephanie", "Smith", "222-22-2222", "$25", 32);
        hourlyEmployee hourlyEmployee2 = new hourlyEmployee("Mary", "Quinn", "333-33-3333", "$19", 47);
        commissionEmployee commissionEmployee = new commissionEmployee("Nicole", "Dior", "444-44-4444", "15%", "$50000");
        salariedEmployee salariedEmployee2 = new salariedEmployee("Renwa", "Chanel", "555-55-5555", "$1700");
        baseEmployee basePlusCommissionEmployee = new baseEmployee("Mike", "Davenport", "666-66-6666", "$95000");
        commissionEmployee commissionEmployee2 = new commissionEmployee("Mahnaz", "Vaziri", "777-77-7777", "22%", "$40000");

        System.out.println("Employee Information:");
        System.out.println("-------------------------------------------------");
        System.out.println(salariedEmployee.getFirstName() + " " + salariedEmployee.getLastName() + "\t" + salariedEmployee.getSSN() + "\t" + salariedEmployee.getSalary());
        System.out.println(hourlyEmployee.getFirstName() + " " + hourlyEmployee.getLastName() + "\t" + hourlyEmployee.getSSN() + "\t" + hourlyEmployee.getWage() + " " + hourlyEmployee.getHours());
        System.out.println(hourlyEmployee2.getFirstName() + " " + hourlyEmployee2.getLastName() + "\t" + hourlyEmployee2.getSSN() + "\t" + hourlyEmployee2.getWage() + " " + hourlyEmployee2.getHours());
        System.out.println(commissionEmployee.getFirstName() + " " + commissionEmployee.getLastName() + "\t" + commissionEmployee.getSSN() + "\t" + commissionEmployee.getComRate() + " " + commissionEmployee.getSales());
        System.out.println(salariedEmployee2.getFirstName() + " " + salariedEmployee2.getLastName() + "\t" + salariedEmployee2.getSSN() + "\t" + salariedEmployee2.getSalary());
        System.out.println(basePlusCommissionEmployee.getFirstName() + " " + basePlusCommissionEmployee.getLastName() + "\t" + basePlusCommissionEmployee.getSSN() + "\t" + basePlusCommissionEmployee.getBaseSalary());
        System.out.println(commissionEmployee2.getFirstName() + " " + commissionEmployee2.getLastName() + "\t" + commissionEmployee2.getSSN() + "\t" + commissionEmployee2.getComRate() + " " + commissionEmployee2.getSales());
    }
}
