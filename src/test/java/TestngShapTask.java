import Task_TestNG.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;




public class TestngShapTask {

    @DataProvider(name = "squareData")
    public static Object [][] getSquareData() throws Exception{

        List<String[]> lines = ReadCsvFile.readAllLines("C:\\Users\\Public\\Desktop\\TestNG\\src\\test\\java\\TestCaseSquare.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines){
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "rectangleData")
    public static Object [][] getRectangleData() throws Exception{

        List<String[]> lines = ReadCsvFile.readAllLines("C:\\Users\\Public\\Desktop\\TestNG\\src\\test\\java\\TestCaseRectangle.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines){
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "circleData")
    public static Object [][] getCircleData() throws Exception{

        List<String[]> lines = ReadCsvFile.readAllLines("C:\\Users\\Public\\Desktop\\TestNG\\src\\test\\java\\TestCaseCircle.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines){
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "ellipseData")
    public static Object [][] getEllipseData() throws Exception{

        List<String[]> lines = ReadCsvFile.readAllLines("C:\\Users\\Public\\Desktop\\TestNG\\src\\test\\java\\TestCaseEllipse.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines){
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "parallelogramData")
    public static Object [][] getParallelogramData() throws Exception{

        List<String[]> lines = ReadCsvFile.readAllLines("C:\\Users\\Public\\Desktop\\TestNG\\src\\test\\java\\TestCaseParallelogram.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines){
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "sectorData")
    public static Object [][] getSectorData() throws Exception{

        List<String[]> lines = ReadCsvFile.readAllLines("C:\\Users\\Public\\Desktop\\TestNG\\src\\test\\java\\TestCaseSector.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines){
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "trapezoidData")
    public static Object [][] getTrapezoidData() throws Exception{

        List<String[]> lines = ReadCsvFile.readAllLines("C:\\Users\\Public\\Desktop\\TestNG\\src\\test\\java\\TestCaseTrapezoid.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines){
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "triangleData")
    public static Object [][] getTriangleData() throws Exception{

        List<String[]> lines = ReadCsvFile.readAllLines("C:\\Users\\Public\\Desktop\\TestNG\\src\\test\\java\\TestCaseTriangle.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines){
            data[index] = line;
            index++;
        }
        return data;
    }


    @Test(dataProvider = "squareData")
    public void testSquareData(String length, String area ) {
        double lengthDouble = Double.parseDouble(length);
        double areaDouble = Double.parseDouble(area);
        Square square = new Square(lengthDouble);
        assertEquals(square.calculateArea(), areaDouble);

    }

    @Test(dataProvider = "rectangleData")
    public void testRectangleData(String height, String width,String area ) {
        double heightDouble = Double.parseDouble(height);
        double widthDouble = Double.parseDouble(width);
        double areaDouble = Double.parseDouble(area);
        Rectangle rectangle = new Rectangle(heightDouble,widthDouble );
        assertEquals(rectangle.calculateArea(), areaDouble);

    }

    @Test(dataProvider = "circleData")
    public void testCircleData(String diameter, String area ) {
        double diameterDouble = Double.parseDouble(diameter);
        double areaDouble = Double.parseDouble(area);
        Circle circle = new Circle(diameterDouble );
        assertEquals(circle.calculateArea(), areaDouble);

    }

    @Test(dataProvider = "ellipseData")
    public void testEllipseData(String Half_the_length_of_the_main_axis, String Half_the_length_of_the_secondary_axis,String area ) {
        double Half_the_length_of_the_main_axis_Double = Double.parseDouble(Half_the_length_of_the_main_axis);
        double Half_the_length_of_the_secondary_axis_Double = Double.parseDouble(Half_the_length_of_the_secondary_axis);
        double areaDouble = Double.parseDouble(area);
        Ellipse ellipse = new Ellipse(Half_the_length_of_the_main_axis_Double,Half_the_length_of_the_secondary_axis_Double );
        assertEquals(ellipse.calculateArea(), areaDouble);

    }

    @Test(dataProvider = "parallelogramData")
    public void testParallelogramData(String length, String width, String area ) {
        double lengthDouble = Double.parseDouble(length);
        double widthDouble = Double.parseDouble(width);
        double areaDouble = Double.parseDouble(area);
        Parallelogram parallelogram = new Parallelogram(lengthDouble,widthDouble);
        assertEquals(parallelogram.calculateArea(), areaDouble);

    }

    @Test(dataProvider = "sectorData")
    public void testSectorData(String diameter, String angle, String area ) {
        double lengthDouble = Double.parseDouble(diameter);
        double angleDouble = Double.parseDouble(angle);
        double areaDouble = Double.parseDouble(area);
        Sector sector = new Sector(lengthDouble, angleDouble );
        assertEquals(sector.calculateArea(), areaDouble);

    }

    @Test(dataProvider = "trapezoidData")
    public void testTrapezoidData(String smallWidth, String bigWidth, String height, String area ) {
        double smallWidthDouble = Double.parseDouble(smallWidth);
        double bigWidthDouble = Double.parseDouble(bigWidth);
        double heightDouble = Double.parseDouble(height);
        double areaDouble = Double.parseDouble(area);
        Trapezoid trapezoid = new Trapezoid(smallWidthDouble, bigWidthDouble, heightDouble );
        assertEquals(trapezoid.calculateArea(), areaDouble);

    }

    @Test(dataProvider = "triangleData")
    public void testTriangleData(String height, String width, String area ) {
        double heightDouble = Double.parseDouble(height);
        double widthDouble = Double.parseDouble(width);
        double areaDouble = Double.parseDouble(area);
        Triangle triangle = new Triangle(heightDouble, widthDouble );
        assertEquals(triangle.calculateArea(), areaDouble);

    }








}


