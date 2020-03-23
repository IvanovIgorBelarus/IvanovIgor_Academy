package by.academy.main.Port.Ship.Deck.Container;

import static by.academy.main.Constans.*;

public class Container implements ContainerResult {
    private String form;
    private String size;
    private int height;
    private int density;

@Override
    public String getSize() {
        return this.size;
    }

    public Container(String form, String size, int height, int density){
        this.form=form;
        this.size=size;
        this.height=height;
        this.density=density;
    }



    private double getContainerForm() {
        switch (form) {
            case CONEFORM:
                return 0.3 * height * PI;
            case CYLINDERNFORM:
                return height * PI;
            case SQUAREFORM:
                return height;
            default: return 0;
        }

    }

    @Override
    public double getContainerWeight() {
        double containerVolume = 0;
        if (size.equals(BIGSIZE)) containerVolume=getContainerForm()*5;
        if (size.equals(SMALLSIZE)) containerVolume=getContainerForm()*2.5;
        return containerVolume*density;
    }

    @Override
    public String toString() {
        return "Container{" +
                "form='" + form + '\'' +
                ", size='" + size + '\'' +
                ", height=" + height +
                ", density=" + density +
                '}';
    }
}
