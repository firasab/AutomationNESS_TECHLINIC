import Task_TestNG.Rectangle;
import Task_TestNG.Square;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestingShapeTaskWithParamsRectangle {

    @Parameters({ "height", "width", "area" })
    @Test
    public void testWithParamsRectangle(String height,String width, String area) throws Exception {
        try {
            double heightDouble = Double.parseDouble(height);
            double widthDouble = Double.parseDouble(width);
            double areaDouble = Double.parseDouble(area);
            Rectangle rectangle = new Rectangle(heightDouble, widthDouble );
            assertEquals(rectangle.calculateArea(), areaDouble);
        } catch (NumberFormatException e) {
            System.out.println("The file has String that cant be an Integer");
        }
    }


}
