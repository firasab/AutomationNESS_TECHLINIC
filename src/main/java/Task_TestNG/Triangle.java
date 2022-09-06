package Task_TestNG;

public class Triangle {
    double height;
    double width;

    public Triangle (double height, double width){
        try {
            if (height > 0 && width > 0) {
                this.height = height;
                this.width = width;
            } else {
                this.height = 0;
                this.width = 0;
            }
        }catch (Exception e){
            this.height = 0;
            this.width = 0;
        }

    }

    public double calculateArea(){
        try {
            return  0.5*this.width*this.height;
        }catch (Exception e){
            return 0;

        }




    }
}
