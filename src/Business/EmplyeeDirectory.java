/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author zhaojiyuan
 */
public class EmplyeeDirectory {
    private ArrayList<Employee> employeeList;
    
    public EmplyeeDirectory() {
        employeeList = new ArrayList<>();
        
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee addNewEmployee() {
        Employee employee = new Employee();
        this.employeeList.add(employee);
        return employee;
    }
}
