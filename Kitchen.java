package lesson2.task2;


import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Mikhail_Kuchugurin on 07-Jun-18.
 */
public class Kitchen {
    public enum Producer{
        //R means Russian, F means Foreign
        BOSH('R'),
        ELECTOLUX('F'),
        IKEA('F');
        private final char country;
        Producer(char country) {
            this.country = country;
        }
        public char getCountry(){
            return country;
        }
    }


    public static void main(String[] args) throws ParamsException {
        Fridge fridge = new Fridge(5, 15, 50, "Fridge"){
            //I guess we have to turn off the fridge
            @Override
            public boolean isTurnOn() {
                boolean turnOn = false;
                return turnOn;
            }

        };
        fridge.setVolume(120);
        fridge.isTurnOn();
        Cooker cooker = new Cooker(4, 20, 25, "Cooker");
        Dishwasher dishwasher = new Dishwasher(3, 35, 30, "Dishwasher");
        dishwasher.setWater(33);
        System.out.println(cooker.producer.getCountry());





        HomeAppliances[] devices = {fridge, cooker, dishwasher};
        try {
            System.out.println("Number of devices: " + countOfDevices(devices));

        } catch (ObjectException e) {
            e.checkHomeAppArrays();
        }
        //total power
        System.out.println("Total power: " + sumPower(devices));
        //sort
        System.out.println("Sort by Height: \n" + Filters.sortByHeight(devices));
        //find
        try {
            System.out.println("Result of finding: \n" + Filters.findByParams(5, 15, devices));
        } catch (ParamsException e) {
            System.out.println("Result of finding:");
            e.sadNews();
        }



    }

    public static class Filters{
        public static String findByParams(int weight, int height, HomeAppliances[] devices) throws ParamsException {
            for (int i = 0; i < devices.length; i++) {
                if (devices[i].getWidth() == weight && devices[i].getHeight() == height) {
                    return String.valueOf(devices[i]);
                }
                if (weight <= 0 | height <= 0) {
                    throw new ParamsException();
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

    }
    @MethodClarify
    public static int sumPower(HomeAppliances[] devices) {
        int totalPower = 0;
        for (int i = 0; i < devices.length; i++) {
            totalPower += devices[i].getPowerConsumption();
        }
        return totalPower;
    }

    public static int countOfDevices(HomeAppliances[] devices) throws ObjectException{
        if (devices.length == 0){
            throw new ObjectException();
        }
        return devices.length;
    }






}











































