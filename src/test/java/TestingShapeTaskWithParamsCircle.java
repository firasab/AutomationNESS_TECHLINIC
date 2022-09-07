import Task_TestNG.Square;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestingShapeTaskWithParamsCircle {


    @Parameters({ "diameter", "area" })
    @Test
    public void testWithParamsCircle(String diameter, String area) throws Exception {
        try {
            double diameterDouble = Double.parseDouble(diameter);
            double areaDouble = Double.parseDouble(area);
            Square circle = new Square(diameterDouble );
            assertEquals(circle.calculateArea(), areaDouble);
        } catch (NumberFormatException e) {
            System.out.println("The file has String that cant be an Integer");
        }
    }


}
