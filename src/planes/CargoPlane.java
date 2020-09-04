package planes;

public class CargoPlane extends Plane_Base {
    protected int capacity;

    public CargoPlane(String name, String model, int lenth, int consumption, int capacity) {
        super(name, model, lenth, consumption);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", lenth=" + lenth +
                ", consumption=" + consumption +
                '}';
    }
}
