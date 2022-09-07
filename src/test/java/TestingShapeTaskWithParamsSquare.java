import Task_TestNG.Ellipse;
import Task_TestNG.Square;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestingShapeTaskWithParamsSquare {

    @Parameters({"length", "area"})
    @Test
    public void testWithParamsSquare(String length, String area) throws Exception {
        try {
            double lengthDouble = Double.parseDouble(length);
            double areaDouble = Double.parseDouble(area);
            Square square = new Square(lengthDouble );
            assertEquals(square.calculateArea(), areaDouble);
        } catch (NumberFormatException e) {
            System.out.println("The file has String that cant be an Integer");
        }
    }




}
