/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredth;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredth = new ClockHand(100);
    }
    
    public String toString() {
        return this.seconds + ":" + this.hundredth;
    }
    
    public void advance() {
        this.hundredth.advance();
        if (this.hundredth.value() == 0) {
            this.seconds.advance();
        }
    }
}
