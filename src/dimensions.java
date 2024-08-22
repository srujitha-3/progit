public class dimensions {
    private int feet;
    private int inches;


    public dimensions(int inches) {

            if (inches<0){
                this.inches=-1;
                this.feet=-1;
            }
            else{
                this.feet=inches /12;
                this.inches= inches %12;
            }

        }

    public int getFeet(){
        if (inches<0){
            this.feet=inches/12;
        }
        return feet;
    }
    public int getInches(){
        if (inches<0){
            this.inches= inches%12;
        }
        return inches;
    }
    }

