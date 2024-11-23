import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.*;

public class OperatingSystemAnnotationTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void printHello(){
        System.out.println("Hello World");
    }

    @Test
    @DisabledOnOs({OS.WINDOWS, OS.LINUX})
    public void printHelloPython(){
        System.out.println("Hello python");
    }
}
