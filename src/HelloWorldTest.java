import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    HelloWorld testWorld = new HelloWorld();

    @Test
    void normalHourTest(){
        assertEquals(true, testWorld.normalHours(20));
    }

}