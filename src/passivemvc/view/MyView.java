package passivemvc.view;

import passivemvc.controller.Controller;
import passivemvc.controller.ControllerImpl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyView {
    private Controller controller;
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static Scanner input = new Scanner(System.in);

    public MyView(){
        controller = new ControllerImpl();
        menu = new LinkedHashMap<>();
        menu.put("1","1 - print");
        menu.put("2","2 - remove");
        menu.put("3","3 - sort");
        menu.put("4","4 - find");
        menu.put("Q","Q - exit");

        methodsMenu = new LinkedHashMap<>();

        methodsMenu.put("1", this::pressButton1);
        methodsMenu.put("2", this::pressButton2);
        methodsMenu.put("3", this::pressButton3);
        methodsMenu.put("4", this::pressButton4);

    }

    private  void pressButton1(){
        controller.Print();
    }
    private  void pressButton2(){
        System.out.println("which plane will be deleted?");
        String remove=input.nextLine();
        controller.Remove(remove);
    }
    private  void pressButton3(){
        controller.SortByLength();
    }
    private  void pressButton4(){
        System.out.println("start of range:");
        int start = input.nextInt();
        System.out.println("end of range:");
        int end = input.nextInt();
        controller.FindInRange(start,end);
    }

    private void outputMenu(){
        System.out.println("\nMENU:");
        for(String str: menu.values()){
            System.out.println(str);
        }
    }

    public  void show(){
        String keyMenu;
        do{
            outputMenu();
            System.out.println("please select menu value:");
            keyMenu=input.nextLine().toUpperCase();
            try{
                methodsMenu.get(keyMenu).print();
            } catch (Exception e){

            }
        }while (!keyMenu.equals("Q"));
    }

}
