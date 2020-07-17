
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (!(compared instanceof Money)) {
            return false;
        }
        
        return this.euros < compared.euros || this.euros == compared.euros && this.cents < compared.cents;
    }
    
    public Money minus(Money decreaser) {
        int minusEuros = this.euros - decreaser.euros();
        int minusCents = this.cents - decreaser.cents();
        
        if (minusEuros < 0) {
            minusEuros = 0;
            minusCents = 0;
        }
        
        if (minusCents < 0) {
            minusCents = 100 - decreaser.cents();
            minusEuros--;
        }
        
        Money newMoney = new Money(minusEuros, minusCents);
        return newMoney;
    }

}
