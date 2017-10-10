package com.company;



    public class EmployeeInfo {

        private String employeeName;
        private String employeeNumber;
        private int employeeShift;



        public EmployeeInfo(String employeeName, String  employeeNumber, int employeeShift) {
            this.employeeName = employeeName;
            this.employeeNumber = employeeNumber;                   // Constructor Method for Employee Info
            this.employeeShift = employeeShift;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeNumber() { return employeeNumber; }

        public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; } //getter and setter's for Employee Info

        public int getEmployeeShift() {
            return employeeShift;
        }

        public void setEmployeeShift(int employeeShift) {
            this.employeeShift = employeeShift;
        }

        public void printAll() {
            System.out.println("Employee Name  -  " +   "Employee Number  -  " + "Employee Shift");
            System.out.println(employeeName + "          " + employeeNumber + "                 " + employeeShift);   // Print statement with formatted output
        }

    }
