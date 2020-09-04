package passivemvc.model;

public interface Model {
    public void Print();
    public void Remove(String rem);
    public void SortByLength();
    public void FindInRange(int start,int end);
}
