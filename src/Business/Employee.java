/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import com.sun.javafx.sg.prism.GrowableDataBuffer;

/**
 *
 * @author zhaojiyuan
 */
public class Employee extends Person{
    private static int count = 1000;
    
    private int empID;
    private String organization;

    public Employee() {
        empID = ++count;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return super.getFirstName();
    }

}
