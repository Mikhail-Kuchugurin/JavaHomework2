package lesson2.task2;

/**
 * Created by Mikhail_Kuchugurin on 07-Jun-18.
 */
public class Dishwasher extends HomeAppliances implements TurnOn {
    public Dishwasher(int width, int height, int powerConsumption, String name) {
        super(width, height, powerConsumption, name);
    }
    Kitchen.Maker maker = Kitchen.Maker.ELECTOLUX;

    int water;

    public void setWater(int water) {
        this.water = water;
    }

    @Override
    public boolean isTurnOn() {
        boolean turnOn = true;
        return turnOn;
    }
}
