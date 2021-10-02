package baseline;

public class fitness {

    private double age;
    private double restingPulse;



    //constructor method

    public  fitness(double age, double resPulse){
        if(age >= 15 && age <= 70)
            this.age = age;
        else{
            System.out.println("Please try a valid age");
            System.exit(0);
        }

        if(resPulse >= 50.0 && resPulse <= 100)
            this.restingPulse = resPulse;
        else{
            System.out.println("Please try a valid resting pulse");
            System.exit(0);
        }

    }

    //TargetHeartRate method

    public int TargetHeartRate( double age, double restingPulse, int intensity){

        return (int) ((((220 - age) - restingPulse) * (intensity / 100.00)) + restingPulse);
    }

    //printRow method

    public void printRow (int intensity, int rate){

        System.out.printf("%d%-7% | %d bpm %n", intensity, rate);
    }

    //print method

    public  void print(){
        System.out.printf("%-8s | %-8s%n","Intensity", "Rate");
        System.out.printf("%-8s | %-8s%n","---------", "----------");
        for(int i = 55; i < 100; i = i + 5){
            printRow(i, TargetHeartRate(age, restingPulse, i));

        }

    }
}
