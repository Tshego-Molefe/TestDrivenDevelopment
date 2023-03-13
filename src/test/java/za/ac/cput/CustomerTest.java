package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;

class CustomerTest {
    @Test
    public void testObjectEquality() {

        Customer customer1 = new Customer();
        customer1.setFirstName("Zachary");
        customer1.setLastName("Carstens");
        customer1.setContactNumber("123456789");
        customer1.setEmail("zachary.carstens@icloud.com");

        Customer customer2 = new Customer();
        customer2.setFirstName("Zachary");
        customer2.setLastName("Carstens");
        customer2.setContactNumber("123456789");
        customer2.setEmail("zachary.carstens@icloud.com");

        assertEquals(customer1, customer2);
        assertEquals(customer2, customer1);

    }

    @Test
    public void testObjectIdentity() {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        assertNotSame(customer1, customer2);

    }

    @Test
    public void testFailingTest() {

        Customer customer1 = new Customer();
        customer1.setFirstName("Zachary");
        customer1.setLastName("Carstens");
        customer1.setContactNumber("123456789");
        customer1.setEmail("zachary.carstens@icloud.com");

        Customer customer2 = new Customer();
        customer2.setFirstName("Kyle");
        customer2.setLastName("Adams");
        customer2.setContactNumber("987654321");
        customer2.setEmail("kyleadams@gmail.com");

        assertEquals(customer1, customer2);

    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testFirstName() {
        Customer customer = new Customer();
        customer.setFirstName("Zachary");
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testLastName() {
        Customer customer = new Customer();
        customer.setLastName("Carstens");
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testContactNumber() {
        Customer customer = new Customer();
        customer.setContactNumber("123456789");
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testEmail() {
        Customer customer = new Customer();
        customer.setEmail("zachary.carstens@icloud.com");
    }

    @Disabled("Test disabled")
    @Test
    public void testDisablingTest() {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        assertNotSame(customer1, customer2);

    }

}