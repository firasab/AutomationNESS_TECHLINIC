package Task_TestNG;

public class Sector {
    double diameter;
    double angle;

    public Sector (double diameter, double angle){
        try {

            if (diameter > 0 && angle > 0) {

                this.diameter = diameter;
                this.angle = angle;
            } else {

                this.diameter = 0;
                this.angle = 0;
            }
        }catch (Exception e){
            this.diameter = 0;
            this.angle = 0;
        }

    }


    public  double calculateArea(){

        try {

            return this.angle*this.diameter*this.diameter*0.5;

        } catch (Exception e){
            return 0;

        }

    }
}
