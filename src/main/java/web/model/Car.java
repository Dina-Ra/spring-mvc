package web.model;

public class Car {
    private String model;
    private String color;
    private int tankVolume;

    public Car() {}

    public Car (String model, String color, int tankVolume){
        this.model = model;
        this.color = color;
        this.tankVolume = tankVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", tankVolume=" + tankVolume +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
