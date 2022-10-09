package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String name, int storageCapacity, int usedCapacity) {
        super(name, storageCapacity, usedCapacity);
    }

    @Override
    public void giveError() {
        System.out.println("Playback Error \n The text associated with this error code could not be found.");
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
    }

    @Override
    public void saveData() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
