package lesson2.task2;


import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Mikhail_Kuchugurin on 07-Jun-18.
 */
public class Kitchen {
    public enum Maker{
        //R means Russian, F means Foreign
        BOSH('R'),
        ELECTOLUX('F'),
        IKEA('F');
        private final char country;
        Maker(char country) {
            this.country = country;
        }
        public char getCountry(){
            return country;
        }
    }
    public static void main(String[] args) throws ParamsError {
        Fridge fridge = new Fridge(5, 15, 50, "Fridge");
        fridge.setVolume(120);
        fridge.isTurnOn();
        Cooker cooker = new Cooker(4, 20, 25, "Cooker");
        Dishwasher dishwasher = new Dishwasher(3, 35, 30, "Dishwasher");
        dishwasher.setWater(33);

        System.out.println(fridge.maker.getCountry());


        HomeAppliances[] devices = {fridge, cooker, dishwasher};
        //total power
        System.out.println("Total power: " + sumPower(devices));
        //sort
        System.out.println("Sort by Height: \n" + sortByHeight(devices));
        //find
        try {
            System.out.println("Result of finding: \n" + findByParams(5, 15, devices));
        } catch (ParamsError e) {
            System.out.println("Result of finding:");
            e.sadNews();
        }

    }

    public static String findByParams(int weight, int height, HomeAppliances[] devices) throws ParamsError {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getWidth() == weight && devices[i].getHeight() == height) {
                return String.valueOf(devices[i]);
            }
            if (weight <= 0 | height <= 0) {
                throw new ParamsError();
            }
        }
        return "Nothing found, sorry";
    }

    public static ArrayList<Integer> sortByHeight(HomeAppliances[] devices) {
        ArrayList<Integer> height = new ArrayList();
        for (int i = 0; i < devices.length; i++) {
            height.add(devices[i].getHeight());
        }
        Collections.sort(height);
        return height;

    }

    public static int sumPower(HomeAppliances[] devices) {
        int totalPower = 0;
        for (int i = 0; i < devices.length; i++) {
            totalPower += devices[i].getPowerConsumption();
        }
        return totalPower;
    }


}











































