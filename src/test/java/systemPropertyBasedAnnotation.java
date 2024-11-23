import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class systemPropertyBasedAnnotation {

    /*
    System Property
    @EnabledIfSystemProperty()
    @DisabledIfSystemProperty()

    EnvironmentalVariable
    @EnabledIfEnvironmentVariable()
    @DisabledIfEnvironmentVariable()

    Custom Condition
    @EnabledIf("Method")      should return boolean value
    @DisabledIf("Method")

    Custom Names
    @DisplayName("Name")   you can see it in the report generated in chrome

    Ordering the Execution of test
    @Order(1/2/3/4...)


    @Nested

    @RepeatedTest(1/2/3/4/5...)     NO need for @Test Annotation
    */
//    @Test
//    public void SystemProperty(){
//        System.out.println(System.getProperties());
//    }
    @Test
    @EnabledIfSystemProperty(named="java.specification.version", matches= "21")
    public void getSystemProperty(){
        System.out.println("Java specification version...");
    }

    @Test
    @DisabledIfSystemProperty(named="User.country", matches= "US")
    public void getSystemProperty2(){
        System.out.println("User country...");
    }
}
