package cars;
  //class car
public class car {
  //Private Variables(Encapsulation)
private String name;
private String c_name;
private int id;
private int m_year;
private double price;
private int qty;

  //Setter methods 'String'
public void setName(String n){
    this.name = n;
}
public void setC_Name(String c){
    this.c_name = c;
}
  //Setter methods  'int'
public void setID(int id){
    this.id = id;
}
 public void setM_Year(int year){
     if(year > 2005 && year <= 2026)
        this.m_year = year;
     else
         System.out.println("Invalid Input(Not Available)");
 }
 public void setQty(int qty){    
    if(qty > 0 && qty <= 3)
        this.qty = qty;
    else
     System.out.println("Out of Stock!");
} 
  //Setter methods 'double'
public void setPrice(double p){
    this.price = p;
}

  //Getter methods 'String'
public String getName(){
    return name;
}
public String getC_Name(){
    return c_name;
}
  //Getter methods 'int'
public int getID(){
    return id;
}
public int getM_Year(){
    return m_year;
}
public int getQty(){
    return qty;
}
  //Getter methods 'double'
public double getPrice(){
    return price;
}
public double getT_Price(){
   return this.price * this.qty;
}
}

import java.util.Scanner;
  //Main class
public class Cars {

    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){  
        //Creating object of car class
        car c = new car();
        //Taking User Input
           System.out.println("Enter Car Name :");
           String name = sc.nextLine();
           System.out.println("Enter Company Name :");
           String c_name = sc.nextLine();
           System.out.println("Enter ID :");
           int id = sc.nextInt();
           System.out.println("Enter Model Year :");
           int M_Year = sc.nextInt();
           System.out.println("Enter Quantity :");
           int qty = sc.nextInt();
        // Setting values  (Using Setter Method)
        c.setName(name);
        c.setC_Name(c_name);
        c.setID(id);
        c.setM_Year(M_Year);
        c.setQty(qty);
        c.setPrice(250000);
        
        System.out.println("\n---Car Detals---");
        {
        //Displaying Car Details (Using Getter Method)
        System.out.println("\nName :" +c.getName());
        System.out.println("Company Name :" +c.getC_Name());
        System.out.println("ID :" +c.getID());
        System.out.println("Model :" +c.getM_Year());
        System.out.println("Quantity :" +c.getQty());
        System.out.println("Price :" +c.getPrice());
        
        double total = c.getT_Price();
        System.out.println("Total Price :" + total);
        
      }
    }
  }             
}
