import org.junit.jupiter.api.*;

class JavaOperationsTest {
    JavaOperations JavaOperations =  new JavaOperations();

    @BeforeAll
    public static void openDatabase(){ System.out.println("Database connection opened..."); }
    @AfterAll
    public static void closeDatabase(){ System.out.println("Database connection closed..."); }
    @BeforeEach
    public void init(){
        JavaOperations =  new JavaOperations();
        System.out.println("Initialization done.");
    }

    @AfterEach
    public void cleanUp(){ System.out.println("Clean up done."); }

    @Test
    void addTest(){ System.out.println("AddTest...using JavaOperations"); }

    @Test
    void multiplyTest(){ System.out.println("MultiplyTest...using JavaOperations"); }

}