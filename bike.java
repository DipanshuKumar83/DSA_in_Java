package Transport;

public class bike extends vehicle{
    public String transmissiontype;
    bike(String name , String model,int noOftypes ,String transmissiontype){
        this.transmissiontype=transmissiontype;
    }
    public void Service(){
        System.out.println("Service is Done"+name);
    }
}
