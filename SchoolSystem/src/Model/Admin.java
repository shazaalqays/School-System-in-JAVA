
package Model;

import java.util.ArrayList;
import Model.LessonType;

public class Admin {
    private int id;
    private String name;
    private String username;
    private String password;
    public Admin(){
        
    }
    public Admin(String name, String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString( ) {
        String result = "Admin ID: \t\t"+ id + "\nAdmin Name: \t\t" + name+ "\nUsername: \t\t"+ username+"\nPassword: \t\t"+ password+"\n";
        return result;
    }
}
