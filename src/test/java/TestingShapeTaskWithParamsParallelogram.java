import Task_TestNG.Parallelogram;
import Task_TestNG.Square;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestingShapeTaskWithParamsParallelogram {

    @Parameters({ "length", "width", "area" })
    @Test
    public void testWithParamsParallelogram(String length,String width, String area) throws Exception {
        try {
            double lengthDouble = Double.parseDouble(length);
            double widthDouble = Double.parseDouble(width);
            double areaDouble = Double.parseDouble(area);
            Parallelogram parallelogram = new Parallelogram(lengthDouble, widthDouble );
            assertEquals(parallelogram.calculateArea(), areaDouble);
        } catch (NumberFormatException e) {
            System.out.println("The file has String that cant be an Integer");
        }
    }


}
