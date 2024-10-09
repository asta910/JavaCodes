package shapes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Insert shape \n2. Show all shapes \n3. Get count \n4. Delete Shape \n5. Get are by index \n6. Sort by area \n7. Exit..");
        System.out.print("select option :");
        int option = sc.nextInt();
        
        while (option != 7) {
            switch (option) {
                case 1:
                    boolean createRes = Operations.createShape();
                    if(createRes){
                        System.out.println("Operation is successfull..");
                    }else{
                        System.out.println("Operation failed..");
                    }
                    break;
                case 2:
                    System.out.println("All shapes are : ");
                    Operations.showAll();
                    break;
                case 3:
                    Operations.getShapeCount();
                    break;
                case 4:
                    boolean delRes = Operations.deleteShape();
                    if(delRes){
                        System.out.println("Deleted successfully..");
                    }else{
                        System.out.println("Operation failed.. ");
                    }
                    break;
                case 5:
                    Operations.getAreaIndex();
                    break;
                case 6:
                    boolean sortRes = Operations.sortByArea();
                    if (sortRes){
                        System.out.println("Sorted successfully..");
                    }else{
                        System.out.println("Operation failed..");
                    }
                    boolean print = sc.nextBoolean();
                    if(print){


                    }
                    break;
                case 7:
                    break;
                default:
                System.out.println("Select options only within given range");
                    break;
            }
            System.out.println("1. Insert shape \n2. Show all shapes \n3. Get count \n4. Delete Shape \n5. Get are by index \n6. Sort by area \n7. Exit..");
            System.out.print("select option :");
            option = sc.nextInt();
        }
        System.out.println("Thanl you....");

    }

}
