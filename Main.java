import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    boolean programRun = true;
    int selection;
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> serialN = new ArrayList<String>();
    ArrayList<Integer> price = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    while(programRun){
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      selection =  sc.nextInt();
      sc.nextLine();
      if(selection == 5) programRun = false;
      if(selection == 4){
        for(int i = 0; i < name.size(); i++){
          System.out.println(name.get(i) + ", " + serialN.get(i) + ", " + price.get(i));
        }
      }
      if(selection == 1){
        System.out.println("Enter the name:");
        name.add(sc.nextLine());
        System.out.println("Enter the serial number:");
        serialN.add(sc.nextLine());
        System.out.println("Enter the value in dollars (Whole numbers):");
        price.add(sc.nextInt());
      }
      if(selection == 2){
        System.out.println("Enter the serial number of the item to delete:");
        int index = serialN.indexOf(sc.nextLine());
        if(index < 0){
          System.out.println("**serial number not found**");
        } else{
          name.remove(index);
          serialN.remove(index);
          price.remove(index);
        }
      }
      if(selection == 3){
        System.out.println("Enter the serial number of the item to change:");
        int index = serialN.indexOf(sc.nextLine());
        if(index < 0){
          System.out.println("**serial number not found**");
        } else{
          System.out.println("Enter the new name:");
          name.set(index, sc.nextLine());
          System.out.println("Enter the new value in dollars (Whole number)");
          price.set(index, sc.nextInt());
        }
      }
    }
    
  }
}