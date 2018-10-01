package lesson2.task2;

/**
 * Created by Mikhail_Kuchugurin on 07-Jun-18.
 */
public class Dishwasher extends HomeAppliances implements TurnOnElectricity {
    public Dishwasher(int width, int height, int powerConsumption, String name) {
        super(width, height, powerConsumption, name);
    }
    Kitchen.Producer producer = Kitchen.Producer.ELECTOLUX;

    int minVolumeOfWaterForWashing;

    public void setWater(int minVolumeOfWaterForWashing) {
        this.minVolumeOfWaterForWashing = minVolumeOfWaterForWashing;
    }

    @Override
    public boolean isTurnOn() {
        boolean turnOn = true;
        return turnOn;
    }
}
