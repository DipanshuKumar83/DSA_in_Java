package Transport;

public class car extends vehicle{
    public int noOfDoor;
    public String transmissionTypes;

    car(String name,String model , int noOftypes , int noOfDoor, String transmissionTypes){
        super(name, model, noOftypes);
        this.noOfDoor=noOfDoor;
        this.transmissionTypes=transmissionTypes;
    }

        public void StartAC(){
            System.out.println("AC is start "+ name);


        }
    }

