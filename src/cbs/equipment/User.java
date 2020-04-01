/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbs.equipment;

/**
 *
 * @author Admin
 */
class User {
     private int id, quantity;
     private float time_limit;
     private String name, equipment_type_id, equipment_status_id;
     
     public User(int id, String name, String equipment_type_id, int quantity, float time_limit, String equipment_status_id)
     {
         this.id = id;
         this.name = name;
         this.equipment_type_id = equipment_type_id;
         this.quantity = quantity;
         this.time_limit = time_limit;
         this.equipment_status_id=equipment_status_id;
     }
     
     public int getid()
     {
         return id;
     }
     
     public String getname()
     {
         return name;
     }
     public String qetequipment_type_id()
     {
         return equipment_type_id;
     }
     public int getquantity()
     {
         return quantity;
     }
     public float gettime_limit()
     {
         return time_limit;
     }
     public String getequipment_status_id()
     {
         return equipment_status_id;
     }
         
}
