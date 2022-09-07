import Task_TestNG.Square;
import Task_TestNG.Trapezoid;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestingShapeTaskWithParamsTrapezoid {

    @Parameters({ "smallWidth", "bigWidth", "height", "area" })
    @Test
    public void testWithParamsTrapezoid(String smallWidth, String bigWidth, String height, String area) throws Exception {
        try {
            double smallWidthDouble = Double.parseDouble(smallWidth);
            double bigWidthDouble = Double.parseDouble(bigWidth);
            double heightDouble = Double.parseDouble(height);
            double areaDouble = Double.parseDouble(area);
            Trapezoid trapezoid = new Trapezoid(smallWidthDouble, bigWidthDouble, heightDouble );
            assertEquals(trapezoid.calculateArea(), areaDouble);
        } catch (NumberFormatException e) {
            System.out.println("The file has String that cant be an Integer");
        }
    }


}
