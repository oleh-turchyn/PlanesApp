package passivemvc.model;

public class BusinessLogic implements Model {
    private Domain domain;

    public BusinessLogic() {
        domain = new Domain();
    }


    @Override
    public void Print() {
        domain.Print();
    }

    @Override
    public void Remove(String rem) {
        domain.Remove(rem);
    }

    @Override
    public void SortByLength() {
        domain.SortbyLenth();
    }

    @Override
    public void FindInRange(int start,int end) {
        domain.FindInRange(start,end);
    }
}
