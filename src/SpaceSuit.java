public class SpaceSuit {
    private double currentOxygen;

    //constructor initializing starting oxygen
    public SpaceSuit(){
        this.currentOxygen = 5.0;
    }
    //getter
    public double getCurrentOxygen() {
        return currentOxygen;
    }

    //method for oxygen levels
    public void consumeOxygen(){
        if(currentOxygen > 0.0){
            currentOxygen -= 1.0;
            System.out.println("OXYGEN STATUS: 1.0 unit has been consumed. Remaining: " + currentOxygen);
        }else{
            System.out.println("CRITICAL FAILURE: Oxygen is completed deleted!");
        }
    }

    //boolean to check life support oxygen
    public boolean isDepleted(){
        return currentOxygen <= 0.0; //return true if oxygen is 0.0 or less, false otherwise
    }

}
