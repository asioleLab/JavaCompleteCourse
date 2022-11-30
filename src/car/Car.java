package car;

public class Car {

    private int doors;
    private int seats;
    private int weels;
    private String brand;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel= model.toLowerCase();
        if (validModel.equals("diablo")|| validModel.equals("glc")){
            this.model=model;
        }else {
            this.model="Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWeels() {
        return weels;
    }

    public void setWeels(int weels) {
        this.weels = weels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
