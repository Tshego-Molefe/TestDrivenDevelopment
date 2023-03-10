/**
 * Tshegofatso Molefe
 * 219001235
 * 10 March 2023
 */

package za.ac.cput.domain;
import org.apache.commons.digester.annotations.rules.SetTop;
import org.junit.jupiter.api.Disabled;
import za.ac.cput.domain.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void test(){
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

    // iii) Failing Test
    @Test
    public void failTest() {
        Employee e = new Employee(15852, "", "Molefe", 15280.58);
        System.out.println("Employee e should fail " + e);
        assertEquals(null, e);
    }

        // iv) Timeouts

        // v) Disabling Test
    @Disabled
    @Test
    public void disableTest(){

    }



    }
