package javaAbstractClass;

import javaAbstractClass.Casual;
import javaAbstractClass.Clerk;

/**
 * Created by RENT on 2017-01-21.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Casual("Jan", "Kowalski", 2000);
        Employee employee2 = new Secretary("Anna", "Nowak", 2000);
        Employee employee3 = new Clerk("Piotr", "Laskowski", 2000);

        double salary1 = employee1.getSalary();

        System.out.println(employee1.toString() + salary1);
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
    }
}
