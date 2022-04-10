public class Zoo {
    private String name;
    private int age;
    protected String origin;

    //constructors

    public Zoo(int a, String b, String c) {
        this.age = a;
        this.name = b;
        this.origin =c;
    }
    //getters
    public int get_age(){
        return this.age;
    }
    public String get_name(){
        return this.name;
    }
    public String get_origin(){
        return this.origin;
    }
}

class Zebra extends Zoo {

    public Zebra(int a, String b) {
        super(a, b, "Africa");
    }

    public String display(){
        return "Name: "+ this.get_name() + "\nAge: "+this.get_age()+"\nOrigin: "+this.get_origin();
    }
}
