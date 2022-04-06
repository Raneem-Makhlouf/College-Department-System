/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.ArrayList;
import java.util.*;
//import static javafx.scene.input.KeyCode.F;

/**
 *
 * @author DELL M8400
 */
public class Subject {

    private int subdegree = -1;
    private int count = 0;
    private Vector sd;
    private ArrayList<Student> stu;

    Subject() {
        sd = new Vector();
        stu = new ArrayList<Student>();
    }

    public void setSubdegree(int subdegree) {
        this.subdegree = subdegree;
    }

    public int getSubdegree() {
        return subdegree;
    }

    public void set(Subject s) {
        sd.addElement(s);
    }

    public Enumeration get() {
        return sd.elements();
    }

    public int getResult() throws NotYetSetException {
        if (subdegree == -1) {
            throw new NotYetSetException("Result is not defined");
        }
        Enumeration<Subject> x = sd.elements();
        while (x.hasMoreElements()) {
            Subject s = x.nextElement();
            if (x.nextElement().getSubdegree() >= 50) {
                count++;
            }
        }
        return count;

    }

}
