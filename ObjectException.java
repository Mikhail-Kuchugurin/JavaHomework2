package lesson2.task2;

public class ObjectException extends Exception {
    public void checkHomeAppArrays(){
        System.out.println("You have to add at least one appliance to the devices!");
        System.exit(1);
    }

}
