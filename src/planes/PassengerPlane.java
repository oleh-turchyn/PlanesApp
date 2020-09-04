package planes;

public class PassengerPlane extends Plane_Base {
    protected int seatplace;

//    public PassengerPlane(int seatplace) {
//        this.seatplace = seatplace;
//    }

    public PassengerPlane(String name, String model, int lenth, int consumption, int seatplace) {
        super(name, model, lenth, consumption);
        this.seatplace = seatplace;
    }

    public int getSeatplace() {
        return seatplace;
    }

    public void setSeatplace(int seatplace) {
        this.seatplace = seatplace;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "seatplace=" + seatplace +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", lenth=" + lenth +
                ", consumption=" + consumption +
                '}';
    }
}
