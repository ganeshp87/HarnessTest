package SampleTest;

//ExampleTest.java
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

 @Test
 @Parameters("name")
 public void testWithParameter(String name) {
     System.out.println("*********** Test method with parameter:**************** " + name);
 }
}
