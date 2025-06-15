package com.rt.sample.test;

import org.junit.jupiter.api.Test;

import com.rt.sample.HelloWorld;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testGetLocalCurrentDateShouldReturnCurrentDate() {
        Date now = new Date();
        Date returnedDate = HelloWorldTestWrapper.getLocalCurrentDate();

        assertNotNull(returnedDate, "Date should not be null");
        assertTrue(returnedDate.equals(now) || returnedDate.after(now),
                "Returned date should be now or slightly after the current date");
    }

    /**
     * Since getLocalCurrentDate is private in HelloWorld, we create a simple wrapper class
     * in test scope to access it for testing purposes.
     * Alternatively, you could make the method package-private for test access.
     */
    static class HelloWorldTestWrapper extends HelloWorld {
        public static Date getLocalCurrentDate() {
            return HelloWorld.getLocalCurrentDateTestable();
        }
    }
}