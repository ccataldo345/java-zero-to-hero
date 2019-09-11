package ee.itcollage.level1;

public class Ferrari {

    private String name;

    public Ferrari() {
        this("Default Ferrari");
    }

    public Ferrari(String name) {
        this.name = name;
    }

    public void drive(){
        System.out.println("RRRRRRRRRRR");
    }

    public void stop(){
        System.out.println("EHEHEHEHEHEHE");
    }

    public void drift(){
        //todo add method body
        System.out.println("Drift-drift");
    }

    //todo create more methods
    public String name(){
        //todo add method body
        return "Ferrari F50";
    }

    @Override
    public String toString() {
        return name;
    }
}
