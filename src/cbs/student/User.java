/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbs.student;

import cbs.equipment.*;

/**
 *
 * @author Admin
 */
class User {
     private int id;
     private String first_name, last_name, student_number, contact_no;
     private String address;
     
     public User(int id, String first_name, String last_name, String student_number, String contact_no, String address)
     {
         this.id = id;
         this.first_name = first_name;
         this.last_name = last_name;
         this.student_number = student_number;
         this.contact_no = contact_no;
         this.address= address;
     }

    User(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     public int getid()
     {
         return id;
     }
     
     public String getfirst_name()
     {
         return first_name;
     }
     public String getlast_name()
     {
         return last_name;
     }
     public String getstudent_number()
     {
         return student_number;
     }
     public String getcontact_no()
     {
         return contact_no;
     }
     public String getaddress()
     {
         return address;
     }
         
}
