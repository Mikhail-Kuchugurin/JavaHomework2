package lesson2.task2;

import lesson2.task2.Kitchen.Maker;

/**
 * Created by Mikhail_Kuchugurin on 07-Jun-18.
 */
public class Fridge extends HomeAppliances implements TurnOn {
    public Fridge(int width, int height, int powerConsumption, String name) {
        super(width, height, powerConsumption, name);
    }
    Maker maker = Maker.BOSH;

    int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean isTurnOn() {
        boolean turnOn = true;
        return turnOn;
    }
}
