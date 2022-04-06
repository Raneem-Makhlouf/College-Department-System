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


/* 
   This system describes which college department can the students enroll by signing their degrees as:
   - if he passed 7 subjects he'll enroll the first department d1
   - if he passed 6 subjects he'll enroll the second department d2
   - if he passed 5 subjects he'll enroll the third department d3
   - if he passed lesss than 5 subjects he can't enroll any department and he will fail 
*/
import java.util.*;
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     * @throws javaapplication15.NotYetSetException
     */
    public static void main(String[] args) throws NotYetSetException {

        Subject sub1 = new Subject();
        Subject sub2 = new Subject();
        Subject sub3 = new Subject();
        Subject sub4 = new Subject();
        Subject sub5 = new Subject();
        Subject sub6 = new Subject();
        Subject sub7 = new Subject();

        sub1.setSubdegree(50);
        sub2.setSubdegree(76);
        sub3.setSubdegree(98);
        sub4.setSubdegree(40);
        sub5.setSubdegree(65);
        sub6.setSubdegree(58);
        sub7.setSubdegree(89);

        Student s1 = new Student();

        s1.setName("s1");

        s1.addSub(sub1);
        s1.addSub(sub2);
        s1.addSub(sub3);
        s1.addSub(sub4);
        s1.addSub(sub5);
        s1.addSub(sub6);
        s1.addSub(sub7);

        Subject su1 = new Subject();

        su1.set(sub1);
        su1.set(sub2);
        su1.set(sub3);
        su1.set(sub4);
        su1.set(sub5);
        su1.set(sub6);
        su1.set(sub7);

        Department d1 = new Department();
        Department d2 = new Department();
        Department d3 = new Department();

        DepartmentRegister dr1 = new DepartmentRegister();

        dr1.setSubject(sub1);
        dr1.setSubject(sub2);
        dr1.setSubject(sub3);
        dr1.setSubject(sub4);
        dr1.setSubject(sub5);
        dr1.setSubject(sub6);
        dr1.setSubject(sub7);

        Enumeration b;
        System.out.println("the degrees of student 1 is");
        b = dr1.getSubject();
        while (b.hasMoreElements()) {
            Subject sub = (Subject) b.nextElement();
            System.out.println(sub.getSubdegree());
        }

        dr1.setStudent(s1);

        d1.setdep("d1");
        d2.setdep("d2");
        d3.setdep("d3");

        d1.addDepartmentRegister(dr1);

        System.out.println("***************");

        System.out.println("1");
        d1.printWhoCanJoinDepartment();

        System.out.println("***************");

        d1.printDepartmentStudents();
        d2.printDepartmentStudents();
        d3.printDepartmentStudents();

    }

}
