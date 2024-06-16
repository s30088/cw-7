public class Car implements Comparable<Car> {
    private String model;
    private Integer productionYear;

    public Car(String model, Integer productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    @Override
    public int compareTo(Car o) {
        return productionYear.compareTo(o.productionYear);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
