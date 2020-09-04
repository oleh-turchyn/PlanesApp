import passivemvc.view.MyView;

public class Main {

    public static void main(String[] args) {
        // write your code here


//        Plane_Base cargo1=new CargoPlane("name","model",12,10,200);
//        Plane_Base passenger1=new PassengerPlane("pass","ruslan",13,22,30);
//        Plane_Base passenger2=new PassengerPlane("pass2","ruslan2",6,32,30);
//        Plane_Base cargo2=new CargoPlane("name2","model2",33,40,200);
//
//        Aviacompany avia1=new Aviacompany();
//        avia1.addPlane(cargo1);
//        avia1.addPlane(passenger1);
//        avia1.addPlane(passenger2);
//        avia1.addPlane(cargo2);
//        Scanner s=new Scanner(System.in);
//
//        showMenu();
//        while (true){
//            int choice=getInput();
//            switch (choice){
//                case 1:
//                    avia1.Print();
//                    showMenu();
//                    break;
//                case 2:
//                    avia1.SortbyLenth();
//                    avia1.Print();
//                    showMenu();
//                    break;
//                case 3:
//                    avia1.Remove();
//                    avia1.Print();
//                    showMenu();
//                    break;
//                case 4:
//                    try {
//
//                    }catch (Exception e){
//                        e.getMessage();
//                    }
//                    System.out.println("start");
//                    int st=s.nextInt();
//                    System.out.println("end");
//                    int end=s.nextInt();
//                    avia1.FindInRange(st,end);
//                    showMenu();
//                    break;
//                case 0:
//                    System.exit(0);
//                default:
//                    System.out.println("Wrong Command");
//            }
//
//        }
//
//
//    }
//    public static void showMenu(){
//        System.out.println("Menu Options:" +
//                "\n1.Print" +
//                "\n2.Sort by distance" +
//                "\n3.Remove" +
//                "\n4.Find in range" +
//                "\n0.Exit");
//        System.out.print("Please select an option from 1-5\r\n");
//    }
//
//    private static int getInput(){
//        Scanner sc=new Scanner(System.in);
//        int choice=-1;
//        while (choice<0||choice>4){
//            try {
//                choice=Integer.parseInt(sc.nextLine());
//            }catch (NumberFormatException e){
//                System.out.println("Invalid value please try again");
//            }
//        }
//        return choice;
//    }

        new MyView().show();
    }
}
