public class Vehicle {
    public Details[] details;
    protected int counter = 0;

    Vehicle() {
        details = new Details[10];
        details[counter] = new Case();
        counter++;
        details[counter] = new Engine();
        counter++;
        details[counter] = new Transmission();
        counter++;
        details[counter] = new Wheel();
        counter++;
    }

    protected double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < details.length; i++) {
            if (details[i] != null )
         totalWeight = totalWeight + details[i].weight;
        }
        return totalWeight;
    }

    protected double getPrice() {
        double totalPrice = 0;
        for (int i = 0; i < details.length; i++) {
            if (details[i] != null )
                totalPrice = totalPrice + details[i].cost;
        }
        return totalPrice;
    }

}