package lesson2.task2;

/**
 * Created by Mikhail_Kuchugurin on 07-Jun-18.
 */
public class HomeAppliances {
    private int width;
    private int height;
    private int powerConsumption;
    private String name;

    public HomeAppliances(int width, int height, int powerConsumption, String name) {
        this.width = width;
        this.height = height;
        this.powerConsumption = powerConsumption;
        this.name = name;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Name:  " + getName() + ",   Weight:  " + getWidth() + ",   Height:  " + getHeight();

    }
}
