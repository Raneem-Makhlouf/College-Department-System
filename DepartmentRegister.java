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

public class DepartmentRegister {

    private Student student;
    private Vector subjects;

    DepartmentRegister() {
        subjects = new Vector();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s) {
        student = s;
    }

    public void setSubject(Subject a) {
        subjects.addElement(a);
    }

    public Enumeration getSubject() {
        return subjects.elements();
    }

    public boolean canGoToDepartment() {

        boolean mark = false;
        Enumeration<Subject> e = subjects.elements();
        Enumeration<Student> v = subjects.elements();
        while (e.hasMoreElements()) {
            Subject a = e.nextElement();
            Student x = v.nextElement();
            try {

                if (a.getResult() >= 5) {
                    mark = true;
                } else {
                    mark = false;
                }
            } catch (Exception ex) {
                System.out.println("error 2");
            }
        }
        return mark;
    }

}
