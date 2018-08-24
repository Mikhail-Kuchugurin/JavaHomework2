package lesson2.task2;

/**
 * Created by Mikhail_Kuchugurin on 07-Jun-18.
 */
public class Cooker extends HomeAppliances implements TurnOn {
    public Cooker(int width, int height, int powerConsumption, String name) {
        super(width, height, powerConsumption, name);
    }
    Kitchen.Maker maker = Kitchen.Maker.IKEA;


    public void isHot(){
        System.out.println("Can be hot!");
    }

    @Override
    public boolean isTurnOn() {
        boolean turnOn = true;
        return turnOn;
    }
}
