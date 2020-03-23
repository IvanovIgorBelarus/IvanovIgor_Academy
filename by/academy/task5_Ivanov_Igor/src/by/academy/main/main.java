package by.academy.main;

import by.academy.main.Port.Port;
import by.academy.main.Port.Ship.Deck.Deck;
import by.academy.main.Port.Ship.Ship;
import by.academy.main.Port.Ship.ShipResult;


import static by.academy.main.Constans.*;

public class main {
    public static void main(String[] args) {

        Ship ship = new Ship(new Deck(2, new String[]{CONEFORM, SQUAREFORM}, new String[]{BIGSIZE, BIGSIZE}, new int[]{50, 20}, new int[]{2000, 1000}));
        Port port = new Port(4, new ShipResult[]{
                new Ship(new Deck(2, new String[]{CONEFORM, SQUAREFORM}, new String[]{BIGSIZE, BIGSIZE}, new int[]{50, 20}, new int[]{2000, 1000})),
                new Ship(new Deck(2, new String[]{CONEFORM, SQUAREFORM}, new String[]{BIGSIZE, BIGSIZE}, new int[]{50, 20}, new int[]{2000, 1000})),
                new Ship(new Deck(2, new String[]{CONEFORM, SQUAREFORM}, new String[]{BIGSIZE, BIGSIZE}, new int[]{50, 20}, new int[]{2000, 1000})),
                new Ship(new Deck(2, new String[]{CONEFORM, SQUAREFORM}, new String[]{BIGSIZE, BIGSIZE}, new int[]{50, 20}, new int[]{2000, 1000}))
        });
        System.out.println("total mass of water is "+port.getPortMass()/1000+" tons, number of ships: "+port.getNumberOfShip());



    }
}
