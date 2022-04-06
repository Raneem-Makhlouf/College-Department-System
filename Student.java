/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.*;

/**
 *
 * @author DELL M8400
 */
public class Student {

    private String name;
    private Vector getsub;

    Student() {
        getsub = new Vector();
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public Enumeration getSub() {
        return getsub.elements();
    }

    public void addSub(Subject s) {
        getsub.addElement(s);
    }

}
