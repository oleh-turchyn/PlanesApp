package passivemvc.model;

import planes.CargoPlane;
import planes.PassengerPlane;
import planes.Plane_Base;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Domain {
    private ArrayList<Plane_Base> planes = new ArrayList<>();
    int start;
    int end;
    public Domain() {
        planes.add(cargo1);
        planes.add(passenger1);
        planes.add(passenger2);
        planes.add(cargo2);
    }

    public void addPlane(Plane_Base plane) {
        planes.add(plane);
    }

    public ArrayList<Plane_Base> getPlanes() {
        return this.planes;
    }

    public void setPlanes(ArrayList<Plane_Base> toSet) {
        this.planes = toSet;
    }

    Plane_Base cargo1 = new CargoPlane("name", "model", 12, 10, 200);
    Plane_Base passenger1 = new PassengerPlane("pass", "ruslan", 13, 22, 30);
    Plane_Base passenger2 = new PassengerPlane("pass2", "ruslan2", 6, 32, 30);
    Plane_Base cargo2 = new CargoPlane("name2", "model2", 33, 40, 200);

    public void Print() {
        planes.forEach(plane -> System.out.println(plane));
    }

    public void Remove(String rem) {



//        planes.stream().filter(e->!e.getName().equals(r)).collect(Collectors.toList());
//        planes.stream().map(obj->(Plane_Base)obj).collect(Collectors.toList());
        //        tour.setPasses((ArrayList<PassBase>) passes.stream().map(obj -> (PassBase)obj).collect(Collectors.toList()));
        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i).getName().equals(rem)) {
                planes.remove(i);
                return;
            }
        }
    }

    public void SortbyLenth() {
        planes.sort(Comparator.comparing(Plane_Base::getLenth));
    }

    public void FindInRange(int start,int end) {
        Predicate<Plane_Base> predicate = item -> item.getConsumption() > start && item.getConsumption() < end;
        List<Plane_Base> filtered = planes.stream().map(plane -> (Plane_Base) plane).filter(predicate).collect(Collectors.toList());
        if (filtered.size() != 0) {
            filtered.forEach(item -> System.out.println(item));
        } else {
            System.out.println("there isn't such tours");
        }
    }

}
