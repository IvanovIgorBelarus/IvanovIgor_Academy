package by.academy.main.Port.Ship;

import by.academy.main.Port.Ship.Deck.Deck;

public class Ship implements ShipResult {

    private Deck deck;
    private Deck deck1;

    public Ship(Deck deck) {
        this.deck = deck;
    }


    public Ship(Deck deck, Deck deck1) {
        this.deck = deck;
        this.deck1 = deck1;
    }


    private double getSmallShipWeight() {
        return deck.getDeckWeight();
    }

    private double getBigShipWeight() {
        return deck.getDeckWeight() + deck1.getDeckWeight();
    }

    @Override
    public double getTotalMassShip() {
        double totalMassShip = 0;
        if ((deck != null) && (deck1 == null))
            totalMassShip = getSmallShipWeight();
        if ((deck != null) && (deck1 != null))
            totalMassShip = getBigShipWeight();
        return totalMassShip;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "deck=" + deck +
                ", deck1=" + deck1 +
                '}';
    }
}
