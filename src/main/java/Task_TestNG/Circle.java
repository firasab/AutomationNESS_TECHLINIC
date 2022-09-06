package Task_TestNG;

public class Circle {
    double diameter;

    public Circle(double diameter){
        try {

            if (diameter > 0) {
                this.diameter = diameter;
            } else {
                this.diameter = 0;
            }
        }catch (Exception e){
            this.diameter = 0;
        }

    }

    public   double calculateArea(){

        try {

            return this.diameter*this.diameter*3.14;

        } catch (Exception e){
            return 0;

        }

    }
}
