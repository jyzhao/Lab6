/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author zhaojiyuan
 */
public class ConfigureBusiness {
    public static Business initialize() {
        Business business = Business.getInstance();
        
        Employee e1 = business.getEmployeeDirectory().addNewEmployee();
        e1.setFirstName("Jiyuan");
        e1.setLastName("Zhao");
        e1.setOrganization("NEU");
        
        UserAccount ua = business.getUserAccountDirectory().addNewUserAccount();
        ua.setPerson(e1);
        ua.setRole(UserAccount.ADMIN_ROLE);
        ua.setStatus("Active");
        ua.setUserName("admin");
        ua.setPassword("admin");
        
        Employee e2 = business.getEmployeeDirectory().addNewEmployee();
        e2.setFirstName("Andrew");
        e2.setLastName("Chao");
        e2.setOrganization("NEU");
        
        UserAccount ua2 = business.getUserAccountDirectory().addNewUserAccount();
        ua2.setPerson(e2);
        ua2.setRole(UserAccount.EMPLOYEE_ROLE);
        ua2.setStatus("Active");
        ua2.setUserName("andrew");
        ua2.setPassword("andrew");
        
        return business;
    }
}
