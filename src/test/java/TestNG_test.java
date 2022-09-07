import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class TestNG_test {

    @BeforeClass
    public void sayHi(){
        System.out.println("hello");
    }

    @Parameters({"number1" , "number2", "sum"})
    @Test
    public void testNumSum(int number1, int number2, int sum){
        TestNG_FirstOne cal=new TestNG_FirstOne();
        int test1 = cal.calculateSum(number1,number2);
        assertEquals(test1 , sum);
    }



}
