package Task_TestNG;

public class Parallelogram {
    double length;
    double width;


    public Parallelogram ( double length,  double width){
        try {

            if (length > 0 && width > 0) {
                this.length = length;
                this.width = width;

            } else {
                this.length = 0;
                this.width = 0;
            }
        }
        catch (Exception e){
            this.length = 0;
            this.width = 0;
        }

    }

    public  double calculateArea(){

        try {


            return this.width*this.length;

        } catch (Exception e){
            return 0;

        }

    }
}
