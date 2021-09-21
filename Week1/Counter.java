package Week1;
// custom class to count tally
public class Counter {
    private int value;
    //Get current value of counter
    public int getValue() {
        return value;
    }
    //Advance counter 1
    public void click(){
        value = value + 1; 
    }
    //Reset counter value
    public void reset() {
        value = 0;
    }
}
