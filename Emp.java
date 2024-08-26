public class Emp{
  // Take 4 Variables of Emp Data With an Access Modifier Private
    // Prepare toString()
    private int n;
    private String p;
    private float f;
    private byte s;
  
    Emp(int n, String p, float f, byte s){
      this.n = n;
      this.p = p;
      this.f = f;
      this.s = s;
    }
    public String gets() {
      return n + " " + p + " " + f + " " + s;
    }
    public String toString() {
     return "int:" + n + "String:" + p + "float:" + f + " byte:" + s;
    }
  }
  public class actiom {
    public static void main(String[] args){
     Emp em = new Emp(15, "Hello", 18.4f, (byte) -123);
      System.out.println(em.gets());
      System.out.println(em);
        }
    
    
  }
  
