/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author DELL M8400
 */
import java.util.*;

public class College {

    private String name;
    private ArrayList<Department> dep;

    public String getnameCollege() {
        return name;
    }

    public void setnameCollege(String name) {
        this.name = name;
    }

    public College() {
        dep = new ArrayList<Department>();
    }

    

}
