package project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenresTest {

    private Genres instance;

    /**
     * Init before each run
     */
    @BeforeEach
    void setUp() {
        this.instance = new Genres();
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
    void testGetterSetterHorror() {
        instance.setHorror(542);
        assertEquals(null, instance.getHorror());
    }

    /**
     * Tests 
     */
    @Test
    void testGetterSetterComedy() {
        instance.setComedy(4);
        assertEquals(null, instance.getComedy());
    }
}
