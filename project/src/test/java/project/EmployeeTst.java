package project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    private Employee instance;

    /**
     * Init before each run
     */
    @BeforeEach
    void setUp() {
        this.instance = new Employee();
    }

    /**
     * Tests getter & setter
     */
    @Test
    void testGetterSetterId() {
        instance.setId(123);
        assertEquals(123, instance.getId());
    }

    /**
     * Tests getter & setter
     */
    @Test
    void testGetterSetterFirstName() {
        instance.setFirstName("a");
        assertEquals("a", instance.getFirstName());
    }

    /**
     * Tests getter & setter
     */
    @Test
    void testGetterSetterLastName() {
        instance.setLastName("b");
        assertEquals("b", instance.getLastName());
    }
}
    

    
