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

public class Department {

    private String name;
    private Vector DepartmentRegisters;
    private ArrayList<Student> st;

    Department() {
        DepartmentRegisters = new Vector();
        st = new ArrayList<Student>();
    }

    public String getdep() {
        return name;
    }

    public void setdep(String n) {
        name = n;
    }

    public void addDepartmentRegister(DepartmentRegister dr) {
        DepartmentRegisters.addElement(dr);
    }

    public Enumeration getCourseRecords() {
        return DepartmentRegisters.elements();
    }

    public void printDepartmentStudents() {

        Enumeration<DepartmentRegister> x = DepartmentRegisters.elements();
        Enumeration<Department> y = DepartmentRegisters.elements();
        while (x.hasMoreElements()) {
            String studentName;
            String departmentName;
            studentName = x.nextElement().getStudent().getName();
            departmentName = y.nextElement().getdep();
            System.out.println("student name is " + studentName + "in department" + departmentName);
        }
    }

    public void printWhoCanJoinDepartment() {

        Enumeration<DepartmentRegister> d = DepartmentRegisters.elements();

        while (d.hasMoreElements()) {
            DepartmentRegister department = d.nextElement();
            if (department.canGoToDepartment()) {

                Enumeration<Subject> e = DepartmentRegisters.elements();
                while (e.hasMoreElements()) {
                    Subject a = e.nextElement();
                    try {
                        a.getResult();
                        if (a.getResult() == 7) {
                            System.out.println("Student " + department.getStudent().getName() + " can join department d1");
                        } else if (a.getResult() == 6) {
                            System.out.println("Student " + department.getStudent().getName() + " can join department d2");
                        } else if (a.getResult() == 5) {
                            System.out.println("Student " + department.getStudent().getName() + " can join department d1");
                        }

                    } catch (Exception ex) {

                    }
                }
            } else {
                System.out.println("Student " + department.getStudent().getName() + " Can't join department");

            }
        }
    }
}
