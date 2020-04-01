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
class User1 {
    private int id;
    private String name;
    private String acronym;
    
    public User1(int id, String name, String acronym)
    {
        this.id = id;
        this.name = name;
        this.acronym = acronym;
    }
    
    public User1(int id, String name)
    {
        this.id = id;
        this.name = name;
        // this.acronym= acronym;
    }
    
    public int getid()
    {
        return id;
    }
    
    public String getname()
    {
        return name;
    }
    
    public String getacronym()
    {
        return acronym;
    }
    
    
}
