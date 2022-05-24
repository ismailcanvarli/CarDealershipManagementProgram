package mesmotors;

public class Employee {

    private String userName = "ismail";
    private String password = "1234";
       
    public boolean login(String txtUserName, String txtPassword){
        
        if(userName.equals(txtUserName) && password.equals(txtPassword)){
            return true;
        } else if(!userName.equals(txtUserName) && password.equals(txtPassword)){
            return false;
        } else if(userName.equals(txtUserName) && !password.equals(txtPassword)){
            return false;
        } else{
            return false;  
        }  
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
