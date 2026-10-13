package Transport;

public class vehicle {
    public String name;
    public String model;
    public int noOftypes;

    vehicle(){
        String  name;
        String model;
        int noOftypes ;
    }

    vehicle(String name, String model , int noOftypes){
        this.name=name;
        this.model=model;
        this.noOftypes=noOftypes;
    }
    void engineStart(){
        System.out.println("Engine is starting "+ name
                +model);
    }
    void engineStop(){
        System.out.println("Engine is Stoping "+ name
                +model);
    }
}
