package com.company;

public class EmployeeBook {

    private Employee[] employee = new Employee[10];

    public void employeeList(){
        for (Employee employee : employee) {
            if(employee != null ) {
                System.out.println(employee.toString());
            }
        }
    }

    public void printEmployee (int id){
        for (int i = 0; i < employee.length; i++) {
            if(id == employee[i].getId()){
                System.out.println(employee[i].toString());
                return;
            }
        }

    }

    public double fullSalary(){
        double fullSalary = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                fullSalary += employee.getSalary();
            }
        }
        System.out.println("Total salary is " + fullSalary + " RUB");
        return fullSalary;
    }

    public void minSalary(){
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

    public void maxSalary(){
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

    public double averageSalary(){
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
    public void employeeFullName() {
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName());
            }
        }
    }

    public void indexingSalary(int percent){
        double add;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null) {
                add = employee[i].getSalary() + employee[i].getSalary()*(percent / 100);
                employee[i].setSalary(add);
            }
        }
    }

    public void minSalary(int groupNumber){
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

    public void maxSalary(int groupNumber){
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

    public double fullSalary(int groupNumber){
        double fullSalary = 0.0;
        for (Employee employee : employee) {
            if (employee != null && employee.getGroupNumber() == groupNumber) {
                fullSalary += employee.getSalary();
            }
        }
        System.out.println("Total salary in group number " + groupNumber + " is " + fullSalary + " RUB");
        return fullSalary;
    }

    public double averageSalary(int groupNumber){
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

    public void indexingSalary(int percent, int groupNumber){
        double add;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getGroupNumber() == groupNumber) {
                add = employee[i].getSalary() + employee[i].getSalary()*(percent/100);
                employee[i].setSalary(add);
            }
        }
    }

    public  void employeeFullName(int groupNumber) {
        System.out.println("The list of employees of " + groupNumber + " group:" );
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getGroupNumber() == groupNumber) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName()+ " salary: "
                        + employee[i].getSalary() + " RUB ID: " + employee[i].getId());
            }
        }
    }

    public  void lessThanValue(double value) {
        System.out.println("The list of employees with salary less than " + value + ":" );
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getSalary() < value) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName()+ " salary: "
                        + employee[i].getSalary() + " RUB ID: " + employee[i].getId());
            }
        }
    }

    public void moreThanValue(double value) {
        System.out.println("The list of employees with salary more or equal than " + value + ":" );
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getSalary() >= value) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName()+ " salary: "
                        + employee[i].getSalary() + " RUB ID: " + employee[i].getId());
            }
        }
    }

    public void addEmployee(Employee newEmployee) {
        for(int i = 0; i < employee.length; i++){
            if(employee[i] == null){
                this.employee[i] = newEmployee;
                return;
            }
        }
    }

    public void deleteEmployee (String surname, String name, String middleName,int id){
        for(int i = 0; i < employee.length; i++){
            if(employee[i].getLastName().equals(surname) && employee[i].getFirstName().equals(name)
            && employee[i].getMiddleName().equals(middleName) && employee[i].getId() == id){
                employee[i] = null;
                return;
            }
        }
    }

    public void changeSalary (String surname, String name, String middleName, double newSalary){
        for(int i = 0; i < employee.length; i++){
            if(employee[i].getLastName().equals(surname) && employee[i].getFirstName().equals(name)
                    && employee[i].getMiddleName().equals(middleName)){
                employee[i].setSalary(newSalary);
                return;
            }
        }
    }

    public void changeGroup (String surname, String name, String middleName, int newGroupNumber){
        for(int i = 0; i < employee.length; i++){
            if(employee[i].getLastName().equals(surname) && employee[i].getFirstName().equals(name)
                    && employee[i].getMiddleName().equals(middleName)){
                employee[i].setGroupNumber(newGroupNumber);
                return;
            }
        }
    }

    public  void employeeFullNameOnly (int groupNumber) {
        System.out.println("The list of employees of " + groupNumber + " group:" );
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getGroupNumber() == groupNumber) {
                System.out.println(employee[i].getLastName() + " " +
                        employee[i].getFirstName()+ " " + employee[i].getMiddleName());
            }
        }
    }

    public void printGroupEmployee(){
        employeeFullNameOnly(1);
        System.out.println("********");
        employeeFullNameOnly(2);
        System.out.println("********");
        employeeFullNameOnly(3);
        System.out.println("********");
        employeeFullNameOnly(4);
        System.out.println("********");
        employeeFullNameOnly(5);
        System.out.println("********");
    }






}
