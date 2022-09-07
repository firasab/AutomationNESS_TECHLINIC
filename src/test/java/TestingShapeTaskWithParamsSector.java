import Task_TestNG.Sector;
import Task_TestNG.Square;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestingShapeTaskWithParamsSector {

    @Parameters({ "diameter", "angle", "area" })
    @Test
    public void testWithParamsSector(String diameter, String angle, String area) throws Exception {
        try {
            double diameterDouble = Double.parseDouble(diameter);
            double angleDouble = Double.parseDouble(angle);
            double areaDouble = Double.parseDouble(area);
            Sector sector = new Sector(diameterDouble, angleDouble );
            assertEquals(sector.calculateArea(), areaDouble);
        } catch (NumberFormatException e) {
            System.out.println("The file has String that cant be an Integer");
        }
    }


}
