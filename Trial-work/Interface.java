interface WaterBottleInterface {

    String colour = "Purple";


    void fillUp();
    void pourOut();
}

public class Interface implements WaterBottleInterface {

    public static void main(String[] args) {
        System.out.println(colour);
        // Add your code here
        WaterBottleInterface ex = new Interface();
        ex.fillUp();
    }

    public void fillUp();

    @Override
    public void pourOut() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pourOut'");
    }
         System.out.println("Filling up the tank");
    }
}



