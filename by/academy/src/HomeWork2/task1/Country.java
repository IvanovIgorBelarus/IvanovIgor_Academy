package HomeWork2.task1;

public enum Country implements ICountries {
    RUSSIA(143420300, 17075200),
    CANADA (3280500,9976140),
    USA(295734100,9629091),
    CHINA(1306313800,9596960),
    BRAZIL(186112800,8511965),
    AUSTRALIA(20090400,7686850),
    INDIA(1080264400,3287590),
    ARGENTINA(39537900,2766890),
    KAZAKHSTAN(15185000,2717300),
    SUDAN(40187500,2505810);
    private final int population;
    private final int area;
    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public int getArea() {
        return area;
    }

    Country(int population, int area) {
        this.population=population;
        this.area=area;
    }

    public static void main(String[] args) {
        for (Country p:Country.values()) {
            System.out.println(p+"( population: "+p.population+", area: "+p.area+" );");

        }
    }
}
