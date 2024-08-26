interface Animals {
    // Prepare a Functoin called Eat() with String Paramater
    public String hunt(String a);
}

class tiger implements Animals {

    public String hunt(String a) {
        return a;
    }
}

public class action {
    public static void main(String[] args) {
        tiger ts = new tiger();
        String n = ts.hunt("deer");
        System.out.println(n);
    }
}
