package Task_TestNG;

public class Ellipse {
    double Half_the_length_of_the_main_axis;
    double Half_the_length_of_the_secondary_axis;

    public Ellipse( double Half_the_length_of_the_main_axis,   double Half_the_length_of_the_secondary_axis){
        try {

            if (Half_the_length_of_the_main_axis > 0 && Half_the_length_of_the_secondary_axis > 0) {
                this.Half_the_length_of_the_main_axis = Half_the_length_of_the_main_axis;
                this.Half_the_length_of_the_secondary_axis = Half_the_length_of_the_secondary_axis;
            } else {
                this.Half_the_length_of_the_main_axis = 0;
                this.Half_the_length_of_the_secondary_axis = 0;
            }
        }catch (Exception e){
            this.Half_the_length_of_the_main_axis = 0;
            this.Half_the_length_of_the_secondary_axis = 0;
        }



    }

    public  double calculateArea(){

        try {

            return 3.14*this.Half_the_length_of_the_secondary_axis*this.Half_the_length_of_the_main_axis;

        } catch (Exception e){
            return 0;

        }

    }

}
