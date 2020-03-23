package by.academy.main.Port.Ship.Deck;

import by.academy.main.Port.Ship.Deck.Container.Container;
import by.academy.main.Port.Ship.Deck.Container.ContainerResult;
import java.util.Arrays;
import static by.academy.main.Constans.*;

public class Deck {
    private int containerNumber;
    private ContainerResult[] container = new Container[4];

    public Deck(int containerNumber, String[] form, String[] size, int[] height, int[] density) {
        this.containerNumber = containerNumber;
        for (int i = 0; i < containerNumber; i++)
            container[i] = new Container(form[i], size[i], height[i], density[i]);
    }

    private String getDeckSize() {
        int counterBig = 0;
        int counterSmall = 0;
        String deckSize = "";
        for (int i = 0; i < containerNumber; i++) {
            if (container[i].getSize().equals(BIGSIZE)) counterBig++;
            if (container[i].getSize().equals(SMALLSIZE)) counterSmall++;
        }
        if ((counterBig == 2) && (containerNumber == 2)) deckSize = BIGSIZE;
        if ((counterSmall == 4) && (containerNumber == 4)) deckSize = SMALLSIZE;
        return deckSize;


    }


    public double getDeckWeight() {
        double result = 0;
        if (getDeckSize().equals(BIGSIZE))
            result = container[0].getContainerWeight() + container[1].getContainerWeight();
        if (getDeckSize().equals(SMALLSIZE))
            for (int i = 0; i < containerNumber; i++)
                result += container[i].getContainerWeight();
        return result;


    }

    @Override
    public String toString() {
        return "Deck{" +
                "containerNumber=" + containerNumber +
                ", container=" + Arrays.toString(container) +
                '}';
    }
}


