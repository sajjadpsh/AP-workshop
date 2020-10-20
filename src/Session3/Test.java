package Session3;

import Session3.Clock.ClockDisplay;

public class Test {
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay(0,0,0);
        while (true)
        clockDisplay.timeTick();
    }
}
