package main.infrastructure.energy;

public interface IUSP {

    public void determineChargeState();

    public void charge(ThreePinPlug plug);

    public int takeOut();

    Battery[] getBatteries();

    void setBatteries(Battery[] batteries);
}
