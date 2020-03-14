/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbs.User;

/**
 *
 * @author Admin
 */
class User {
     private int id;
     
     private String first_name, last_name, username, password, role_id;
     
     public User(int id, String first_name, String last_name, String username, String password, String role_id)
     {
         this.id = id;
         this.first_name = first_name;
         this.last_name = last_name;
         this.username = username;
         this.password = password;
         this.role_id = role_id;
     }
     
     public int getid()
     {
         return id;
     }
     
     public String getfirst_name()
     {
         return first_name;
     }
     public String qetlast_name()
     {
         return last_name;
     }
     public String getusername()
     {
         return username;
     }
     public String getpassword()
     {
         return password;
     }
     public String getrole_id()
     {
         return role_id;
     }
    
    
}
