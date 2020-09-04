package passivemvc.controller;

import passivemvc.model.BusinessLogic;
import passivemvc.model.Model;

public class ControllerImpl implements Controller {
    private Model model;
    public  ControllerImpl(){
        model=new BusinessLogic();
    }
    @Override
    public void Print() {
        model.Print();
    }

    @Override
    public void Remove(String rem) {
        model.Remove(rem);
    }

    @Override
    public void SortByLength() {
        model.SortByLength();
    }


    @Override
    public void FindInRange(int start,int end) {
        model.FindInRange(start,end);
    }
}
