import Task_TestNG.Ellipse;
import Task_TestNG.Square;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestingShapeTaskWithParamsEllipse {

    @Parameters({ "Half_the_length_of_the_main_axis", "Half_the_length_of_the_secondary_axis", "area" })
    @Test
    public void testWithParamsEllipse(String Half_the_length_of_the_main_axis, String Half_the_length_of_the_secondary_axis, String area) throws Exception {
        try {
            double Half_the_length_of_the_main_axis_Double = Double.parseDouble(Half_the_length_of_the_main_axis);
            double Half_the_length_of_the_secondary_axis_Double = Double.parseDouble(Half_the_length_of_the_secondary_axis);
            double areaDouble = Double.parseDouble(area);
            Ellipse ellipse = new Ellipse(Half_the_length_of_the_main_axis_Double, Half_the_length_of_the_secondary_axis_Double );
            assertEquals(ellipse.calculateArea(), areaDouble);
        } catch (NumberFormatException e) {
            System.out.println("The file has String that cant be an Integer");
        }
    }


}
