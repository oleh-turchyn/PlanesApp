package passivemvc.controller;

public interface Controller {
    public void Print();
    public void Remove(String rem);
    public void SortByLength();
    public void FindInRange(int start,int end);
}
