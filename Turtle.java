public class Turtle{
// implements Animal Interface
  // Provide functionality for eat()
  
interface Animal {
    public void eat(String m, int total);
}

public class Turtle implements Animal {
    final int total = 12;
    String m;

    public void eat(String m, int total) {
        this.m = m;
        total = this.total;
    }

    public String toString() {
        return m + " of amount " + total + " has been eatten";
    }

    public static void main(String[] args) {
        Turtle obj = new Turtle();
        obj.eat("plants", 15);
        System.out.println(obj);

    }
}

}
