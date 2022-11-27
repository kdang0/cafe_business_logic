import java.util.ArrayList;
public class CafeUtil{
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i =1; i<numWeeks+1; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] anArray){
        double sum = 0.0;
        for(double itemVal : anArray){
            sum += itemVal;
        }
        return sum; 
    }

    public void displayMenu(ArrayList<String> menuItems){
        int counter = 0;
        for(String item: menuItems){
            System.out.println(counter + " " + item);
            counter++;
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        for(int i = 0; i < customers.size(); i++){
            System.out.println((i+1) + " " + customers.get(i));
        }
    }
}