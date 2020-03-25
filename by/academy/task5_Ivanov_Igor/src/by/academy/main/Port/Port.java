package by.academy.main.Port;

import by.academy.main.Port.Ship.Ship;
import by.academy.main.Port.Ship.ShipResult;

import java.util.Arrays;

public class Port {
    private int numberOfShip;
    private ShipResult[] ship = new Ship[10];

    public Port(int numberOfShip, ShipResult[] ship) {
        this.numberOfShip = numberOfShip;
        for (int i = 0; i < numberOfShip; i++)
            this.ship[i] = ship[i];
    }

    public int getNumberOfShip() {
        return numberOfShip;
    }

    public double getPortMass() {
        double portMass = 0;
        for (int i = 0; i < numberOfShip; i++)
            portMass += ship[i].getTotalMassShip();
        return portMass;
    }

    @Override
    public String toString() {
        return "Port{" +
                "numberOfShip=" + numberOfShip +
                ", ship=" + Arrays.toString(ship) +
                '}';
    }
}
