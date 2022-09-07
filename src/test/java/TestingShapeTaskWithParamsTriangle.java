import Task_TestNG.Square;
import Task_TestNG.Triangle;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestingShapeTaskWithParamsTriangle {

    @Parameters({ "height", "width", "area" })
    @Test
    public void testWithParamsCircle(String height,String width, String area) throws Exception {
        try {
            double heightDouble = Double.parseDouble(height);
            double widthDouble = Double.parseDouble(width);
            double areaDouble = Double.parseDouble(area);
            Triangle triangle = new Triangle(heightDouble, widthDouble);
            assertEquals(triangle.calculateArea(), areaDouble);
        } catch (NumberFormatException e) {
            System.out.println("The file has String that cant be an Integer");
        }
    }


}
