package main.java;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
                Urinals.validString("10210"));
    }


}
