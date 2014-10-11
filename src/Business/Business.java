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
public class Business {
    
    public static Business business;
    
    UserAccountDirectory userAccountDirectory;
    EmplyeeDirectory emplyeeDirectory;
    
    private Business() {
        userAccountDirectory = new UserAccountDirectory();
        emplyeeDirectory = new EmplyeeDirectory();
    }
    
    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmplyeeDirectory getEmplyeeDirectory() {
        return emplyeeDirectory;
    }

    public void setEmplyeeDirectory(EmplyeeDirectory emplyeeDirectory) {
        this.emplyeeDirectory = emplyeeDirectory;
    }
    
    
}
