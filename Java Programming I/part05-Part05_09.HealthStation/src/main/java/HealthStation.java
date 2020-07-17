
public class HealthStation {
    private int weighCounter;
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighCounter++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
       int test = person.getWeight();
       person.setWeight(test + 1);
    }
    
    public int weighings() {
        return this.weighCounter;
    }

}
