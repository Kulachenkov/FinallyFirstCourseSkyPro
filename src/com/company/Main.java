package com.company;

public class Main {

    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        Employee ivanovIvan = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 52300.5);
        Employee petrovPetr = new Employee("Petr", "Petrov", "Sergeevich", 2, 90345.8);
        Employee alexeevSergei = new Employee("Sergei", "Alexeev", "Ivanovich", 4, 120111.0);
        Employee pavlovaAnna = new Employee("Anna", "Pavlova", "Sergeevna", 3, 150400.0);
        Employee kulikovAndrei = new Employee("Andrei", "Kulikov", "Sergeevich", 5, 123000);
        Employee romanovRoman = new Employee("Roman", "Romanov", "Valerievich", 1, 45621.2);

        employee[0] = ivanovIvan;
        employee[1] = petrovPetr;
        employee[2] = alexeevSergei;
        employee[3] = pavlovaAnna;
        employee[4] = kulikovAndrei;
       employee[5] = romanovRoman;
//        employeeList();
//        fullSalary();
//      // printEmployee(2);
//       minSalary();
//       maxSalary();
//       averageSalary();
//       employeeFullName();
//       minSalary(1);
//       maxSalary(1);
//        fullSalary(1);
//        averageSalary(1);
//        employeeFullName(1);
//        moreThanValue(10000);
//        lessThanValue(10000);
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(ivanovIvan);
        employeeBook.addEmployee(petrovPetr);
        employeeBook.addEmployee(alexeevSergei);
        employeeBook.addEmployee(pavlovaAnna);
        employeeBook.addEmployee(kulikovAndrei);
        employeeBook.addEmployee(romanovRoman);
       // employeeBook.deleteEmployee("Pavlova","Anna","Sergeevna",4);
        employeeBook.addEmployee(pavlovaAnna);

        //employeeBook.employeeList();
        //employeeBook.employeeFullName(3);

        employeeBook.printGroupEmployee();
    }

    public static void employeeList(){
        for (Employee employee : employee) {
            if(employee != null ) {
                System.out.println(employee.toString());
            }
        }
    }

    public static void printEmployee (int id){
        for (int i = 0; i < employee.length; i++) {
            if(id == employee[i].getId()){
                System.out.println(employee[i].toString());
                return;
            }
        }

    }

    public static double fullSalary(){
        double fullSalary = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                fullSalary += employee.getSalary();
            }
        }
        System.out.println("Total salary is " + fullSalary + " RUB");
        return fullSalary;
    }

    public static void minSalary(){
        double minSalary = Double.MAX_VALUE;
        int id = 0;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getSalary() < minSalary){
                minSalary = employee[i].getSalary();
               id = employee[i].getId();
            }
        }
        System.out.print("Min salary has the following employee: ");
        printEmployee(id);
    }

    public static void maxSalary(){
        double maxSalary = Double.MIN_VALUE;
        int id = 0;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getSalary() > maxSalary){
                maxSalary = employee[i].getSalary();
                id = employee[i].getId();
            }
        }
        System.out.print("Max salary has the following employee: ");
        printEmployee(id);
    }

    public static double averageSalary(){
        int count = 0;
        double averageSalary;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null){
                count++;
            }
        }
        averageSalary = fullSalary()/count;
        String formattedDouble = String.format("%.2f", averageSalary);
        System.out.println("Average salary is " + formattedDouble + " RUB");
        return averageSalary;
    }
    public static void employeeFullName() {
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName());
            }
        }
    }

    public static void indexingSalary(int percent){
        double add;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null) {
                add = employee[i].getSalary() + employee[i].getSalary()*(percent/100);
                employee[i].setSalary(add);
            }
        }
    }

    public static void minSalary(int groupNumber){
        double minSalary = Double.MAX_VALUE;
        int id = 0;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getGroupNumber() == groupNumber && employee[i].getSalary() < minSalary){
                minSalary = employee[i].getSalary();
                id = employee[i].getId();
            }
        }
        System.out.print("Min salary in group number " + groupNumber + " has the following employee: ");
        printEmployee(id);
    }

    public static void maxSalary(int groupNumber){
        double maxSalary = Double.MIN_VALUE;
        int id = 0;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getGroupNumber() == groupNumber && employee[i].getSalary() > maxSalary){
                maxSalary = employee[i].getSalary();
                id = employee[i].getId();
            }
        }
        System.out.print("Max salary in group number " + groupNumber + " has the following employee: ");
        printEmployee(id);
    }

    public static double fullSalary(int groupNumber){
        double fullSalary = 0;
        for (Employee employee : employee) {
            if (employee != null && employee.getGroupNumber() == groupNumber) {
                fullSalary += employee.getSalary();
            }
        }
        System.out.println("Total salary in group number " + groupNumber + " is " + fullSalary + " RUB");
        return fullSalary;
    }

    public static double averageSalary(int groupNumber){
        int count = 0;
        double averageSalary;

        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getGroupNumber() == groupNumber){
                count++;
            }
        }
        averageSalary = fullSalary(groupNumber)/count;
        String formattedDouble = String.format("%.2f", averageSalary);
        System.out.println("Average salary in group number " + groupNumber + " is " + formattedDouble + " RUB");
        return averageSalary;
    }

    public static void indexingSalary(int percent, int groupNumber){
        double add;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getGroupNumber() == groupNumber) {
                add = employee[i].getSalary() + employee[i].getSalary()*(percent/100);
                employee[i].setSalary(add);
            }
        }
    }

    public static void employeeFullName(int groupNumber) {
        System.out.println("The list of employees of " + groupNumber + " group:" );
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getGroupNumber() == groupNumber) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName()+ " salary: "
                        + employee[i].getSalary() + " RUB ID: " + employee[i].getId());
            }
        }
    }

    public static void lessThanValue(double value) {
        System.out.println("The list of employees with salary less than " + value + ":" );
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getSalary() < value) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName()+ " salary: "
                        + employee[i].getSalary() + " RUB ID: " + employee[i].getId());
            }
        }
    }

    public static void moreThanValue(double value) {
        System.out.println("The list of employees with salary more or equal than " + value + ":" );
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getSalary() >= value) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName()+ " salary: "
                        + employee[i].getSalary() + " RUB ID: " + employee[i].getId());
            }
        }
    }







    
}
