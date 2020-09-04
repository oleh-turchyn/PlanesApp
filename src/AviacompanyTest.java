import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import planes.CargoPlane;
import planes.PassengerPlane;
import planes.Plane_Base;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AviacompanyTest {
    Aviacompany a=new Aviacompany();
    Plane_Base cargo1;
    Plane_Base passenger1;
    Plane_Base passenger2;
    Plane_Base cargo2;

    @Before
    public void setUp() {
        cargo1 = new CargoPlane("name", "model", 12, 10, 200);
        passenger1 = new PassengerPlane("pass", "ruslan", 13, 22, 30);
        passenger2 = new PassengerPlane("pass2", "ruslan2", 6, 32, 30);
        cargo2 = new CargoPlane("name2", "model2", 33, 40, 200);
        a.addPlane(cargo1);
        a.addPlane(passenger1);
        a.addPlane(passenger2);
        a.addPlane(cargo2);
    }

    @Test
    public void getPlanes() {

        List<Plane_Base>expected=a.getPlanes();

        List<Plane_Base> actual=new ArrayList<>();
        actual.add(cargo1);
        actual.add(passenger1);
        actual.add(passenger2);
        actual.add(cargo2);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getPlanes_NO_NULL(){
        List<Plane_Base>expected=a.getPlanes();
        Assert.assertNotNull(expected);
    }

    @Test
    public void addPlane(){
        //cargo1=new CargoPlane("name","model",12,10,200);
        a.addPlane(cargo1);

        ArrayList<Plane_Base>planes=a.getPlanes();
        String expected="CargoPlane{capacity=200, name='name', model='model', lenth=12, consumption=10}";
        String result=planes.get(planes.size()-1).toString();
        assertEquals(result,expected);
    }

    @Test
    public void SortbyLenth(){
        Aviacompany expected=new Aviacompany();
        expected.addPlane(a.getPlanes().get(2));
        expected.addPlane(a.getPlanes().get(0));
        expected.addPlane(a.getPlanes().get(1));
        expected.addPlane(a.getPlanes().get(3));

        Aviacompany actual=new Aviacompany();
        actual.setPlanes(a.getPlanes());
        actual.SortbyLenth();
        assertEquals(expected.getPlanes(),actual.getPlanes());

    }

    @Test
    public void FindInRange(){

    }
    //Tour expected=new Tour();
    //
    //        expected.addPass(list.getPasses().get(3));
    //        expected.addPass(list.getPasses().get(2));
    //        expected.addPass(list.getPasses().get(0));
    //        expected.addPass(list.getPasses().get(5));
    //        expected.addPass(list.getPasses().get(1));
    //        expected.addPass(list.getPasses().get(4));
    //
    //        SortByPrice sortByPrice = new SortByPrice(list);
    //        sortByPrice.execute();
    //        Tour actual=sortByPrice.getTour();
    //        assertEquals(expected.getPasses(),actual.getPasses());
}