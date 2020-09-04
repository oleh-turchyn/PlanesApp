import planes.Plane_Base;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Aviacompany {

    private ArrayList<Plane_Base>planes=new ArrayList<>();

    public void addPlane(Plane_Base plane){
        planes.add(plane);
    }
    public  ArrayList<Plane_Base>getPlanes(){
        return this.planes;
    }
    public void setPlanes(ArrayList<Plane_Base>toSet){
        this.planes=toSet;
    }


    public void Print(){
        planes.forEach(plane -> System.out.println(plane));
    }
    Scanner s=new Scanner(System.in);
    public void Remove(){

        System.out.println("which plane will be deleted?");
        String r=s.next();
//        planes.stream().filter(e->!e.getName().equals(r)).collect(Collectors.toList());
//        planes.stream().map(obj->(Plane_Base)obj).collect(Collectors.toList());
        //        tour.setPasses((ArrayList<PassBase>) passes.stream().map(obj -> (PassBase)obj).collect(Collectors.toList()));
        for(int i=0;i<planes.size();i++){
            if(planes.get(i).getName().equals(r)){
                planes.remove(i);
                return;
            }
        }
    }

    public void SortbyLenth(){
        planes.sort(Comparator.comparing(Plane_Base::getLenth));
    }

    public void FindInRange(int start,int end){
        Predicate<Plane_Base>predicate=item->item.getConsumption()>start&&item.getConsumption()<end;
        List<Plane_Base>filtered=planes.stream().map(plane->(Plane_Base)plane).filter(predicate).collect(Collectors.toList());
        if(filtered.size()!=0){
            filtered.forEach(item-> System.out.println(item));
        }
        else {
            System.out.println("there isn't such tours");
        }
    }
}
