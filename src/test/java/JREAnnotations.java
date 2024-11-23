import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

class JREAnnotations {
    /*
    @EnabledOnJre
    @DisabledOnJre
    @EnabledForJreRange
    @DisabledForJreRange
    */

    @Test
    @EnabledOnJre(JRE.JAVA_21)
    public void printHelloJre(){
        System.out.println("JRE enable....");
    }

    @Test
    @DisabledOnJre({JRE.JAVA_8, JRE.JAVA_21})
    public void printHelloJreDisabled(){
        System.out.println("Jre disabled....");
    }
    @Test
    @EnabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_21)
    public void printHelloJreEnabledForrange(){
        System.out.println("Jre Enabled for range....");
    }
    @Test
    @DisabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_21)
    public void printHelloJreDisabledForrange(){
        System.out.println("Jre Disabled for range....");
    }


}
