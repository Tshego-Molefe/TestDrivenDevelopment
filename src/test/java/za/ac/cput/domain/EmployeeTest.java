/**
 * Tshegofatso Molefe
 * 219001235
 * 10 March 2023
 */

package za.ac.cput.domain;
import org.apache.commons.digester.annotations.rules.SetTop;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.Employee;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void test() {
        Employee emp = new Employee(012356, "Name", "LName", 15750.00);
        System.out.println(emp);
        assertNotNull(emp);
    }

    //i) Object Equality
    @Test
    public void testAssert() {
        int a = 10;
        int b = 15;
        String s1 = "Name";
        String s2 = "Name";
        double d1 = 52658.00;
        double d2 = 52658.00;

        assertEquals(a, a);
        assertNotEquals(a, b);
        assertSame(s2, s1);
        assertEquals(d2, d1);
    }

    // ii) Object Identity
    @Test
    public void testObjectID() {
        Employee emp1 = new Employee(10225, "Name", "LName", 15750.00);
        Employee emp2 = new Employee(10225, "Name", "LName", 15750.00);
        assertNotSame(emp1, emp2);
    }

    // iii) Failing Test
    @Test
    public void failTest() {
        Employee e = new Employee(15852, "", "Molefe", 15280.58);
        System.out.println("This method should fail " + e);
        assertEquals(null, e);
    }

        // iv) Timeouts
    @Timeout(value = 181, unit = TimeUnit.MILLISECONDS)
    @Test
    public void testTimeout(){
        for (int i = 0; i < 3000; i++) {
            System.out.println(i);
        }
    }



        // v) Disabling Test
    @Disabled
    @Test
    public void disableTest(){
    Employee e = new Employee(21900, "Name", "Surname", 15750);
        System.out.println(e.toString());
    }



    }
