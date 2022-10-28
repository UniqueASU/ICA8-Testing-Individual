package main.java;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class UrinalsTest {
    @Test
    void isValidString()
    {
        System.out.println("====== Unique Chhetri ==== TEST ONE EXECUTED=======");
        Assertions.assertEquals( false,
                Urinals.validString("====== Unique Chhetri ==== TEST ONE EXECUTED======="));
    }
    @Test
    void isValidString2(){
        System.out.println("====== Unique Chhetri ==== TEST TWO EXECUTED=======");
        Assertions.assertEquals(true,
                Urinals.validString("100010"));
    }
    @Test
    void isUrinalCountValid(){
        System.out.println("====== Unique Chhetri ==== TEST THREE EXECUTED=======");
        Assertions.assertEquals(1,
                Urinals.getUrinalCount("10001"));
    }

    @Test
    public void readFile() throws IOException {
        System.out.println("====== Unique Chhetri ==== TEST FOUR EXECUTED=======");
        File expected = new File("urinals.dat");
        assertEquals(true,expected.isFile());
    }



}
