package Task_TestNG;

public class Square {
    double length;

    public Square (double length){
        try {
            if (length > 0) {
                this.length = length;
            } else {
                this.length = 0;

            }
        }catch (Exception e){
            this.length = 0;
        }

    }

    public double calculateArea(){

        try {

            return  this.length*this.length;

        } catch (Exception e){
            return 0;

        }

    }
}
