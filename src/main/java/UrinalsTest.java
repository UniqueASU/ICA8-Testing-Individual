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
import org.junit.jupiter.api.function.Executable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void readInputFile() throws IOException {
        System.out.println("====== Unique Chhetri ==== TEST FIVE EXECUTED=======");
        File expected = new File("urinals.dat");
        assertEquals(true,expected.isFile());
    }

    @Test
    public void readEmptyFile() throws IOException {
        System.out.println("====== Unique Chhetri ==== TEST SIX EXECUTED=======");
        File expected = new File("urinals.dat");
        assertTrue(expected.length()>0);
    }
    @Test
    public void readFileException() {
        System.out.println("====== Unique Chhetri ==== TEST SEVEN EXECUTED=======");
        assertThrows(IOException.class, new Executable() {
            File expected = new File("wrongFileName.dat");
            @Override
            public void execute() throws Throwable {
               Urinals.readFromFile(expected);
            }
        });
    }

    @Test
    void writeBadFilenameException() throws IOException {
        String currentPath = new java.io.File(".").getCanonicalPath();
        Assertions.assertThrows(Exception.class
                , () -> Urinals.writeToFile(new ArrayList<>() , currentPath, "rule.txt"));
//        assertEquals("Bad Filename", exception.getMessage());
        System.out.println("====== Unique Chhetri == TEST EIGHT EXECUTED =======");
    }






}
