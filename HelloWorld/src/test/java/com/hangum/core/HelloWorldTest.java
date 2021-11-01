package com.hangum.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void hello() {
        HelloWorld helloworld = new HelloWorld();
        String returnValue = helloworld.hello("HI");

        assertEquals(returnValue, "Hello HI");
    }
}