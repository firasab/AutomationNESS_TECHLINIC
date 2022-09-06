package Task_TestNG;

public class Trapezoid {
    double smallWidth;
    double bigWidth;
    double height;

    public Trapezoid(double smallWidth,  double bigWidth, double height){
        try {

            if (smallWidth > 0 && bigWidth > 0 && height > 0) {
                this.smallWidth = smallWidth;
                this.bigWidth = bigWidth;
                this.height = height;
            } else {
                this.smallWidth = 0;
                this.bigWidth = 0;
                this.height = 0;
            }
        }catch (Exception e){
            this.smallWidth = 0;
            this.bigWidth = 0;
            this.height = 0;
        }

    }

    public  double calculateArea(){

        try {

            return 0.5*(this.bigWidth+this.smallWidth)*this.height;

        } catch (Exception e){
            return 0;

        }

    }
}
