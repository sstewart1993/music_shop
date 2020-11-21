import behaviours.ISell;
import instrument.Guitar;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<ISell> oldEquipment;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        oldEquipment = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<ISell> getOldEquipment() {
        return oldEquipment;
    }


    public void addEquipment(ISell iSell) {
        oldEquipment.add(iSell);
    }

    public int getEquipmentCount() {
        return oldEquipment.size();
    }

    public void removeEquipment(ISell iSell) {
        oldEquipment.remove(iSell);
    }

    public double addMoney(double amount) {
        return wallet += amount;
    }

    public double removeMoney(double amount) {
        return wallet -= amount;
    }
}
