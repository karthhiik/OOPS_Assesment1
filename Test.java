import java.util.*;
 class Emp{
private int p;
private String n;

   private void sets(int p, String n){
     this.n = p;
     this.p = n;
   }
   public String gets() {
     return "gets and sets values integer:" + p +" String:"  + n;
   }
   Emp(String n, int p){
     this.n = n;
     this.p = p;
   }

   public String toString(){
     return n + " " + p;
   }
 }

public class Test{
// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the values for consturctors First string after number");
        String n = sc.next();
        int s = sc.nextInt();

     Emp obj = new Emp(n,s);
    System.out.println("CONSTRUCTOR VALUES:" + obj);
    obj.sets(15, "world");
    System.out.println(obj.gets());
  }
                
  
  
}
