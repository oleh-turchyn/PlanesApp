package planes;

public class Plane_Base {
    protected String name="Default";
    protected String model="Default";
    protected int lenth;
    protected int consumption;

    public  Plane_Base(){
    }
    public Plane_Base(String name, String model, int lenth, int consumption) {
        this.name = name;
        this.model = model;
        this.lenth = lenth;
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", lenth=" + lenth +
                ", consumption=" + consumption +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLenth() {
        return lenth;
    }

    public void setLenth(int lenth) {
        this.lenth = lenth;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}
