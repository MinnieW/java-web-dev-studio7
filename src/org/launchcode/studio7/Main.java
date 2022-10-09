package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("CD example", 700, 350);
        DVD dvd = new DVD("DVD example", 4700, 1450);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.giveError();
        dvd.giveError();

        cd.readData();
        dvd.readData();

        cd.saveData();
        dvd.saveData();

        dvd.spinDisc();
        cd.spinDisc();

        System.out.println(cd.writeData(500));
        System.out.println(dvd.writeData(2000));


    }
}
