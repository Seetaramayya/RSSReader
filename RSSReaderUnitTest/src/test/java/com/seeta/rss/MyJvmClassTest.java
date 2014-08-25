package com.seeta.rss;

import static org.junit.Assert.*;

public class MyJvmClassTest {

    @org.junit.Test
    public void testGetHelloWorld() throws Exception {
        assertEquals(new MyJvmClass().getHelloWorld(), "Hello World");
    }
}