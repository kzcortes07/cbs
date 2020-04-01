/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbs.student;

import cbs.student.*;

/**
 *
 * @author Admin
 */
class User2 {
    private int id;
    private String section_number;
    private String year_level;
    
    public User2(int id, String section_number, String year_level)
    {
        this.id = id;
        this.section_number = section_number;
        this.year_level = year_level;
    }

    User2(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getid()
    {
        return id;
    }
    
    public String getsection_number()
    {
        return section_number;
    }
    
    public String getyear_level()
    {
        return year_level;
    }
    
    
    
}
