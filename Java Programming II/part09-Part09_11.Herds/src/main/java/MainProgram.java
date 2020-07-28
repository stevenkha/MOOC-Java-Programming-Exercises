

public class MainProgram {

    public static void main(String[] args) {
        //you can test the program here
        Herd herd = new Herd();
        herd.addToHerd(new Organism(58, 59));
        herd.addToHerd(new Organism(69, 69));
        herd.addToHerd(new Organism(2, 6));
        
        System.out.println(herd);
    }
}
